package ExerciciosFor;

import java.util.Scanner;

public class Exercicio6for {
    public static void main(String[] args) {
        /*
        Ler um número inteiro N e calcular todos os seus divisores.
        Exemplo:

        Entrada:
        6

        Saída:
        1
        2
        3
        6
         */

        int inteiro;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um valor inteiro: ");
        inteiro = sc.nextInt();
        for (int i = inteiro; i>0;i--)
        {
            if (inteiro%i==0){
                System.out.println(i);
            }

        }


        sc.close();
    }
}
