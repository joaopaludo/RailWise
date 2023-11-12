package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "viagem")
@SequenceGenerator(name = "viagem_id_viagem_seq", sequenceName = "viagem_id_viagem_seq", allocationSize = 100)
public class Viagem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "viagem_id_viagem_seq")
    private Long id_viagem;

    @ManyToOne(targetEntity = Locomotiva.class)
    private Long cd_locomotiva;

    private Timestamp dt_inicio;

    private Timestamp dt_fim;
}