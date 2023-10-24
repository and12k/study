import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira uma variavel: ");

        double i= sc.nextDouble();

        Double n = (double) i;

        System.out.println("Validação de conversão de variavel para classe" + n.getClass());
        System.out.println("Leitura da variavel: "+ n);

    }
}