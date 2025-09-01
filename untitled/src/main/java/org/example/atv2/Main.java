package org.example.atv2;

public class Main {
    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro("Gabriel","Gabriel@estacio.com",new Endereco("Praça irmã Jovem","13","Terreo","3232231","Salvador"),2499.00,"cre-ba");
        Medico medico = new Medico("Lucas","Lucas@estacio.com",new Endereco("Hospital Irmã Dulce","34","Terreo","40436558","Salvador"),5999.00,"daskas");
        System.out.println(engenheiro.toString());
        System.out.println(medico.toString());
    }
}
