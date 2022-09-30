import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        /*
        Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.

        Exemplos:
        Entrada:
        3.0 4.0 5.2
        Saída:
        TRIANGULO: 7.800
        CIRCULO: 84.949
        TRAPEZIO: 18.200
        QUADRADO: 16.000
        RETANGULO: 12.000

        Entrada:
        12.7 10.4 15.2
        Saída:
        TRIANGULO: 96.520
        CIRCULO: 725.833
        TRAPEZIO: 175.560
        QUADRADO: 108.160
        RETANGULO: 132.080
        */

        Scanner sc = new Scanner(System.in);

        float valorA, valorB, valorC, triangulo, circulo, trapezio, quadrado, retangulo;
        double pi = 3.14159;

        System.out.println("Insira o valor de A: ");
        valorA = sc.nextFloat();

        System.out.println("Insira o valor de B: ");
        valorB = sc.nextFloat();

        System.out.println("Insira o valor de C: ");
        valorC = sc.nextFloat();

        triangulo = valorA * valorC/2;
        System.out.printf("Triangulo: %.3f%n", triangulo);

        circulo = (float) (valorC*valorC*pi);
        System.out.printf("Circulo: %.3f%n", circulo);

        trapezio = (valorA+valorB)*valorC/2;
        System.out.printf("Trapezio: %.3f%n", trapezio );

        quadrado = valorB*valorB;
        System.out.printf("Quadrado: %.3f%n", quadrado);

        retangulo = valorA*valorB;
        System.out.printf("Retangulo: %.3f%n", retangulo);

        sc.close();
    }
}
