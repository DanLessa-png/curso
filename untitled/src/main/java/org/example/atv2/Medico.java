package org.example.atv2;

public class Medico extends Funcionario{
    private String crm;

    public Medico(String nome, String email, Endereco endereco, double salario, String crm) {
        super(nome, email, endereco, salario);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "crm='" + crm + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                ", salario=" + salario +
                '}';
    }
}
