package com.example.aula.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private double precoUnitario;

    public Produto() {
    }

    public Produto(long id, String nome, double precoUnitario) {
        this.id = id;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
