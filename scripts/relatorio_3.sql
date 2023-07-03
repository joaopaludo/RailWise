/*
 * Relação dos top 10 destinos com mais cargas transportadas em 2022;
 */

SELECT count(destino.id_estacao) qtd_viagens, SUM(v3.vl_peso) qtd_carga, destino.tx_nome estacao, destino.tx_cidade cidade
FROM viagem v
INNER JOIN rota r ON r.id_rota = v.cd_rota
INNER JOIN estacao destino ON destino.id_estacao = r.cd_estacaodestino
INNER JOIN viagemvagao v2 ON v2.cd_viagem = v.id_viagem 
INNER JOIN vagao v3 ON v3.id_vagao = v2.cd_vagao 
WHERE EXTRACT('year' FROM v.dt_momentosaida) = 2022
GROUP BY destino.id_estacao 
ORDER BY 1 DESC
LIMIT 10;