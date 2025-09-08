package atv2;

public abstract class Funcionario implements SalarioFinal {
    protected String nome;
    protected String cpf;
    protected double salarioBase;
    protected String datadeNasciment;

    public Funcionario(String nome, String cpf, double salarioBase, String datadeNasciment) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.datadeNasciment = datadeNasciment;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getDatadeNasciment() {
        return datadeNasciment;
    }

    public void setDatadeNasciment(String datadeNasciment) {
        this.datadeNasciment = datadeNasciment;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salarioBase=" + salarioBase +
                ", datadeNasciment='" + datadeNasciment + '\'' +
                '}';
    }
}
