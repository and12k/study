import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /*
        Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
        Exemplos:
        Entrada:    Saída:
        16 2 O      JOGO DUROU 10 HORA(S)

        Entrada:    Saída:
        0 0 O       JOGO DUROU 24 HORA(S)


        Entrada:    Saída:
        2 16 O      JOGO DUROU 14 HORA(S)
        */
        Scanner sc = new Scanner(System.in);
        int inicio, fim, total;

        System.out.println("Insira a hora de inicio do jogo: ");
        inicio = sc.nextInt();

        System.out.println("Insira a hora de fim do jogo: ");
        fim = sc.nextInt();

        if (fim-inicio+24 < 1){
            System.out.println("O jogo não bateu o periodo minimo de duração.");
        }
        else if(fim-inicio > 25) {
            System.out.println("O jogo ultrapassou o periodo maximo de duração.");
        } else if (fim > inicio ) {
            total = fim - inicio;
            System.out.println("O jogo durou "+total+" Hora(s).");
        }
        else if (fim < inicio ) {
            total = fim+ 24-inicio;
            System.out.println("O jogo durou "+total+" Hora(s).");
        } else if (fim == inicio) {
            System.out.println("O jogo durou 24 Hora(s).");
        }

        sc.close();

    }
}
