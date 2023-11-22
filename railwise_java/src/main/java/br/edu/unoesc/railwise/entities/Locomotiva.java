package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "locomotiva")
@Data
public class Locomotiva implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_locomotiva")
    private Long id_locomotiva;

    @NotNull
    @Column(name = "tx_modelo")
    private String tx_modelo;

    @NotNull
    @Column(name = "an_anofabricacao")
    private int an_anofabricacao;

    @NotNull
    @Column(name = "vl_capacidadecarga")
    private Double vl_capacidadecarga;

    @NotNull
    @Column(name = "vl_potencia")
    private Double vl_potencia;

    @NotNull
    @Column(name = "vl_capacidadecombustivel")
    private Double vl_capacidadecombustivel;

    @NotNull
    @Column(name = "vl_peso")
    private Double vl_peso;

    @NotNull
    @Column(name = "cd_status")
    private int cd_status;
}