import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /*
        Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        seguir, calcule e mostre o valor da conta a pagar.

        Código / Especificao / Preco
        1      / Cachorro quente / R$ 4.00
        2      / X-Salada    / R$ 4.50
        3      / X-Bacon     / R$ 5.00
        4      / Torrada simples / R$ 2.00
        5      / Refrigerante / R$ 1.50

        Exemplos:

        Entrada:    Saída:
        3 2         Total: R$ 10.00

        Entrada:    Saída:
        2 3         Total: R$ 13.50
        */
        int id, quantidade;
        double total, preco = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor id do item: ");
        id = sc.nextInt();

        switch (id){
            case 1:
                preco = 4.00;
                break;
            case 2:
                preco = 4.50;
                break;
            case 3:
                preco = 5.00;
                break;
            case 4:
                preco = 2.00;
                break;
            case 5:
                preco = 1.50;
                break;
        }

        System.out.print("Insira a quantidade de itens que deseja: ");
        quantidade = sc.nextInt();

        total = quantidade * preco;

        System.out.println("Total: " + total);

        sc.close();


    }
}
