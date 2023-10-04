import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        /*
        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
            - Imprimir todos os elementos do vetor
            - Mostrar na tela a soma e a média dos elementos do vetor

            Exemplo:
            Quantos numeros voce vai digitar? 4
            Digite um numero: 8.0
            Digite um numero: 4.0
            Digite um numero: 10.0
            Digite um numero: 14.0
            VALORES = 8.0 4.0 10.0 14.0
            SOMA = 36.00
            MEDIA = 9.00
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros você vai digitar? ");
        double soma=0;
        double[] n = new double[sc.nextInt()];

        for (int i=0; i < n.length;i++){
            System.out.print("Digite um numero: ");
            n[i]=sc.nextDouble();
        }
        System.out.print("Valores = ");
        for (double v : n) {
            System.out.print(v + " ");
            soma += v;
        }
        System.out.println();
        System.out.println("Soma = " +soma);
        System.out.println("Media = "+ soma/(n.length+1));

        sc.close();
    }
}
