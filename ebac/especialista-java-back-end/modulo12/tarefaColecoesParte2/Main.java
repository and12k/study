import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        List<Pessoa> pessoas = new ArrayList<>();

        while (continuar) {
            System.out.println("Insira o nome da pessoa: ");
            String nome = sc.nextLine();

            System.out.println("Insira o sexo de " +nome+" classificado por M ou F:");
            String sexo = sc.nextLine();

            pessoas.add(new Pessoa(nome, sexo));

            System.out.println();

            System.out.println("Deseja inserir mais pessoas?(S/N)");
            String desejaContinuar = sc.nextLine().toLowerCase();

            switch (desejaContinuar){
                case "s":
                    System.out.println("Continuando cadastro!");
                    break;
                case "n":
                    System.out.println("Encerrando cadastro!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção invalida, encerrando cadastro cadastro!");
                    continuar = false;
                    break;
            }
        }
        System.out.println("Pessoas do sexo masculino:");
        pessoas.forEach(pessoa -> {
            if (pessoa.getSexo().equalsIgnoreCase("m")){
                System.out.println(pessoa.getNome());
            }
        });

        System.out.println("Pessoas do sexo feminino:");
        pessoas.forEach(pessoa -> {
            if (pessoa.getSexo().equalsIgnoreCase("f")){
                System.out.println(pessoa.getNome());
            }
        });











        sc.close();
    }
}