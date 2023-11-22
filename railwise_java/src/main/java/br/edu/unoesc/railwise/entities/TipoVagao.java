package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "tipovagao")
@Data
public class TipoVagao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipovagao")
    private Long id_tipovagao;

    @NotNull
    @Column(name = "tx_descricao")
    private String tx_descricao;

}