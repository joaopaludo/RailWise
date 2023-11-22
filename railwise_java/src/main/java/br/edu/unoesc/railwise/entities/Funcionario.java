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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcionario")
    private Long id_funcionario;

    @NotNull
    @ManyToOne(targetEntity = TipoFuncionario.class)
    @JoinColumn(name = "cd_tipofuncionario", referencedColumnName = "id_tipofuncionario")
    private TipoFuncionario tipoFuncionario;

    @ManyToOne(targetEntity = Estacao.class)
    @JoinColumn(name = "cd_estacao", referencedColumnName = "id_estacao")
    private Estacao estacao;

    @NotNull
    @Column(name = "tx_nome")
    private String tx_nome;

    @NotNull
    @Column(name = "tx_cpf")
    private String tx_cpf;

    @NotNull
    @Column(name = "dt_nascimento")
    private Timestamp dt_nascimento;

    @NotNull
    @Column(name = "vl_salario")
    private Double vl_salario;
}