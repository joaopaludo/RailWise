/*
 * Relatório 3
 * 
 * Relação dos top 10 destinos com mais cargas transportadas em 2022
 */

create or replace view relatorio_destinos_com_mais_cargas_vw as
select count(c.id_carga) quantidade_cargas,
	   destino.tx_nome || ' - ' || destino.tx_cidade || '/' || destino.tx_uf destino
from carga c
inner join viagemvagao vv on vv.cd_carga = c.id_carga
inner join viagem v on v.id_viagem = vv.cd_viagem
inner join viagemrota vr on vr.cd_viagem = v.id_viagem
inner join rota r on r.id_rota = vr.cd_rota
inner join estacao destino on destino.id_estacao = r.cd_estacaodestino
where extract('year' from v.dt_inicio) = 2022
group by destino.id_estacao
order by 1 desc
limit 10;
