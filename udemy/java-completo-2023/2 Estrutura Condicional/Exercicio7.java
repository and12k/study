import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        /*
        Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
        de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
        ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
        Se o ponto estiver na origem, escreva a mensagem “Origem”.
        Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
        situação.

         q2 |y q1
        _ _ |_ _x
         q3 | q4
            |
        Exemplos:

        Entrada:    Saída:
        4.5 -2.2    Q4
        Entrada:    Saída:
        0.1 0.1     Q1
        Entrada:    Saída:
        0.0 0.0     Origem
        */
        double x, y;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro valor para localização do quadrante: ");
        x = sc.nextDouble();

        System.out.print("Insira o segundo valor para localização do quadrante: ");
        y = sc.nextDouble();

        if (x == 0 && y == 0){
            System.out.println("Origem");
        } else if (x >= 0 && y > 0 || x > 0&& y >=0) {
            System.out.println("Pertence ao quadrante Q1");
        } else if (x <= 0 && y >= 0 ) {
            System.out.println("Pertence ao quadrante Q2");
        } else if (x <= 0 && y <= 0 ) {
            System.out.println("Pertence ao quadrante Q3");
        } else{
            System.out.println("Pertence ao quatrante Q4");
        }

        sc.close();
    }
}
