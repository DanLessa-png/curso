package atv3;

public class Dispositivodearmazenamento extends Produto{

    private String tipoDeConexão;
    private String capacidadearmazenamento;

    public Dispositivodearmazenamento(String marca, String modelo, String tipoDeConexão, String capacidadearmazenamento) {
        super(marca, modelo);
        this.tipoDeConexão = tipoDeConexão;
        this.capacidadearmazenamento = capacidadearmazenamento;
    }

    public String getTipoDeConexão() {
        return tipoDeConexão;
    }

    public void setTipoDeConexão(String tipoDeConexão) {
        this.tipoDeConexão = tipoDeConexão;
    }

    public String getCapacidadearmazenamento() {
        return capacidadearmazenamento;
    }

    public void setCapacidadearmazenamento(String capacidadearmazenamento) {
        this.capacidadearmazenamento = capacidadearmazenamento;
    }

    @Override
    public String toString() {
        return "Dispositivodearmazenamento{" +
                "tipoDeConexão='" + tipoDeConexão + '\'' +
                ", capacidadearmazenamento='" + capacidadearmazenamento + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
