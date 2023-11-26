package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "locomotiva")
@Data
public class Locomotiva implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * {@link Integer} que representa o id da locomotiva
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_locomotiva")
    private Integer id_locomotiva;

    /**
     * {@link String} representando o modelo da locomotiva
     */
    @NotNull
    @Column(name = "tx_modelo")
    private String tx_modelo;

    /**
     * Valor int representando o ano de fabricacao da locomotiva
     */
    @NotNull
    @Column(name = "an_anofabricacao")
    private int an_anofabricacao;

    /**
     * Valor {@link Double} que representa a capacidade de carga em quilogramas que
     * a locomotiva consegue transportar
     */
    @NotNull
    @Column(name = "vl_capacidadecarga")
    private Double vl_capacidadecarga;

    /**
     * Valor {@link Double} que representa a potência do motor da locomotiva em hp
     */
    @NotNull
    @Column(name = "vl_potencia")
    private Double vl_potencia;

    /**
     * Valor {@link Double} que representa a capacidade de combustível em litros que
     * o tanque da locomotiva possui
     */
    @NotNull
    @Column(name = "vl_capacidadecombustivel")
    private Double vl_capacidadecombustivel;

    /**
     * Valor {@link Double} que representa o peso da locomotiva em quilogramas
     */
    @NotNull
    @Column(name = "vl_peso")
    private Double vl_peso;

    /**
     * Valor int que representa o status da locomotiva: 0 - inativa; 1 - ativa
     */
    @NotNull
    @Column(name = "cd_status")
    private int cd_status;
}