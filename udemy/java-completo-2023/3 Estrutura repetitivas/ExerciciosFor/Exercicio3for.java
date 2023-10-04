package ExerciciosFor;

import java.util.Scanner;

public class Exercicio3for {
    public static void main(String[] args) {
        /*
        Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
        de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
        conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
        peso 5.
        Exemplo:
        Entrada:
        3
        6.5 4.3 6.2
        5.1 4.2 8.1
        8.0 9.0 10.0

        Saída:
        5.7
        6.3
        9.3
         */
        int quantidadeDeAnalises;
        double notas[][], nota, media=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas avaliações seram feitas: ");
        quantidadeDeAnalises = sc.nextInt();
        notas = new double[quantidadeDeAnalises][3];
        System.out.println(notas.length);
        for (int i=0; i<notas.length;i++) {
            System.out.println("Insira as notas da "+(i+1)+" prova.");
            for(int j=0; j<3; j++){
                System.out.println("Insira a "+(j+1)+"º  nota: ");
                nota = sc.nextDouble();

                if (j==0){
                    notas[i][j] = nota*0.2;
                } else if (j==1) {
                    notas[i][j] = nota*0.3;
                } else{
                    notas[i][j] = nota*0.5;
                }
            }
        }
        for (int i=0; i<notas.length;i++) {
            media=0;
            for (int j = 0; j < 3; j++) {
                media += notas[i][j];
                if (j + 1 == 3) {
                    System.out.printf("Média: %.2f%n",(media));
                }
            }
        }
        sc.close();
    }
}
