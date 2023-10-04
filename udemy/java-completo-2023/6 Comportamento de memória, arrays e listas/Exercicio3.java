import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
        * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
          devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
          da pessoa mais velha.

          * Exemplo:
            Quantas pessoas voce vai digitar? 5
            Dados da 1a pessoa:
            Nome: Joao
            Idade: 16
            Dados da 2a pessoa:
            Nome: Maria
            Idade: 21
            Dados da 3a pessoa:
            Nome: Teresa
            Idade: 15
            Dados da 4a pessoa:
            Nome: Carlos
            Idade: 23
            Dados da 5a pessoa:
            Nome: Paulo
            Idade: 17
            PESSOA MAIS VELHA: Carlos
        * */

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas vocÊ vai cadastrar? ");
        PessoaIdade[] pessoas = new PessoaIdade[sc.nextInt()];
        PessoaIdade pessoaMaisVelha = null;

        for (int i=0;i< pessoas.length;i++){
            System.out.println("Dados da "+(i+1)+"º Pessoa");

            System.out.print("Nome:");
            String nome = sc.next();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            pessoas[i] = new PessoaIdade(nome,idade);

            if (pessoaMaisVelha == null || pessoaMaisVelha.getIdade() < pessoas[i].getIdade()){
                pessoaMaisVelha = pessoas[i];
            }
        }

        // assert pessoaMaisVelha != null;
        System.out.println("Pessoa mais velha: "+ pessoaMaisVelha.getNome());

        sc.close();
    }
}
    class PessoaIdade{
       final private String nome;
       final private int idade;


        PessoaIdade (String nome, int idade){
            this.nome = nome;
            this.idade=idade;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }
    }


