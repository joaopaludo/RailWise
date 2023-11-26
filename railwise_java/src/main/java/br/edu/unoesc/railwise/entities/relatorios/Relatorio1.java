package br.edu.unoesc.railwise.entities.relatorios;

public interface Relatorio1 {

    /**
     * Recupera o id da locomotiva
     * 
     * @return {@link Integer} que representa o id da locomotiva
     */
    Integer getID();

    /**
     * Recupera o modelo da locomotiva
     * 
     * @return {@link String} que representa o modelo da locomotiva
     */
    String getMODELO();

    /**
     * Recupera a capacidade de carga da locomotiva
     * 
     * @return {@link Integer} que representa a capacidade de carga da locomotiva
     */
    Integer getCAPACIDADE_CARGA();

    /**
     * Recupera o ano de fabricação da locomotiva
     * 
     * @return {@link Integer} que representa o ano de fabricação da locomotiva
     */
    Integer getANO_FABRICACAO();
}