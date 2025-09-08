package atv;

public class Motoboy extends Funcionario{
    private String carteiradeHabilitacao;

    public Motoboy(String nome, String datadeNascimento, Sexo sexo, Setor setor, double salarioBase, String carteiradeHabilitacao) {
        super(nome, datadeNascimento, sexo, setor, salarioBase);
        this.carteiradeHabilitacao = carteiradeHabilitacao;
    }

    public String getCarteiradeHabilitacao() {
        return carteiradeHabilitacao;
    }

    public void setCarteiradeHabilitacao(String carteiradeHabilitacao) {
        this.carteiradeHabilitacao = carteiradeHabilitacao;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "carteiradeHabilitacao='" + carteiradeHabilitacao + '\'' +
                ", nome='" + nome + '\'' +
                ", datadeNascimento='" + datadeNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
