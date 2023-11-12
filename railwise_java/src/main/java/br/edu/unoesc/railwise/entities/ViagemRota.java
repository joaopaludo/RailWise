package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "viagemrota")
@SequenceGenerator(name = "viagemrota_id_viagemrota_sequence", sequenceName = "viagemrota_id_viagemrota_sequence", allocationSize = 100)
public class ViagemRota implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "viagemrota_id_viagemrota_sequence")
    private Long id_viagemrota;

    @NotNull
    @ManyToOne(targetEntity = Rota.class)
    private Long cd_rota;

    @NotNull
    @ManyToOne(targetEntity = Viagem.class)
    private Long cd_viagem;

    private Timestamp dt_momentosaida;

    private Timestamp dt_momentochegada;
}