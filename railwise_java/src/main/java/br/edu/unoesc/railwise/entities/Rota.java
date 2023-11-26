package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "rota")
@Data
public class Rota implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * {@link Long} que representa o id da rota
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_rota")
	private Long id_rota;

	/**
	 * Objeto de {@link Estacao} que representa a estação origem da rota
	 */
	@NotNull
	@ManyToOne(targetEntity = Estacao.class)
	@JoinColumn(name = "cd_estacaoorigem", referencedColumnName = "id_estacao")
	private Estacao estacaoOrigem;

	/**
	 * Objeto de {@link Estacao} que representa a estação destino da rota
	 */
	@NotNull
	@ManyToOne(targetEntity = Estacao.class)
	@JoinColumn(name = "cd_estacaodestino", referencedColumnName = "id_estacao")
	private Estacao estacaoDestino;

	/**
	 * Valor {@link Double} que representa a distância em quilômetros entre as
	 * estações destino e origem
	 */
	@NotNull
	@Column(name = "vl_distancia")
	private Double vl_distancia;
}