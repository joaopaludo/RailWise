package br.edu.unoesc.railwise.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "contato")
@Data
public class Contato implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contato")
    private Long id_contato;

    @NotNull
    @Column(name = "cd_tipocontato")
    private Long cd_tipocontato;

    @NotNull
    @Column(name = "tx_contato")
    private String tx_contato;

    @NotNull
    @ManyToOne(targetEntity = Cliente.class)
    @JoinColumn(name = "cd_cliente", referencedColumnName = "id_cliente")
    private Cliente cliente;

}