CREATE OR REPLACE FUNCTION public.distancia_minima_estacoes(origem int4, destino int4)
	RETURNS numeric
	LANGUAGE sql
AS $body$
	WITH RECURSIVE rota_distancia AS (
		SELECT r.id_rota, r.cd_estacaoorigem, r.cd_estacaodestino, vl_distancia::NUMERIC, 0 AS lvl, ARRAY[r.cd_estacaoorigem] AS estacoes
		FROM rota r
		WHERE r.cd_estacaoorigem = origem
		
		UNION ALL
		
		SELECT r2.id_rota, rd.cd_estacaoorigem, r2.cd_estacaodestino, rd.vl_distancia + r2.vl_distancia::NUMERIC AS vl_distancia, rd.lvl + 1 AS lvl, rd.estacoes || r2.cd_estacaoorigem AS estacoes
		FROM rota_distancia rd
		INNER JOIN rota r2 ON r2.cd_estacaoorigem = rd.cd_estacaodestino AND NOT r2.cd_estacaoorigem = ANY(rd.estacoes)
	)
	SELECT rd.vl_distancia FROM rota_distancia rd
	WHERE rd.cd_estacaoorigem = origem AND rd.cd_estacaodestino = destino
	ORDER BY rd.vl_distancia ASC, rd.lvl ASC
	LIMIT 1;
$body$
;