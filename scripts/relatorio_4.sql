/*
 * Relação das viagens, a quantidade de carga total e o valor total(R$). Relacionar somente viagens com valores totais superiores a R$ 4500, realizadas entre 2010 e 2021. Ordene o relatório da viagem com maior valor para a viagem com menor valor.
 */

SELECT v.id_viagem, SUM(v3.vl_peso) qtd_carga, SUM(r.vl_distancia * v2.vl_custoporkm) custo_total, TO_CHAR(v.dt_momentosaida, 'DD-MM-YYYY') data_viagem
FROM viagem v
INNER JOIN rota r ON r.id_rota = v.cd_rota
INNER JOIN viagemvagao v2 ON v2.cd_viagem = v.id_viagem
INNER JOIN vagao v3 ON v3.id_vagao = v2.cd_vagao
WHERE EXTRACT('Year' FROM v.dt_momentosaida) BETWEEN 2010 AND 2021
GROUP BY v.id_viagem
HAVING SUM(r.vl_distancia * v2.vl_custoporkm) > 4500
ORDER BY custo_total DESC;