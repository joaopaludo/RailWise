package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "vagao")
@Data
public class Vagao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vagao")
    private Long id_vagao;

    @NotNull
    @ManyToOne(targetEntity = TipoVagao.class)
    @JoinColumn(name = "cd_tipovagao", referencedColumnName = "id_tipovagao")
    private TipoVagao tipoVagao;

    @NotNull
    @Column(name = "vl_capacidade")
    private Double vl_capacidade;

    @NotNull
    @Column(name = "vl_peso")
    private Double vl_peso;
}