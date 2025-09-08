package atv2;

public class Gerente extends CargodeConfianca {

    public Gerente(String nome, String cpf, double salarioBase, String datadeNasciment, Bonificacao bonificacao) {
        super(nome, cpf, salarioBase, datadeNasciment, bonificacao);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salarioBase=" + salarioBase +
                ", datadeNasciment='" + datadeNasciment + '\'' +
                '}';
    }

    @Override
    public Bonificacao getBonificacao() {
        return super.salarioBase.bonificacao.Gerente.getValor();
    }

}
