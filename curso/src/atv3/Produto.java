package atv3;

public  abstract class Produto {
    protected String marca;
    protected String modelo;

    public Produto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }


}
