package br.edu.unoesc.railwise.entities;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "manutencao")
@Data
public class Manutencao implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * {@link Integer} que representa o id da manutenção
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_manutencao")
    private Integer id_manutencao;

    /**
     * {@link String} com a descrição do que deve ser feito ou foi feito na
     * manutenção
     */
    @NotNull
    @Column(name = "tx_descricao")
    private String tx_descricao;

    /**
     * Valor int que representa o código do status da manutenção, sendo: 0 -
     * Programada \ 1 - Em andamento \ 2 - Em pausa \ 3 - Concluída \ 4 - Cancelada
     * \
     */
    @NotNull
    @Column(name = "cd_status")
    private int cd_status;

    /**
     * {@link LocalDate} que representa a data de realização da manutenção
     */
    @NotNull
    @Column(name = "dt_realizacao")
    @Temporal(TemporalType.DATE)
    private LocalDate dt_realizacao;

    /**
     * Valor {@link Double} que representa o valor gasto na manutenção
     */
    @NotNull
    @Column(name = "vl_custo")
    private Double vl_custo;

    /**
     * {@link Locomotiva} que passou pela manutenção
     */
    @ManyToOne(targetEntity = Locomotiva.class)
    @JoinColumn(name = "cd_locomotiva", referencedColumnName = "id_locomotiva")
    private Locomotiva locomotiva;

    /**
     * {@link Vagao} que passou pela manutenção
     */
    @ManyToOne(targetEntity = Vagao.class)
    @JoinColumn(name = "cd_vagao", referencedColumnName = "id_vagao")
    private Vagao vagao;

    /**
     * {@link Rota} que passou pela manutenção
     */
    @ManyToOne(targetEntity = Rota.class)
    @JoinColumn(name = "cd_rota", referencedColumnName = "id_rota")
    private Rota rota;
}