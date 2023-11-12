package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "manutencao")
@SequenceGenerator(name = "manutencao_id_manutencao_seq", sequenceName = "manutencao_id_manutencao_seq", allocationSize = 100)
public class Manutencao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "manutencao_id_manutencao_seq")
    private Long id_manutencao;

    @NotNull
    private String tx_descricao;

    @NotNull
    private int cd_status;

    @NotNull
    private Date dt_realizacao;

    @NotNull
    private Double vl_custo;

    @ManyToOne(targetEntity = Locomotiva.class)
    private Long cd_locomotiva;

    @ManyToOne(targetEntity = Vagao.class)
    private Long cd_vagao;

    @ManyToOne(targetEntity = Rota.class)
    private Long cd_ferrovia;
}