package br.edu.unoesc.railwise.entities.relatorios;

public interface Relatorio4 {

    /**
     * Recupera o id da viagem
     * 
     * @return {@link Integer} que representa o id da viagem
     */
    Integer getVIAGEM();

    /**
     * Recupera a carga total transportada na viagem
     * 
     * @return {@link Integer} que representa a carga total transportada na viagem
     */
    Integer getCARGA_TOTAL();

    /**
     * Recupera o valor total da viagem (R$)
     * 
     * @return {@link Integer} que representa o valor total da viagem
     */
    Integer getVALOR_TOTAL();

    /**
     * Recupera a data da viagem
     * 
     * @return {@link String} que representa a data da viagem
     */
    String getDATA_VIAGEM();
}