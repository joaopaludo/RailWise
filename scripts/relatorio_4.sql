SELECT v.id_viagem, SUM(r.vl_distancia * v2.vl_custoporkm) custo_total, TO_CHAR(v.dt_momentosaida, 'DD-MM-YYYY') data_viagem
FROM viagem v
INNER JOIN rota r ON r.id_rota = v.cd_rota
INNER JOIN viagemvagao v2 ON v2.cd_viagem = v.id_viagem
WHERE EXTRACT('Year' FROM v.dt_momentosaida) BETWEEN 2010 AND 2021
GROUP BY v.id_viagem
HAVING SUM(r.vl_distancia * v2.vl_custoporkm) > 4500
ORDER BY custo_total;