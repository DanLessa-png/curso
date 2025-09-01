package org.example.atv2;

public abstract class Funcionario {
    protected String nome;
    protected String email;
    protected Endereco endereco;
    protected double salario;

    public Funcionario(String nome, String email, Endereco endereco, double salario) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
       this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                ", salario=" + salario +
                '}';
    }
}
