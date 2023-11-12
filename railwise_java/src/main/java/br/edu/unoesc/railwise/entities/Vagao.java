package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

@Entity
@Table(name = "vagao")
@SequenceGenerator(name = "vagao_id_vagao_seq", sequenceName = "vagao_id_vagao_seq", allocationSize = 100)
public class Vagao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vagao_id_vagao_seq")
    private Long id_vagao;

    @NotNull
    @ManyToOne(targetEntity = TipoVagao.class)
    private Long cd_tipovagao;

    @NotNull
    private Double vl_capacidade;

    @NotNull
    private Double vl_peso;
}