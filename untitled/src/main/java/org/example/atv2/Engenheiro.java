package org.example.atv2;

public class Engenheiro extends Funcionario{
    private String crea;

    public Engenheiro(String nome, String email, Endereco endereco, double salario, String crea) {
        super(nome, email, endereco, salario);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "Engenheiro{" +
                "crea='" + crea + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                ", salario=" + salario +
                '}';
    }
}
