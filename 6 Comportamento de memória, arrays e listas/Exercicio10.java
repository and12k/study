import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
        no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
        os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
        igual a 6.0 (seis).

        Exemplo:
        Quantos alunos serao digitados? 4

        Digite nome, primeira e segunda nota do 1o aluno:
        Joao Silva
        7.0
        8.5

        Digite nome, primeira e segunda nota do 2o aluno:
        Maria Teixeira
        9.2
        6.5

        Digite nome, primeira e segunda nota do 3o aluno:
        Carlos Carvalho
        5.0
        6.0

        Digite nome, primeira e segunda nota do 4o aluno:
        Teresa Pires
        5.5
        6.5

        Alunos aprovados:
        Joao Silva
        Maria Teixeira
        Teresa Pires

         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        Aluno[] alunos = new Aluno[sc.nextInt()];
        List<Aluno> alunosAprovados = new ArrayList<>();

        for (int i=0;i < alunos.length;i++){
            System.out.println("Digite o nome do aluno, a primeira e a segunda nota do "+(i+1)+"º aluno: ");
            alunos[i] = new Aluno(sc.next());
            sc.nextLine();

            alunos[i].setNota1(sc.nextDouble());
            alunos[i].setNota2(sc.nextDouble());
            System.out.println();

            if ((alunos[i].getNota1()+alunos[i].getNota2())/2<6){
                alunosAprovados.add(alunos[i]);
            }
        }
        System.out.println("Alunos aprovados: ");
        alunosAprovados.forEach(aluno -> System.out.println(aluno.getNome()));





        sc.close();

    }
}

    class Aluno{
        String nome;
        double nota1,nota2;

        public Aluno(String nome){
            this.nome=nome;
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

        public void setNota1(double nota1) {
            this.nota1 = nota1;
        }

        public void setNota2(double nota2) {
            this.nota2 = nota2;
        }
    }
