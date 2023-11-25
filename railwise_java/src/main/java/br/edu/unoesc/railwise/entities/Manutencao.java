package br.edu.unoesc.railwise.entities;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "manutencao")
@Data
public class Manutencao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_manutencao")
    private Long id_manutencao;

    @NotNull
    @Column(name = "tx_descricao")
    private String tx_descricao;

    @NotNull
    @Column(name = "cd_status")
    private int cd_status;

    @NotNull
    @Column(name = "dt_realizacao")
    @Temporal(TemporalType.DATE)
    private LocalDate dt_realizacao;

    @NotNull
    @Column(name = "vl_custo")
    private Double vl_custo;

    @ManyToOne(targetEntity = Locomotiva.class)
    @JoinColumn(name = "cd_locomotiva", referencedColumnName = "id_locomotiva")
    private Locomotiva locomotiva;

    @ManyToOne(targetEntity = Vagao.class)
    @JoinColumn(name = "cd_vagao", referencedColumnName = "id_vagao")
    private Vagao vagao;

    @ManyToOne(targetEntity = Rota.class)
    @JoinColumn(name = "cd_rota", referencedColumnName = "id_rota")
    private Rota rota;
}