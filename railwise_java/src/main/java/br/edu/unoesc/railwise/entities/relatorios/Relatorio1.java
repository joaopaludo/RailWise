package br.edu.unoesc.railwise.entities.relatorios;

public interface Relatorio1 {

	/**
	 * Recupera o id da locomotiva
	 * 
	 * @return {@link Long} que representa o id da locomotiva
	 */
	Long getID();

	/**
	 * Recupera o modelo da locomotiva
	 * 
	 * @return {@link String} que representa o modelo da locomotiva
	 */
	String getMODELO();

	/**
	 * Recupera a capacidade de carga da locomotiva
	 * 
	 * @return {@link Long} que representa a capacidade de carga da locomotiva
	 */
	Long getCAPACIDADE_CARGA();

	/**
	 * Recupera o ano de fabricação da locomotiva
	 * 
	 * @return {@link Long} que representa o ano de fabricação da locomotiva
	 */
	Long getANO_FABRICACAO();
}