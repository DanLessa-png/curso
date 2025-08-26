package atv3;

public class Main {
    public static void main(String[] args) {
        Processador processador1 = new Processador("AMD", "Ryzen 5 5500", "3,6 ghz");
        memoria memoria1 = new memoria("Kingstom", "rpm3230", "16gb");
        Placamae placamae = new Placamae("Asus","Tuf Gaming","LGA 1155");
        Dispositivodearmazenamento dispositivodearmazenamento = new Dispositivodearmazenamento("Corsair","SSD","M.2","1TB");

        System.out.println(memoria1.toString());
        System.out.println(dispositivodearmazenamento.toString());
        System.out.println(processador1.toString());
        System.out.println(placamae.toString());
    }
}