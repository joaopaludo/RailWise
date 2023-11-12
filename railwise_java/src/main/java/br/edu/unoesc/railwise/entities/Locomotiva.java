package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

@Entity
@Table(name = "locomotiva")
@SequenceGenerator(name = "locomotiva_id_locomotiva_seq", sequenceName = "locomotiva_id_locomotiva_seq", allocationSize = 100)
public class Locomotiva implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "locomotiva_id_locomotiva_seq")
    private Long id_locomotiva;

    @NotNull
    private String tx_modelo;

    @NotNull
    private int an_anofabricacao;

    @NotNull
    private Double vl_capacidadecarga;

    @NotNull
    private Double vl_potencia;

    @NotNull
    private Double vl_capacidadecombustivel;

    @NotNull
    private Double vl_peso;

    @NotNull
    private int cd_status;
}