package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "cliente")
@SequenceGenerator(name = "cliente_id_cliente_seq", sequenceName = "cliente_id_cliente_seq", allocationSize = 100)
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_id_cliente_seq")
    private Long id_cliente;

    @NotNull
    private String tx_nome;

    @NotNull
    private String tx_documento;

    @NotNull
    private Date dt_cadastro;

    @NotNull
    private Long cd_status;

}