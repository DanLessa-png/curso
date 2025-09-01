package org.example.atv1;

public class Main {
    public static void main(String[] args) {
        Fisica fisica = new Fisica("Dan","71983728765","06973828732","3928738293","09/11/2005");
        Juridica juridica = new Juridica("Lessa","71083974828","48329423","32131");
        System.out.println(fisica.toString());
        System.out.println(juridica.toString());
    }
}
