import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        /*
        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
        o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
        considerando a primeira posição como 0 (zero).

        Exemplo:
        Quantos numeros voce vai digitar? 6
        Digite um numero: 8.0
        Digite um numero: 4.0
        Digite um numero: 10.0
        Digite um numero: 14.0
        Digite um numero: 13.0
        Digite um numero: 7.0

        MAIOR VALOR = 14.0
        POSICAO DO MAIOR VALOR = 3
         */

        Scanner sc = new Scanner(System.in);
        int[][] maior = new int[1][2];

        System.out.print("Quantos numeros você vai digitar? ");
        int[] n = new int[sc.nextInt()];

        for (int i = 0; i < n.length; i++){
            System.out.print("Digite um numero: ");
            n[i]= sc.nextInt();
            if (maior[0][0]<n[i]){
                maior[0][0]=n[i];
                maior[0][1]=i;
            }
        }

        System.out.println();
        System.out.println("Maior valor = " +maior[0][0]);
        System.out.println("Posição do maior valor = " +maior[0][1]);

        sc.close();
    }
}
