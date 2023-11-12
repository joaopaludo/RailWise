package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "funcionario")
@SequenceGenerator(name = "funcionario_id_funcionario_seq", sequenceName = "funcionario_id_funcionario_seq", allocationSize = 100)
public class Funcionario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "funcionario_id_funcionario_seq")
    private Long id_funcionario;

    @NotNull
    @ManyToOne(targetEntity = TipoFuncionario.class)
    private Long cd_tipofuncionario;

    @ManyToOne(targetEntity = Estacao.class)
    private Long cd_estacao;

    @NotNull
    private String tx_nome;

    @NotNull
    private String tx_cpf;

    @NotNull
    private Timestamp dt_nascimento;

    @NotNull
    private Double vl_salario;
}