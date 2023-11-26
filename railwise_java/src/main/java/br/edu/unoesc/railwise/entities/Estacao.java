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

    private static final long serialVersionUID = 1L;

    /**
     * {@link Integer} que representa o id da estação
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estacao")
    private Integer id_estacao;

    /**
     * {@link String} representando o nome da estação
     */
    @NotNull
    @Column(name = "tx_nome")
    private String tx_nome;

    /**
     * {@link String} representando o nome da cidade onde se localiza a estação
     */
    @NotNull
    @Column(name = "tx_cidade")
    private String tx_cidade;

    /**
     * {@link String} representando a sigla da UF onde se encontra a estação
     */
    @NotNull
    @Column(name = "tx_uf")
    private String tx_uf;

    /**
     * {@link String} que descreve o endereço da estação
     */
    @NotNull
    @Column(name = "tx_endereco")
    private String tx_endereco;

    /**
     * {@link Time} que representa o horário de início do expediente de trabalho na
     * estação
     */
    @Column(name = "hr_inicioexpediente", columnDefinition = "time without time zone")
    @Temporal(TemporalType.TIME)
    private Time hr_inicioexpediente;

    /**
     * {@link Time} que representa o horário de fim do expediente de trabalho na
     * estação
     */
    @Column(name = "hr_finalexpediente", columnDefinition = "time without time zone")
    @Temporal(TemporalType.TIME)
    private Time hr_finalexpediente;

}