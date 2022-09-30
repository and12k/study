import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        /*
        Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        mensagem explicativa, conforme exemplos.
        Exemplos:
        Entrada:
        10
        30
        Saída:
        SOMA = 40

        Entrada:
        -30
        10
        Saída:
        SOMA = -20

        Entrada:
        0
        0
        Saída:
        SOMA = 0
        */

        int inteiro1, inteiro2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro numero:");
        inteiro1 = sc.nextInt();

        System.out.println("Insira o Segundo numero:");
        inteiro2 = sc.nextInt();

        System.out.println("Soma = " + Math.addExact(inteiro1, inteiro2));

        sc.close();



    }
}
