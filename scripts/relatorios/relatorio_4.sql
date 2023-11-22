/*
 * Relatório 4
 * 
 * Relação das viagens, a quantidade de carga total e o valor total(R$). Relacionar somente viagens com valores
 * totais superiores a R$ 4500, realizadas entre 2010 e 2021. Ordene o relatório da viagem com maior valor para a
 * viagem com menor valor.
 */

create or replace view viagens_carga_valor_total_vw as
select v.id_viagem as viagem, sum(c.vl_peso) as "carga total",
	   sum(distancia_minima_estacoes(v.cd_estacaoorigem, v.cd_estacaodestino) * vv.vl_custoporkm) as "valor total",
	   to_char(v.dt_inicio, 'DD-MM-YYYY') as "data da viagem"
from viagem v
inner join viagemrota vr on vr.cd_viagem = v.id_viagem
inner join rota r on r.id_rota = vr.cd_rota
inner join viagemvagao vv on vv.cd_viagem = v.id_viagem
inner join carga c on c.id_carga = vv.cd_carga
where extract('year' from v.dt_inicio) between 2010 and 2021
group by v.id_viagem
having sum(distancia_minima_estacoes(v.cd_estacaoorigem, v.cd_estacaodestino) * vv.vl_custoporkm) > 4500
order by "valor total" desc;
