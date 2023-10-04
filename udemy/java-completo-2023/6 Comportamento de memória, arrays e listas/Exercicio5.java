import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /*
        Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
        tela todos os números pares, e também a quantidade de números pares.

        Exemplo:
        Quantos numeros voce vai digitar? 6
        Digite um numero: 8
        Digite um numero: 2
        Digite um numero: 11
        Digite um numero: 14
        Digite um numero: 13
        Digite um numero: 20

        NUMEROS PARES:
        8 2 14 20

        QUANTIDADE DE PARES = 4
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros você vai digitar? ");
        int[] vetor = new int[sc.nextInt()];
        List<Integer> pares = new ArrayList<>();

        for (int i=0; i < vetor.length; i++ ) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
            if(vetor[i]%2!=1){
                pares.add(vetor[i]);
            }
        }
        System.out.println("Numeros Pares: ");
        for (Integer par : pares) {
            System.out.print(par + " ");
        }

        System.out.println("Quantidade de pares = " +pares.size());

        sc.close();


    }
}
