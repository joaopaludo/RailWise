package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

@Entity
@Table(name = "contato")
@SequenceGenerator(name = "contato_id_cotato_sequence", sequenceName = "contato_sequence", allocationSize = 100)
public class Contato implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contato_sequence")
    private Long id_contato;

    @NotNull
    private Long cd_tipocontato;

    @NotNull
    private String tx_contato;

    @NotNull
    @ManyToOne(targetEntity = Cliente.class)
    private Long cd_cliente;

}