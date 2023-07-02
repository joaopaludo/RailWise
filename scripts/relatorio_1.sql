/*
 * Relação com código da locomotiva, capacidade de carga máxima. Relacionar locomotivas fabricadas a partir de 1990. Ordene o relatório da locomotiva com maior capacidade para a locomotiva com menor capacidade;
 */

SELECT l.id_locomotiva, l.vl_capacidadecarga
FROM locomotiva l
ORDER BY l.vl_capacidadecarga DESC;