package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "log")
@SequenceGenerator(name = "log_id_log_seq", sequenceName = "log_id_log_seq", allocationSize = 100)
public class Log implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "log_id_log_seq")
    private Long id_log;

    @NotNull
    private String tx_descricao;

    @NotNull
    private Timestamp dt_registro;

}