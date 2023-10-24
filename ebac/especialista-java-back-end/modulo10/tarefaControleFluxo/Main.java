import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Calculando nota do aluno: ");

        System.out.println("Entre com as notas do aluno: ");

        Scanner sc = new Scanner(System.in);
        double nota1,nota2, nota3, nota4;
        double notaFinal;

        System.out.print("Primeira nota: ");
        nota1 = sc.nextInt();

        System.out.print("Segunda nota: ");
        nota2 = sc.nextInt();

        System.out.print("Terceira nota: ");
        nota3 = sc.nextInt();

        System.out.print("Quarta nota: ");
        nota4 = sc.nextInt();

        notaFinal= (nota1+nota2+nota3+nota4)/4;

        if (notaFinal < 5){
            System.out.println("Aluno reprovado!");
        } else if (notaFinal < 7){
            System.out.println("ALuno em recuperação");
        } else {
            System.out.println("Aluno aprovado!");
        }

        System.out.println();
        System.out.println("Nota final do aluno: "+ notaFinal/4);

    }
}