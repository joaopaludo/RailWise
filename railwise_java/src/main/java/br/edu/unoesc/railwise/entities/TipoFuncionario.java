package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

@Entity
@Table(name = "tipofuncionario")
@SequenceGenerator(name = "tipofuncionario_id_tipofuncionario_seq", sequenceName = "tipofuncionario_id_tipofuncionario_seq", allocationSize = 100)
public class TipoFuncionario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipofuncionario_id_tipofuncionario_seq")
    private Long id_tipofuncionario;

    @NotNull
    private String tx_descricao;
}