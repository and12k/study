import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
        Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser
        digitados em ordem crescente ou decrescente.

        Exemplos:
        Entrada:    Saída:
        6 24        Sao Multiplos

        Entrada:    Saída:
        6 25        Nao sao Multiplos

        Entrada:    Saída:
        24 6        Sao Multiplos
        */

        int inteiro1, inteiro2, maior, menor;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o primeiro valor inteiro: ");
        inteiro1 = sc.nextInt();

        System.out.print("Insira o segundo valor inteiro: ");
        inteiro2 = sc.nextInt();

        if (inteiro1 % inteiro2 == 0 || inteiro2 % inteiro1 == 0){
            System.out.println("São multiplos");
        }
        else {
            System.out.println("Não são multiplos");
        }
    }
}
