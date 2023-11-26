package br.edu.unoesc.railwise.entities.relatorios;

public interface Relatorio3 {

	/**
	 * Recupera a quantidade de cargas transportadas para determinado destino
	 * 
	 * @return {@link Long} que representa a quantidade de cargas
	 */
	Long getQUANTIDADE_CARGAS();

	/**
	 * Recupera o destino das cargas
	 * 
	 * @return {@link String} que representa a estação de destino
	 */
	String getDESTINO();
}