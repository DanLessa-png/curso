package atv;

public class Diretor extends Funcionario {
    private double Premio;

    public Diretor(String nome, String datadeNascimento, Sexo sexo, Setor setor, double salarioBase, double premio) {
        super(nome, datadeNascimento, sexo, setor, salarioBase);
        Premio = premio;
    }

    public double getPremio() {
        return Premio;
    }

    public void setPremio(double premio) {
        Premio = premio;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "Premio=" + Premio +
                ", nome='" + nome + '\'' +
                ", datadeNascimento='" + datadeNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                '}';
    }

}
