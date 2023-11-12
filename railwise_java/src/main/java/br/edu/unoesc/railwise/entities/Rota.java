package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

@Entity
@Table(name = "rota")
@SequenceGenerator(name = "manutencao_id_manutencao_seq", sequenceName = "manutencao_id_manutencao_seq", allocationSize = 100)
public class Rota implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "manutencao_id_manutencao_seq")
    private Long id_rota;

    @NotNull
    @ManyToOne(targetEntity = Estacao.class)
    private Long cd_estacaoorigem;

    @NotNull
    @ManyToOne(targetEntity = Estacao.class)
    private Long cd_estacaodestino;

    @NotNull
    private Double vl_distancia;
}