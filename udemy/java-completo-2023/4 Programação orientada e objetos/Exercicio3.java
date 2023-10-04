import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        /*
        Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
        (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
        ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
        para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
        resolver este problema.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Nome do aluno: ");
        aluno.setNome(sc.nextLine());

        System.out.print("Primeira nota: ");
        aluno.setNota1(sc.nextDouble());

        System.out.print("Segunda nota: ");
        aluno.setNota2(sc.nextDouble());

        System.out.print("Terceira nota: ");
        aluno.setNota3(sc.nextDouble());

        aluno.avaliacaoDePontuacao();

        sc.close();
    }
}
    class Aluno {
        String nome;
        private double nota1, nota2, nota3;

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setNota1(double nota1) {
            this.nota1 = nota1;
        }

        public void setNota2(double nota2) {
            this.nota2 = nota2;
        }

        public void setNota3(double nota3) {
            this.nota3 = nota3;
        }

        public String getNome() {
            return nome;
        }

        public double getNota1() {
            return nota1;
        }

        public double getNota2() {
            return nota2;
        }

        public double getNota3() {
            return nota3;
        }
        public void avaliacaoDePontuacao(){
            double notaFinal = getNota1()+getNota2()+getNota3();
            System.out.printf("Nota final = %.2f%n", notaFinal);
            if (notaFinal > 59){
                System.out.println("Passou!");
            } else {
                System.out.println("Não Passou!");
                System.out.printf("Faltam %.2f pontos.", (60-notaFinal));
            }
        }
    }
