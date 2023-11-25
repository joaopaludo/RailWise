package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "viagemrota")
@Data
public class ViagemRota implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_viagemrota")
    private Long id_viagemrota;

    @NotNull
    @ManyToOne(targetEntity = Rota.class)
    @JoinColumn(name = "cd_rota", referencedColumnName = "id_rota")
    private Rota rota;

    @NotNull
    @ManyToOne(targetEntity = Viagem.class)
    @JoinColumn(name = "cd_viagem", referencedColumnName = "id_viagem")
    @JsonIgnore
    private Viagem viagem;

    @Column(name = "dt_momentosaida")
    private Timestamp dt_momentosaida;

    @Column(name = "dt_momentochegada")
    private Timestamp dt_momentochegada;
}