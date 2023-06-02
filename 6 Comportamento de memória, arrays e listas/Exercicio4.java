import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /*
    Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
    tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
    bem como os nomes dessas pessoas caso houver.

    Exemplo:
    Quantas pessoas serao digitadas? 5

    Dados da 1a pessoa:
    Nome: Joao
    Idade: 15
    Altura: 1.82

    Dados da 2a pessoa:
    Nome: Maria
    Idade: 16
    Altura: 1.60

    Dados da 3a pessoa:
    Nome: Teresa
    Idade: 14
    Altura: 1.58

    Dados da 4a pessoa:
    Nome: Carlos
    Idade: 21
    Altura: 1.65

    Dados da 5a pessoa:
    Nome: Paulo
    Idade: 17
    Altura: 1.78

    Altura média: 1.69

    Pessoas com menos de 16 anos: 40.0%
    Joao
    Teresa

     */

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas você vai digitar? ");
        PessoaAltura[] pessoa = new PessoaAltura[sc.nextInt()];
        List<PessoaAltura> pessoas = new ArrayList<>();
        double alturaMedia = 0;

        for(int i = 0; i < pessoa.length; i++){
            System.out.println("Dados da "+(1+i)+"º Pessoa");

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura= sc.nextDouble();

            pessoa[i] = new PessoaAltura(nome, idade, altura);
            alturaMedia += pessoa[i].getAltura()/ pessoa.length;

            if(pessoa[i].getIdade() < 16)
                pessoas.add(pessoa[i]);

        }

        System.out.printf("Altura média %.2f", alturaMedia);

        System.out.println();
        System.out.println("Pessoas com menos de 16 anos: " +(100/pessoa.length*pessoas.size())+"%");
        for (PessoaAltura pessoaAltura : pessoas) {
            System.out.println("Nome: " + pessoaAltura.getNome());
        }
    sc.close();
    }

}
    class PessoaAltura {
        String nome;
        int idade;
        double altura;

        PessoaAltura (String nome, int idade, double altura){
            this.nome = nome;
            this.idade  = idade;
            this.altura = altura;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public double getAltura() {
            return altura;
        }
    }
