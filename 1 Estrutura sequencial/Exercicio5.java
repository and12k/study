import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /*

        Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        Exemplos:
        Entrada:
        12 1 5.30
        16 2 5.10
        Saída:
        VALOR A PAGAR: R$ 15.50

        Entrada:
        13 2 15.30
        161 4 5.20
        Saída:
        VALOR A PAGAR: R$ 51.40

        Entrada:
        1 1 15.10
        2 1 15.10
        Saída:
        VALOR A PAGAR: R$ 30.20

        */
        Scanner sc = new Scanner(System.in);

        int idProduto1, idProduto2,quantidadeProduto1, quantidadeProduto2;
        double valorProduto1, valorProduto2, total;

        System.out.println("Insira o id do produto 1: ");
        idProduto1 = sc.nextInt();

        System.out.println("Insira a quantidade de produtos: ");
        quantidadeProduto1 = sc.nextInt();

        System.out.println("Insira o valor do produto: ");
        valorProduto1 = sc.nextDouble();

        System.out.println("Insira o id do produto 2: ");
        idProduto2 = sc.nextInt();

        System.out.println("Insira a quantidade de produtos: ");
        quantidadeProduto2 = sc.nextInt();

        System.out.println("Insira o valor do produto: ");
        valorProduto2 = sc.nextDouble();

        total = quantidadeProduto1 * valorProduto1 + quantidadeProduto2 * valorProduto2;
        System.out.printf("Valor a pagar: R$ %.2f%n", total );

        sc.close();
    }
}
