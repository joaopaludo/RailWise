package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "viagem")
@Data
public class Viagem implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * {@link Integer} que representa o id da viagem
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_viagem", insertable = false, updatable = false)
    private Integer id_viagem;

    /**
     * {@link Locomotiva} que realizou / realizará a viagem
     */
    @ManyToOne(targetEntity = Locomotiva.class)
    @JoinColumn(name = "cd_locomotiva", referencedColumnName = "id_locomotiva")
    private Locomotiva locomotiva;

    /**
     * {@link Timestamp} representando a data e hora de início da viagem
     */
    @Column(name = "dt_inicio")
    private Timestamp dt_inicio;

    /**
     * {@link Timestamp} representando a data e hora de término da viagem
     */
    @Column(name = "dt_fim")
    private Timestamp dt_fim;

    /**
     * Lista de {@link FuncionarioViagem} para relacionar funcionários que foram ou
     * irão em uma viagem
     */
    @OneToMany(mappedBy = "viagem", targetEntity = FuncionarioViagem.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FuncionarioViagem> funcionarioViagem;

    /**
     * Lista de {@link ViagemVagao} para relacionar vagões que foram ou serão
     * transportados em uma viagem
     */
    @OneToMany(mappedBy = "viagem", targetEntity = ViagemVagao.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ViagemVagao> viagemVagao;

    /**
     * Lista de {@link ViagemRota} para relacionar rotas que foram ou serão
     * percorridas em uma viagem
     */
    @OneToMany(mappedBy = "viagem", targetEntity = ViagemRota.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ViagemRota> viagemRota;

    /**
     * {@link Estacao} de origem da viagem
     */
    @ManyToOne(targetEntity = Estacao.class)
    @JoinColumn(name = "cd_estacaoorigem", referencedColumnName = "id_estacao")
    private Estacao estacaoOrigem;

    /**
     * {@link Estacao} de destino da viagem
     */
    @ManyToOne(targetEntity = Estacao.class)
    @JoinColumn(name = "cd_estacaodestino", referencedColumnName = "id_estacao")
    private Estacao estacaoDestino;

}