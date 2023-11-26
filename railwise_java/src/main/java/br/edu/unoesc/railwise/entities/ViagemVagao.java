package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Relação de viagens e vagões transportados
 */
@Entity
@Table(name = "viagemvagao")
@Data
public class ViagemVagao implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * {@link Long} que representa o id de viagemvagao
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_viagemvagao")
	private Long id_viagemvagao;

	/**
	 * {@link Viagem} que indica a viagem
	 */
	@ManyToOne(targetEntity = Viagem.class)
	@JoinColumn(name = "cd_viagem", referencedColumnName = "id_viagem")
	@JsonIgnore
	private Viagem viagem;

	/**
	 * {@link Vagao} que indica o vagão
	 */
	@ManyToOne(targetEntity = Vagao.class)
	@JoinColumn(name = "cd_vagao", referencedColumnName = "id_vagao")
	private Vagao vagao;

	/**
	 * {@link Carga} que indica a carga transportada no vagão para a viagem em
	 * questão
	 */
	@ManyToOne(targetEntity = Carga.class)
	@JoinColumn(name = "cd_carga", referencedColumnName = "id_carga")
	private Carga carga;

	/**
	 * Valor {@link Double} que representa o custo por quilômetro percorrido para o
	 * transporte da carga na viagem
	 */
	@Column(name = "vl_custoporkm")
	private Double vl_custoporkm;
}