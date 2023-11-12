package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "funcionarioviagem")
@SequenceGenerator(name = "funcionarioviagem_id_funcionarioviagem_seq", sequenceName = "funcionarioviagem_id_funcionarioviagem_seq", allocationSize = 100)
public class FuncionarioViagem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "funcionarioviagem_id_funcionarioviagem_seq")
    private Long id_funcionarioviagem;

    @OneToMany(targetEntity = Funcionario.class)
    private Long cd_funcionario;

    @Id
    @OneToMany(targetEntity = Viagem.class)
    private Long cd_viagem;
}