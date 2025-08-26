package atv3;

public class Placamae extends Produto {
    private String soquete;

    public Placamae(String marca, String modelo, String soquete) {
        super(marca, modelo);
        this.soquete = soquete;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }

    @Override
    public String toString() {
        return "Placamae{" +
                "soquete='" + soquete + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
