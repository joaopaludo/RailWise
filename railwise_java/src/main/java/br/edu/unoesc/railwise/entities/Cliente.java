package br.edu.unoesc.railwise.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "cliente")
@Data
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * {@link Integer} que representa o id do cliente
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer id_cliente;

    /**
     * {@link String} representando o nome do cliente
     */
    @NotNull
    @Column(name = "tx_nome")
    private String tx_nome;

    /**
     * {@link String} representando o documento do cliente. (CPF em caso de pessoa
     * física; CNPJ para pessoa jurídica)
     */
    @NotNull
    @Column(name = "tx_documento")
    private String tx_documento;

    /**
     * {@link LocalDate} que representa a data em que o cliente foi cadastrado
     */
    @NotNull
    @Column(name = "dt_cadastro")
    private LocalDate dt_cadastro;

    /**
     * {@link Integer} que representa o status do cliente
     */
    @NotNull
    @Column(name = "cd_status")
    private Integer cd_status;

    /**
     * Lista de contatos do cliente
     */
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Contato> contatos;
}