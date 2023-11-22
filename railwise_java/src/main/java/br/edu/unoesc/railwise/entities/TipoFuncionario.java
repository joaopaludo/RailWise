package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "tipofuncionario")
@Data
public class TipoFuncionario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipofuncionario")
    private Long id_tipofuncionario;

    @NotNull
    @Column(name = "tx_descricao")
    private String tx_descricao;
}