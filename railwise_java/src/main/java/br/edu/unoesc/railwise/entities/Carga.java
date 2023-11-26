package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "carga")
@Data
public class Carga implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * {@link Integer} que representa o id da carga
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carga")
    private Integer id_carga;

    /**
     * {@link String} com a descrição do que compõe a carga
     */
    @NotNull
    @Column(name = "tx_descricao")
    private String tx_descricao;

    /**
     * Objeto de {@link Estacao} que representa a estação de origem da carga
     */
    @NotNull
    @ManyToOne(targetEntity = Estacao.class)
    @JoinColumn(name = "cd_estacaoorigem", referencedColumnName = "id_estacao")
    private Estacao estacaoOrigem;

    /**
     * Objeto de {@link Estacao} que representa a estação de destino da carga
     */
    @NotNull
    @ManyToOne(targetEntity = Estacao.class)
    @JoinColumn(name = "cd_estacaodestino", referencedColumnName = "id_estacao")
    private Estacao estacaoDestino;

    /**
     * Objeto de {@link Cliente} que representa o cliente que requisitou o
     * transporte da carga
     */
    @NotNull
    @ManyToOne(targetEntity = Cliente.class)
    @JoinColumn(name = "cd_cliente", referencedColumnName = "id_cliente")
    private Cliente cliente;

    /**
     * Valor {@link Double} que representa o peso da carga em quilogramas
     */
    @NotNull
    @Column(name = "vl_peso")
    private Double vl_peso;
}