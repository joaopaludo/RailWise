package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "log")
@Data
public class Log implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_log")
    private Long id_log;

    @NotNull
    @Column(name = "tx_descricao")
    private String tx_descricao;

    @NotNull
    @Column(name = "dt_registro")
    private Timestamp dt_registro;

}