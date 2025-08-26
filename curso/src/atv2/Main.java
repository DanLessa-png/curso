package atv2;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Gabriel",25,"30/06/2025","Cartão de crédito");
        Funcionario funcionario1 = new Funcionario("Maria",34,"32441","Desenvolvedor Júnior",4200.00);
        System.out.println(cliente1.toString());
        System.out.println(funcionario1.toString());
    }
}
