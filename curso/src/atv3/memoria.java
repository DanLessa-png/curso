package atv3;

public class memoria extends Produto {

    private String capacidadearmazenamento;

    public memoria(String marca, String modelo, String capacidadearmazenamento) {
        super(marca, modelo);
        this.capacidadearmazenamento = capacidadearmazenamento;

    }

    public String getCapacidadearmazenamento() {
        return capacidadearmazenamento;
    }

    public void setCapacidadearmazenamento(String capacidadearmazenamento) {
        this.capacidadearmazenamento = capacidadearmazenamento;
    }

    @Override
    public String toString() {
        return "memoria{" +
                "capacidadearmazenamento='" + capacidadearmazenamento + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
