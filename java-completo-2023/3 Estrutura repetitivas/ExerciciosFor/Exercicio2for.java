package ExerciciosFor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2for {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
        Exemplo:
        Entrada:
        5
        14
        123
        10
        -25
        32

        Saída:
        2 in
        3 out
        */

        int intervalo,valor, in=0, out=0;
        int[] inteiros;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantos valores serão inseridos: ");
        intervalo = sc.nextInt();
        inteiros = new int[intervalo];

        for (int i = 0; i<inteiros.length;i++)
        {
            System.out.print("Valor "+(i+1)+"º: ");
            valor = sc.nextInt();
            inteiros[i] = valor;
        }
        for(int i=0; i<inteiros.length;i++)
        {
            if (inteiros[i]>=10 && inteiros[i]<=20)
            {
                in+=1;
            }else {
                out+=1;
            }
        }
        System.out.println("In: " +in);
        System.out.println("In: " +out);
        sc.close();
    }
}
