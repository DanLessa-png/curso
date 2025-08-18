//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //instanciar a classe
        Cliente c1 = new Cliente();
        produto p1 = new produto();

        //Atribuindo valores.
        //c1.nome= "marta";
        c1.setNome("Marta");
        //c1.idade= 25;
        c1.setIdade(25);
        p1.setNome ("notebook");
        p1.setPreçounitario (4000);

        //exibindo dados.
        System.out.println("nome: "+ c1.getNome());
        System.out.println("idade: "+ c1.getIdade());
        System.out.println("\n Nome do Produto: "+ p1.getNome());
        System.out.println("Preço unitário: "+ p1.getPreçounitario());
    }
    }

