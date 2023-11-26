package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "tipofuncionario")
@Data
public class TipoFuncionario implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * {@link Integer} que representa o id do tipo de funcionário
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipofuncionario")
    private Integer id_tipofuncionario;

    /**
     * {@link String} que representa a descrição do tipo de funcionário
     */
    @NotNull
    @Column(name = "tx_descricao")
    private String tx_descricao;
}