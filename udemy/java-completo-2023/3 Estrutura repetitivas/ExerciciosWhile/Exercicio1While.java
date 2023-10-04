package ExerciciosWhile;

import java.util.Scanner;

public class Exercicio1While {
    public static void main(String[] args) {
        /*

        Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
        Exemplo:
        Entrada:
        2200
        1020
        2022
        2002
        Saída:
        Senha Invalida
        Senha Invalida
        Senha Invalida
        Acesso Permitido

         */
        boolean acesso=false;
        String senha;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Insira a senha para entrar no sistema: ");
            senha=sc.nextLine();

            if (senha.equals("2002")){
                acesso=true;
                System.out.println("Acesso permitido");
            }else{
                System.out.println("Senha invalida");
                System.out.println();
            }



        } while (!acesso);
        sc.close();
    }
}
