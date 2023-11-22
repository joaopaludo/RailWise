package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "funcionarioviagem")
@Data
public class FuncionarioViagem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcionarioviagem")
    private Long id_funcionarioviagem;

    @NotNull
    @Column(name = "cd_funcionario")
    private Long cd_funcionario;

    @OneToMany(targetEntity = Funcionario.class)
    @JoinColumn(name = "id_funcionario", referencedColumnName = "cd_funcionario")
    private List<Funcionario> funcionarios;

    @NotNull
    @Column(name = "cd_viagem")
    private Long cd_viagem;

    @OneToMany(targetEntity = Viagem.class)
    @JoinColumn(name = "id_viagem", referencedColumnName = "cd_viagem")
    private List<Viagem> viagens;
}