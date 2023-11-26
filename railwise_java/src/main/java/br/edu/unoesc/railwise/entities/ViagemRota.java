package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Relação de viagens e rotas percorridas
 */
@Entity
@Table(name = "viagemrota")
@Data
public class ViagemRota implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * {@link Integer} que representa o id de viagemrota
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_viagemrota")
    private Integer id_viagemrota;

    /**
     * {@link Rota} que indica a rota
     */
    @NotNull
    @ManyToOne(targetEntity = Rota.class)
    @JoinColumn(name = "cd_rota", referencedColumnName = "id_rota")
    private Rota rota;

    /**
     * {@link Viagem} que indica a viagem
     */
    @NotNull
    @ManyToOne(targetEntity = Viagem.class)
    @JoinColumn(name = "cd_viagem", referencedColumnName = "id_viagem")
    @JsonIgnore
    private Viagem viagem;

    /**
     * {@link Timestamp} representando a data e hora de saída da locomotiva da
     * estação origem da rota
     */
    @Column(name = "dt_momentosaida")
    private Timestamp dt_momentosaida;

    /**
     * {@link Timestamp} representando a data e hora de chegada da locomotiva na
     * estação destino da rota
     */
    @Column(name = "dt_momentochegada")
    private Timestamp dt_momentochegada;
}