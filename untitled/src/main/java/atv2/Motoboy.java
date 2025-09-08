package atv2;

public class Motoboy extends Funcionario {
    private String placadaMoto;

    public Motoboy(String nome, String cpf, double salarioBase, String datadeNasciment, String placadaMoto) {
        super(nome, cpf, salarioBase, datadeNasciment);
        this.placadaMoto = placadaMoto;
    }

    public String getPlacadaMoto() {
        return placadaMoto;
    }

    public void setPlacadaMoto(String placadaMoto) {
        this.placadaMoto = placadaMoto;
    }

    @Override
    public double calcularSalarioFinal() {
        return super. getSalarioBase();
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placadaMoto='" + placadaMoto + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salarioBase=" + salarioBase +
                ", datadeNasciment='" + datadeNasciment + '\'' +
                '}';
    }
}
