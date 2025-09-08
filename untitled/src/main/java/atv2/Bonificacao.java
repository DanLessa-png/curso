package atv2;

public enum Bonificacao {
    Gerente(1.3),
    Diretor(1.4);

    private final double valor;

    Bonificacao(double fator) {
        this.valor = fator;
    }

    public double getValor() {
        return valor;
    }

}
