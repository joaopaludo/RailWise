/*
 * Relatório 2
 * 
 * Relação de viagens(origem, destino, data e horário) realizadas em 2023. Ordene o relatório da
 * viagem mais antiga para a mais recente;
 */

create or replace view relatorio_viagens_2023 as
select origem.tx_nome || ' - Cidade: ' || origem.tx_cidade as origem,
	   destino.tx_nome || ' - Cidade: ' || destino.tx_cidade as destino,
	   v.dt_inicio as saida,
	   v.dt_fim as chegada
from viagem v
inner join viagemrota vr on vr.cd_viagem = v.id_viagem
inner join rota r on r.id_rota = vr.cd_rota
inner join estacao origem on origem.id_estacao = r.cd_estacaoorigem
inner join estacao destino on destino.id_estacao = r.cd_estacaodestino
where extract('year' from v.dt_inicio) = 2023
order by dt_inicio asc;
