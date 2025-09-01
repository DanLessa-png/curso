package org.example.polimorfismo;

public class Cachorro implements Animal{

    @Override
    public String emitirsom() {
        return "Auau, alimento seu humano desgraçado";
    }
}
