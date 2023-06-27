SELECT origem.tx_nome estacao_origem, origem.tx_cidade cidade_origem,
destino.tx_nome estacao_destino, destino.tx_cidade cidade_destino, 
v.dt_momentosaida data_saida, v.dt_momentochegada data_chegada
FROM viagem v
INNER JOIN rota r ON r.id_rota = v.cd_rota
INNER JOIN estacao origem ON origem.id_estacao = r.cd_estacaoorigem 
INNER JOIN estacao destino ON destino.id_estacao = r.cd_estacaodestino
WHERE EXTRACT('year' FROM v.dt_momentosaida) = 2023;