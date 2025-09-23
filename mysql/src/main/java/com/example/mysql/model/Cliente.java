package com.example.mysql.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tab_clientes")
@Data

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@Column(nullable = false)
    private String nome;
@Column(nullable = false)
    private String dataNascimento;
@Column(nullable = false, unique = true)
    private String protocoloAtendimento;

    public Cliente() {
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(String protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }
}
