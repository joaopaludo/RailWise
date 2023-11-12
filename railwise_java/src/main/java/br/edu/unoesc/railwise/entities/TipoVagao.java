package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

@Entity
@Table(name = "tipovagao")
public class TipoVagao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipovagao_id_tipovagao_seq")
    @SequenceGenerator(name = "tipovagao_id_tipovagao_seq", sequenceName = "tipovagao_id_tipovagao_seq", allocationSize = 100)
    private Long id_tipovagao;

    @NotNull
    private String tx_descricao;

}