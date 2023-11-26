package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "vagao")
@Data
public class Vagao implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * {@link Integer} que representa o id do vagão
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vagao")
    private Integer id_vagao;

    /**
     * {@link TipoVagao} representando o tipo do vagão
     */
    @NotNull
    @ManyToOne(targetEntity = TipoVagao.class)
    @JoinColumn(name = "cd_tipovagao", referencedColumnName = "id_tipovagao")
    private TipoVagao tipoVagao;

    /**
     * Valor {@link Double} que representa a capacidade do vagão em quilogramas
     */
    @NotNull
    @Column(name = "vl_capacidade")
    private Double vl_capacidade;

    /**
     * Valor {@link Double} que representa o peso do vagão em quilogramas
     */
    @NotNull
    @Column(name = "vl_peso")
    private Double vl_peso;
}