import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        /*
        Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
        terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
        o vetor C gerado.

        Exemplo:
        Quantos valores vai ter cada vetor? 6

        Digite os valores do vetor A:
        8
        2
        11
        14
        13
        20

        Digite os valores do vetor B:
        5
        10
        3
        1
        10
        7

        VETOR RESULTANTE:
        13
        12
        14
        15
        23
        27

         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? " );
        int numeroVetores = sc.nextInt();
        int [] a = new int[numeroVetores],b = new int[numeroVetores],c = new int[numeroVetores];

        System.out.println("Digite os valores do vetor A: ");
        for (int i=0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i=0; i < b.length; i++){
            b[i] = sc.nextInt();
        }

        System.out.println("Vetor resultante: ");
        for (int i=0; i < c.length; i++){
            c[i] = a[i]+b[i];
            System.out.println(c[i]);
        }

        sc.close();

    }
}
