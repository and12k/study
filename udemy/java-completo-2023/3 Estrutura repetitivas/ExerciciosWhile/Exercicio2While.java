package ExerciciosWhile;

import java.util.Scanner;

public class Exercicio2While {
    public static void main(String[] args) {
        /*
        Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
        cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

        Exemplo:
        Entrada:
        2 2
        3 -2
        -8 -1
        -7 1
        0 2

        Saída:
        primeiro
        quarto
        terceiro
        segundo

         */

        double x, y;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Insira o primeiro valor para localização do quadrante: ");
            x = sc.nextDouble();

            System.out.print("Insira o segundo valor para localização do quadrante: ");
            y = sc.nextDouble();

            if (x > 0 && y > 0) {
                System.out.println("Primeiro quadrante");
            } else if (x < 0 && y > 0 ) {
                System.out.println("Segundo quadrante");
            } else if (x < 0 && y < 0 ) {
                System.out.println("Terceiro quadrante");
            } else if(x > 0 && y < 0){
                System.out.println("Quarto quadrante");
            }
            System.out.println();

        }while (x !=0 && y != 0);

        sc.close();
    }
}
