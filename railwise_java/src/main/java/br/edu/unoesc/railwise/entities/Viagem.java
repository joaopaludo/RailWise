package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "viagem")
@Data
public class Viagem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_viagem")
    private Long id_viagem;

    @ManyToOne(targetEntity = Locomotiva.class)
    @JoinColumn(name = "cd_locomotiva", referencedColumnName = "id_locomotiva")
    private Locomotiva locomotiva;

    @Column(name = "dt_inicio")
    private Timestamp dt_inicio;

    @Column(name = "dt_fim")
    private Timestamp dt_fim;
}