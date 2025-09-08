package atv2;

public abstract class CargodeConfianca extends Funcionario {
    protected Bonificacao bonificacao;

    public CargodeConfianca(String nome, String cpf, double salarioBase, String datadeNasciment, Bonificacao bonificacao) {
        super(nome, cpf, salarioBase, datadeNasciment);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
}

