package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "tipovagao")
@Data
public class TipoVagao implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * {@link Integer} que representa o id do tipo de vagão
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipovagao")
    private Integer id_tipovagao;

    /**
     * {@link String} que representa a descrição do tipo de vagão
     */
    @NotNull
    @Column(name = "tx_descricao")
    private String tx_descricao;

}