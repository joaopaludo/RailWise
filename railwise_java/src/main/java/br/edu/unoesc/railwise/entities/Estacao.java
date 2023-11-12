package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.sql.Time;

@Entity
@Table(name = "estacao")
@SequenceGenerator(name = "estacao_id_estacao_seq", sequenceName = "estacao_id_estacao_seq", allocationSize = 100)
public class Estacao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estacao_id_estacao_seq")
    private Long id_estacao;

    @NotNull
    private String tx_nome;

    @NotNull
    private String tx_cidade;

    @NotNull
    private String tx_uf;

    @NotNull
    private String tx_endereco;

    private Time hr_inicioexpediente;

    private Time hr_finalexpediente;
}