package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "cliente")
@Data
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long id_cliente;

    @NotNull
    @Column(name = "tx_nome")
    private String tx_nome;

    @NotNull
    @Column(name = "tx_documento")
    private String tx_documento;

    @NotNull
    @Column(name = "dt_cadastro")
    private Date dt_cadastro;

    @NotNull
    @Column(name = "cd_status")
    private Long cd_status;
}