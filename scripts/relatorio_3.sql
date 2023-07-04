/*
 * Relação dos top 10 destinos com mais cargas transportadas em 2022;
 */

SELECT count(c.id_carga) qtd_carga, destino.tx_nome estacao, destino.tx_cidade cidade
FROM carga c
INNER JOIN viagemvagao vv ON vv.cd_carga = c.id_carga 
INNER JOIN viagem v ON v.id_viagem = vv.cd_viagem 
INNER JOIN rota r ON r.id_rota = v.cd_rota 
INNER JOIN estacao destino ON destino.id_estacao = r.cd_estacaodestino
WHERE EXTRACT('year' FROM v.dt_momentosaida) = 2022
GROUP BY destino.id_estacao
ORDER BY 1 DESC
LIMIT 10;