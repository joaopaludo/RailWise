package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "viagemvagao")
@SequenceGenerator(name = "viagemvagao_id_viagemvagao_seq", sequenceName = "viagemvagao_id_viagemvagao_seq", allocationSize = 100)
public class ViagemVagao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "viagemvagao_id_viagemvagao_seq")
    private Long id_viagemvagao;

    @ManyToOne(targetEntity = Viagem.class)
    private Long cd_viagem;

    @ManyToOne(targetEntity = Vagao.class)
    private Long cd_vagao;

    @ManyToOne(targetEntity = Carga.class)
    private Long cd_carga;

    private Double vl_custoporkm;
}