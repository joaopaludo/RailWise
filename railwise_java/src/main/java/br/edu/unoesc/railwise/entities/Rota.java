package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "rota")
@Data
public class Rota implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rota")
    private Long id_rota;

    @NotNull
    @ManyToOne(targetEntity = Estacao.class)
    @JoinColumn(name = "cd_estacaoorigem", referencedColumnName = "id_estacao")
    private Estacao estacaoOrigem;

    @NotNull
    @ManyToOne(targetEntity = Estacao.class)
    @JoinColumn(name = "cd_estacaodestino", referencedColumnName = "id_estacao")
    private Estacao estacaoDestino;

    @NotNull
    @Column(name = "vl_distancia")
    private Double vl_distancia;
}