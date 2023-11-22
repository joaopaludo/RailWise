/*
 * Relatório 1
 * 
 * Relação com código da locomotiva, capacidade de carga máxima. Relacionar locomotivas
 * fabricadas a partir de 1990. Ordene o relatório da locomotiva com maior capacidade para a
 * locomotiva com menor capacidade;
 */

create or replace view relatorio_locomotivas_capacidade_vw as
select l.id_locomotiva "ID", l.tx_modelo "Modelo" , l.vl_capacidadecarga "Capacidade de carga",
       l.an_anofabricacao "Ano de fabricação"
from locomotiva l
where l.an_anofabricacao >= 1990
order by l.vl_capacidadecarga desc;
