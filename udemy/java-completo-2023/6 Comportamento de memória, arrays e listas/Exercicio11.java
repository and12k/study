import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        /*
        Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
        que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
        de homens.

        Exemplo:
        Quantas pessoas serao digitadas? 5

        Altura da 1a pessoa: 1.70
        Genero da 1a pessoa: F

        Altura da 2a pessoa: 1.83
        Genero da 2a pessoa: M

        Altura da 3a pessoa: 1.54
        Genero da 3a pessoa: M

        Altura da 4a pessoa: 1.61
        Genero da 4a pessoa: F

        Altura da 5a pessoa: 1.75
        Genero da 5a pessoa: F

        Menor altura = 1.54
        Maior altura = 1.83

        Media das alturas das mulheres = 1.69

        Numero de homens = 2

         */

        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        double maiorAltura=0, menorAltura=0, mediaAltura = 0;
        List<PessoaAlturaGenero> homens = new ArrayList<>(), mulheres = new ArrayList<>();

        System.out.print("Quantas pessoas serão inclusas? ");
        PessoaAlturaGenero[] pessoa =  new PessoaAlturaGenero[sc.nextInt()];


        System.out.println();

        for (int i = 0; i < pessoa.length; i++){
            pessoa[i] = new PessoaAlturaGenero();

            System.out.print("Altura da "+(i+1)+"º pessoa: ");
            pessoa[i].setAltura(sc.nextDouble());

            System.out.print("Genero da "+(i+1)+" º pessoa: ");
            pessoa[i].setGenero(sc.next().charAt(0));

            System.out.println();

            if (pessoa[i].getGenero()=='H'){
                homens.add(pessoa[i]);
            }else{
                mulheres.add(pessoa[i]);
            }

            if (pessoa[i].getAltura() > maiorAltura){
                maiorAltura = pessoa[i].getAltura();
            }  else if (pessoa[i].getAltura() < menorAltura) {
                menorAltura = pessoa[i].getAltura();
            }

            if (menorAltura ==0 ) {
               menorAltura = pessoa[i].getAltura();
            }
        }

        System.out.printf("Menor altura : %.2f",menorAltura);
        System.out.println();

        System.out.printf("Maior altura : %.2f",maiorAltura);
        System.out.println();

        System.out.println();

        for(int i = 0; i < mulheres.size(); i++ ){
            mediaAltura += mulheres.get(i).getAltura()/mulheres.size();
        }

        System.out.printf("Media de altura das mulheres: %.2f", mediaAltura);
        System.out.println();
        System.out.println();

        System.out.println("Numero de homens: "+ homens.size());



        sc.close();
    }
}
    class PessoaAlturaGenero{
        private double altura;
        private char genero;

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public void setGenero(char genero) {
            this.genero = genero;
        }

        public double getAltura() {
            return altura;
        }

        public char getGenero() {
            return genero;
        }
    }

