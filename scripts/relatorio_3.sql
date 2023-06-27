SELECT count(destino.id_estacao) qtd_viagens, destino.tx_nome estacao, destino.tx_cidade cidade
FROM viagem v
INNER JOIN rota r ON r.id_rota = v.cd_rota
INNER JOIN estacao destino ON destino.id_estacao = r.cd_estacaodestino
GROUP BY destino.id_estacao 
ORDER BY 1
LIMIT 10;