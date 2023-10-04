import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
        Exemplos:
        Entrada: Saída:
        12       PAR
        Entrada: Saída:
        -27      IMPAR
        Entrada: Saída:
        0        PAR
        */

        int inteiro;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um valor inteiro: ");

        inteiro = sc.nextInt();

        if(inteiro % 2 ==0 ){
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
        }

        sc.close();
    }

}
