package br.edu.unoesc.railwise.entities.relatorios;

public interface Relatorio3 {

    /**
     * Recupera a quantidade de cargas transportadas para determinado destino
     * 
     * @return {@link Integer} que representa a quantidade de cargas
     */
    Integer getQUANTIDADE_CARGAS();

    /**
     * Recupera o destino das cargas
     * 
     * @return {@link String} que representa a estação de destino
     */
    String getDESTINO();
}