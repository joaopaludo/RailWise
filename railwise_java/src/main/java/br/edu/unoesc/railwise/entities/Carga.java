package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "carga")
@Data
public class Carga implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carga")
    private Long id_carga;

    @NotNull
    @Column(name = "tx_descricao")
    private String tx_descricao;

    @NotNull
    @ManyToOne(targetEntity = Estacao.class)
    @JoinColumn(name = "cd_estacaoorigem", referencedColumnName = "id_estacao")
    private Estacao estacaoOrigem;

    @NotNull
    @ManyToOne(targetEntity = Estacao.class)
    @JoinColumn(name = "cd_estacaodestino", referencedColumnName = "id_estacao")
    private Estacao estacaoDestino;

    @NotNull
    @ManyToOne(targetEntity = Cliente.class)
    @JoinColumn(name = "cd_cliente", referencedColumnName = "id_cliente")
    private Cliente cliente;

    @NotNull
    @Column(name = "vl_peso")
    private Double vl_peso;
}