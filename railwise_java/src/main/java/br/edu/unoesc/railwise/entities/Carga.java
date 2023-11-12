package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

@Entity
@Table(name = "carga")
@SequenceGenerator(name = "carga_id_carga_seq", sequenceName = "carga_id_carga_seq", allocationSize = 100)
public class Carga implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carga_id_carga_seq")
    private Long id_carga;

    @NotNull
    private String tx_descricao;

    @NotNull
    @ManyToOne(targetEntity = Estacao.class)
    private Long cd_estacaoorigem;

    @NotNull
    @ManyToOne(targetEntity = Estacao.class)
    private Long cd_estacaodestino;

    @NotNull
    @ManyToOne(targetEntity = Cliente.class)
    private Long cd_cliente;

    @NotNull
    private Double vl_peso;
}