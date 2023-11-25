package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "funcionarioviagem")
@Data
public class FuncionarioViagem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcionarioviagem")
    private Long id_funcionarioviagem;

    @NotNull
    @ManyToOne(targetEntity = Funcionario.class)
    @JoinColumn(name = "cd_funcionario", referencedColumnName = "id_funcionario")
    private Funcionario funcionario;

    @NotNull
    @ManyToOne(targetEntity = Viagem.class)
    @JoinColumn(name = "cd_viagem", referencedColumnName = "id_viagem")
    @JsonIgnore
    private Viagem viagem;
}