import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        /*
        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        decimais.

        Exemplos:
        Entrada:
        25
        100
        5.50
        Saída:
        NUMBER = 25
        SALARY = U$ 550.00

        Entrada:
        1
        200
        20.50
        Saída:
        NUMBER = 1
        SALARY = U$ 4100.00

        Entrada:
        6
        145
        15.55
        Saída:
        NUMBER = 6
        SALARY = U$ 2254.75
        */

        int id, horas;
        double hourlyWage, salary;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o id do usuário:");
        id = sc.nextInt();

        System.out.println("Insira as horas trabalhadas:");
        horas = sc.nextInt();

        System.out.println("Insira o salário por hora:");
        hourlyWage = sc.nextDouble();

        salary =horas*hourlyWage;
        System.out.println("Number : " + id);
        System.out.printf("Salario R$ %.2f%n ", salary);

        sc.close();
    }
}
