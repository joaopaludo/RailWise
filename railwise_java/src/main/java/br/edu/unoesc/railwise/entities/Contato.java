package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "contato")
@Data
public class Contato implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * {@link Long} que representa o id do contato
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_contato")
	private Long id_contato;

	/**
	 * {@link Long} que representa o código do tipo de contato (1 - Email; 2 -
	 * Telefone; 3 - Celular)
	 */
	@NotNull
	@Column(name = "cd_tipocontato")
	private Long cd_tipocontato;

	/**
	 * {@link String} representando o contato propriamente dito
	 */
	@NotNull
	@Column(name = "tx_contato")
	private String tx_contato;

	/**
	 * {@link Cliente} que representa o cliente ao qual o contato pertence
	 */
	@NotNull
	@ManyToOne(targetEntity = Cliente.class)
	@JoinColumn(name = "cd_cliente", referencedColumnName = "id_cliente")
	@JsonIgnore
	private Cliente cliente;

}