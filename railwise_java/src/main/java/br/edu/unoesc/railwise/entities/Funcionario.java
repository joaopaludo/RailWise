package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "funcionario")
@Data
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * {@link Integer} que representa o id do funcionário
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcionario")
    private Integer id_funcionario;

    /**
     * {@link TipoFuncionario} que relaciona o tipo de funcionário
     */
    @NotNull
    @ManyToOne(targetEntity = TipoFuncionario.class)
    @JoinColumn(name = "cd_tipofuncionario", referencedColumnName = "id_tipofuncionario")
    private TipoFuncionario tipoFuncionario;

    /**
     * {@link Estacao} que relaciona a estação onde o funcionário trabalha
     */
    @ManyToOne(targetEntity = Estacao.class)
    @JoinColumn(name = "cd_estacao", referencedColumnName = "id_estacao")
    private Estacao estacao;

    /**
     * {@link String} representando o nome completo do funcionário
     */
    @NotNull
    @Column(name = "tx_nome")
    private String tx_nome;

    /**
     * {@link String} representando o documento do funcionário(CPF)
     */
    @NotNull
    @Column(name = "tx_cpf")
    private String tx_cpf;

    /**
     * {@link Timestamp} representando a data de nascimento do funcionário
     */
    @NotNull
    @Column(name = "dt_nascimento")
    private Timestamp dt_nascimento;

    /**
     * Valor {@link Double} que representa o salário do funcionário em R$
     */
    @NotNull
    @Column(name = "vl_salario")
    private Double vl_salario;
}