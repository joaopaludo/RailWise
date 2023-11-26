package br.edu.unoesc.railwise.entities.relatorios;

import java.sql.Timestamp;

public interface Relatorio2 {

	/**
	 * Recupera a estação de origem da viagem
	 * 
	 * @return {@link String} que representa a estação de origem da viagem
	 */
	String getORIGEM();

	/**
	 * Recupera a estação de destino da viagem
	 * 
	 * @return {@link String} que representa a estação de destino da viagem
	 */
	String getDESTINO();

	/**
	 * Recupera o momento de saída da viagem
	 * 
	 * @return Timestamp que representa o momento de saída da viagem
	 */
	Timestamp getSAIDA();

	/**
	 * Recupera o momento de chegada da viagem
	 * 
	 * @return Timestamp que representa o momento de chegada ao destino da viagem
	 */
	Timestamp getCHEGADA();
}