package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "viagemvagao")
@Data
public class ViagemVagao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_viagemvagao")
    private Long id_viagemvagao;

    @ManyToOne(targetEntity = Viagem.class)
    @JoinColumn(name = "cd_viagem", referencedColumnName = "id_viagem")
    @JsonIgnore
    private Viagem viagem;

    @ManyToOne(targetEntity = Vagao.class)
    @JoinColumn(name = "cd_vagao", referencedColumnName = "id_vagao")
    private Vagao vagao;

    @ManyToOne(targetEntity = Carga.class)
    @JoinColumn(name = "cd_carga", referencedColumnName = "id_carga")
    private Carga carga;

    @Column(name = "vl_custoporkm")
    private Double vl_custoporkm;
}