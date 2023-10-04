import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        /*
        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        Exemplos:
        Entrada:
        5
        6
        7
        8
        Saída:
        DIFERENCA = -26

        Entrada:
        5
        6
        -7
        8
        Saída:
        DIFERENCA = 86'
        */
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro valor: ");
        a = sc.nextInt();

        System.out.println("Insira o segundo valor: ");
        b = sc.nextInt();

        System.out.println("Insira o terceiro valor: ");
        c = sc.nextInt();

        System.out.println("Insira o quarto valor: ");
        d = sc.nextInt();

        System.out.println("Diferença = " + Math.subtractExact((a*b),(c*d)));
        sc.close();
    }
}
