-- Função para buscar o array das rotas
CREATE OR REPLACE FUNCTION public.rota_minima_estacoes(origem int4, destino int4)
	RETURNS int4[]
	LANGUAGE sql
AS $function$
	WITH RECURSIVE rota_distancia AS (
		SELECT r.id_rota, r.cd_estacaoorigem, r.cd_estacaodestino, vl_distancia::NUMERIC, 0 AS lvl, ARRAY[r.cd_estacaoorigem] AS estacoes, ARRAY[r.id_rota] AS rotas
		FROM rota r
		WHERE r.cd_estacaoorigem = origem
		
		UNION ALL
		
		SELECT r2.id_rota, rd.cd_estacaoorigem, r2.cd_estacaodestino, rd.vl_distancia + r2.vl_distancia AS vl_distancia, rd.lvl + 1 AS lvl, rd.estacoes || r2.cd_estacaoorigem AS estacoes, rd.rotas || r2.id_rota AS rotas
		FROM rota_distancia rd
		INNER JOIN rota r2 ON r2.cd_estacaoorigem = rd.cd_estacaodestino AND NOT r2.cd_estacaoorigem = ANY(rd.estacoes)
	)
	SELECT rd.rotas FROM rota_distancia rd
	WHERE rd.cd_estacaoorigem = origem AND rd.cd_estacaodestino = destino
	ORDER BY rd.vl_distancia ASC
	LIMIT 1;
$function$
;

-- Procedure para cadastrar as rotas
CREATE OR REPLACE PROCEDURE public.criar_rotas_viagem(id_viagem int4, origem int4, destino int4)
	LANGUAGE plpgsql
AS $procedure$
DECLARE
	rotas int4[];

	BEGIN
	SELECT rota_minima_estacoes(origem, destino) INTO rotas;

	FOR rota IN array_lower(rotas, 1)..array_upper(rotas, 1) LOOP 
		INSERT INTO viagemrota (cd_rota, cd_viagem) VALUES (rotas[rota], id_viagem);
	END LOOP;
	
	END;
$procedure$
;