package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Relação de funcionários e viagens
 */
@Entity
@Table(name = "funcionarioviagem")
@Data
public class FuncionarioViagem implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * {@link Integer} que representa o id de funcionarioviagem
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcionarioviagem")
    private Integer id_funcionarioviagem;

    /**
     * {@link Funcionario} que indica o funcionário
     */
    @NotNull
    @ManyToOne(targetEntity = Funcionario.class)
    @JoinColumn(name = "cd_funcionario", referencedColumnName = "id_funcionario")
    private Funcionario funcionario;

    /**
     * {@link Viagem} que indica a viagem
     */
    @NotNull
    @ManyToOne(targetEntity = Viagem.class)
    @JoinColumn(name = "cd_viagem", referencedColumnName = "id_viagem")
    @JsonIgnore
    private Viagem viagem;
}