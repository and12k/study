package ExerciciosFor;

import java.util.Scanner;

public class Exercicio1for {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        X, se for o caso.
        Exemplo:
        Entrada:
        8

        Saída:
        1
        3
        5
        7
        */

        int inteiro;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um valor inteiro: ");
        inteiro = sc.nextInt();

        for(;inteiro>=1;inteiro--)
        {
            if(inteiro%2 !=0)
            {
                System.out.println(inteiro);
            }
        }
        sc.close();

    }
}
