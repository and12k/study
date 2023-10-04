package ExerciciosFor;

import java.util.Scanner;

public class Exercicio5for {
    public static void main(String[] args) {
        /*
        Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        Lembrando que, por definição, fatorial de 0 é 1.
        Exemplos:
        Entrada: Saída:
        4        24
        Entrada: Saída:
        1        1
        Entrada: Saída:
        5        120
        Entrada: Saída:
        0        1

         */
        int inteiro, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um valor para descobrir seu fatorial: ");
        inteiro = sc.nextInt();
        if (inteiro == 0) {
            System.out.print("Fatorial: " + 1);
        }else {
            resultado=inteiro;
            for (int i = inteiro, j=1; i > 1;i--,j++){
                System.out.println(resultado +" X ("+inteiro+"-"+j+") ="+  resultado);

                resultado = resultado * (inteiro-j);
            }
            System.out.print("Fatorial: "+resultado);
        }
        sc.close();
    }
}
