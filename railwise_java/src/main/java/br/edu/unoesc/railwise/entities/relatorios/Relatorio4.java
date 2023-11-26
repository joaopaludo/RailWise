package br.edu.unoesc.railwise.entities.relatorios;

public interface Relatorio4 {

	/**
	 * Recupera o id da viagem
	 * 
	 * @return {@link Long} que representa o id da viagem
	 */
	Long getVIAGEM();

	/**
	 * Recupera a carga total transportada na viagem
	 * 
	 * @return {@link Long} que representa a carga total transportada na viagem
	 */
	Long getCARGA_TOTAL();

	/**
	 * Recupera o valor total da viagem (R$)
	 * 
	 * @return {@link Long} que representa o valor total da viagem
	 */
	Long getVALOR_TOTAL();

	/**
	 * Recupera a data da viagem
	 * 
	 * @return {@link String} que representa a data da viagem
	 */
	String getDATA_VIAGEM();
}