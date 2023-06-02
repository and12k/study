import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
        mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
        os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

        Exemplo:
        Quantos elementos vai ter o vetor? 4
        Digite um numero: 10.0
        Digite um numero: 15.5
        Digite um numero: 13.2
        Digite um numero: 9.8

        MEDIA DO VETOR = 12.125
        ELEMENTOS ABAIXO DA MEDIA:
        10.0
        9.8
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        double[] elementos = new double[sc.nextInt()];
        double media = 0;
        for (int i = 0; i < elementos.length; i++){
            System.out.print("Digite um numero: ");
            elementos[i] = sc.nextDouble();
            media += elementos[i]/elementos.length;

        }
        System.out.printf("Média do vetor = %.3f",media);

        System.out.println();
        System.out.println("Elementos Abaixo da média: ");
        for (double elemento : elementos) {
            if (elemento < media) {
                System.out.printf("%.1f", elemento);
                System.out.println();
            }
        }
        sc.close();

    }
}
