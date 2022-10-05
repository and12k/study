package ExerciciosWhile;

import java.util.Scanner;

public class Exercicio3While {
    public static void main(String[] args) {
        /*

        Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        exemplo.

        Exemplo:
        Entrada:
        8
        1
        7
        2
        2
        4
        Saída:
        MUITO OBRIGADO

        Alcool: 1
        Gasolina: 2
        Diesel: 0

         */

        int alcoolCounter=0, gasolinaCounter=0,dieselCounter=0;
        Scanner sc = new Scanner(System.in);
        String codigo;

        do {
            System.out.println("Insira o código do combustivel: ");
            codigo = sc.nextLine();

            if (codigo.equals("1")){
                alcoolCounter++;
            } else if (codigo.equals("2")) {
                gasolinaCounter++;
            } else if (codigo.equals("3")) {
                dieselCounter++;
            } else if (!codigo.equals("4")) {
                System.out.println("Codigo invalido");
            }
            System.out.println();
        }while (!codigo.equals("4"));

        System.out.println("Muito Obrigado");
        System.out.println();
        System.out.println("Alcool: "+alcoolCounter);
        System.out.println("Gasolina: "+ gasolinaCounter);
        System.out.println("Diesel: "+ dieselCounter);

    }
}
