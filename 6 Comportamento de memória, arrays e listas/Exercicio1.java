import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
        Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

        Exemplo:
        Quantos numeros voce vai digitar? 6
        Digite um numero: 8
        Digite um numero: -2
        Digite um numero: 9
        Digite um numero: 10
        Digite um numero: -3
        Digite um numero: -7
        NUMEROS NEGATIVOS:
        -2
        -3
        -7
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros você pretende digitar digitar? ");
        int[] inteiros  = new int[sc.nextInt()];
        for (int i=0; i < inteiros.length;i++){
            System.out.print("Digite um numero: ");
            inteiros[i] = sc.nextInt();
        }
        System.out.print("Numeros negativos");
        for (int inteiro : inteiros) {
            if (inteiro < 0) {
                System.out.println(inteiro);
            }
        }
        sc.close();

    }


}
