package ExerciciosFor;

import java.util.Scanner;

public class Exercicio4for {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
        segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
        Exemplo:
        Entrada:
        3
        3 -2
        -8 0
        0 8
        Saída:
        -1.5
        divisao impossivel
        0.0
         */
        int entradas;
        int[][] inteiros;
        double resultado;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira quantos pares serão inseridos: ");
        entradas = sc.nextInt();
        inteiros = new int[entradas][2];

        for (int i=0; i < inteiros.length; i++){
            System.out.println("insira valores da "+(i+1)+"º operação: ");
            for (int j=0;j<2;j++){
                System.out.print((j+1)+"º valor: ");
                inteiros[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i < inteiros.length; i++){
            if(inteiros[i][1]==0){
                System.out.println("Divisao impossivel");
            }else{
                resultado = (double) inteiros[i][0]/inteiros[i][1];
                System.out.println("Resultado da divisão: "+resultado);
            }
        }



        sc.close();

    }


}
