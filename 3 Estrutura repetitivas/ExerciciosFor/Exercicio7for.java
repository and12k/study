package ExerciciosFor;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio7for {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
        começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
        exemplo.

        Exemplo:
        Entrada:
        5
        Saída:
        1 1 1
        2 4 8
        3 9 27
        4 16 64
        5 25 125
        */
        int inteiro;
        int[] impressao =new int[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor inteiro: ");
        inteiro = sc.nextInt();

        for (int i = 1; i <= inteiro; i++ ){

            impressao[0]=i;
            impressao[1]=i*i;
            impressao[2]=i*i*i;

            System.out.println(impressao[0]+" "+impressao[1]+" "+impressao[2]);

        }

    }
}
