import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        Exemplos:
        Entrada:    Saída:
        -10         NEGATIVO
        Entrada:    Saída:
        8           NAO NEGATIVO
        Entrada:    Saída:
        0           NAO NEGATIVO
        */
        int inteiro;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um valor inteiro: ");

        inteiro = sc.nextInt();


        if (inteiro >= 0){
            System.out.printf("Nao negativo");
        }
        else{
            System.out.printf("Negativo");
        }

        sc.close();
    }
}
