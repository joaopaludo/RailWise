package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.sql.Time;

import lombok.Data;

@Entity
@Table(name = "estacao")
@Data
public class Estacao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estacao")
    private Long id_estacao;

    @NotNull
    @Column(name = "tx_nome")
    private String tx_nome;

    @NotNull
    @Column(name = "tx_cidade")
    private String tx_cidade;

    @NotNull
    @Column(name = "tx_uf")
    private String tx_uf;

    @NotNull
    @Column(name = "tx_endereco")
    private String tx_endereco;

    @Column(name = "hr_inicioexpediente::time without time zone")
    @Temporal(TemporalType.TIME)
    private Time hr_inicioexpediente;

    @Column(name = "hr_finalexpediente::time without time zone")
    @Temporal(TemporalType.TIME)
    private Time hr_finalexpediente;

}