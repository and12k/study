import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        /*
        A dona de um pensionato possui dez quartos para alugar para estudantes,
        sendo esses quartos identificados pelos números 0 a 9.
        Fazer um programa que inicie com todos os dez quartos vazios, e depois
        leia uma quantidade N representando o número de estudantes que vão
        alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
        N estudantes. Para cada registro de aluguel, informar o nome e email do

            estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
        que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
        um relatório de todas ocupações do pensionato, por ordem de quarto,
        conforme exemplo


        How many rooms will be rented? 3
        Rent #1:
        Name: Maria Green
        Email: maria@gmail.com
        Room: 5

        Rent #2:
        Name: Marco Antonio
        Email: marco@gmail.com
        Room: 1

        Rent #3:
        Name: Alex Brown
        Email: alex@gmail.com
        Room: 8

        Busy rooms:
        1: Marco Antonio, marco@gmail.com
        5: Maria Green, maria@gmail.com
        8: Alex Brown, alex@gmail.com


         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos quartos serão alugados? ");
        int quantidadeDeInquilinos = sc.nextInt();
        sc.nextLine();

        Quarto[] quartos = new Quarto[10];

        int i = 0;
        while (i<quantidadeDeInquilinos) {
            System.out.println("Alocação: "+ ++i +"#");
            String nome, email;
            int numeroQuarto;

            System.out.print("Nome: ");
            nome = sc.next();
            sc.nextLine();

            System.out.print("Email: ");
            email = sc.next();
            sc.nextLine();

            System.out.print("Room: ");
            numeroQuarto = sc.nextInt();

            Quarto quarto = new Quarto();
            quarto.setInquilino(new Pessoa(nome, email),numeroQuarto);

            quartos[numeroQuarto] = quarto;

            System.out.println();
        }

        System.out.println("Quartos ocupados: ");
        for (Quarto quarto: quartos) {
            if (quarto != null){
               System.out.println(quarto.getNumeroQuarto() +": "+quarto.getInquilino().toString());
            }
        }
        sc.close();
    }
}
    class Quarto {
        private Pessoa inquilino;
        private int numeroQuarto;

        public void setInquilino(Pessoa inquilino,int numeroQuarto) {
            this.inquilino = inquilino;
            this.numeroQuarto = numeroQuarto;
        }

        public Pessoa getInquilino() {
            return inquilino;
        }

        public int getNumeroQuarto() {
            return numeroQuarto;
        }
    }

    class Pessoa {
        final private String nome, email;

        public Pessoa(String nome, String email){
            this.nome = nome;
            this.email = email;
        }

        public String getNome() {
            return nome;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public String toString() {
            return getNome() + ", " +
                    getEmail();
        }
    }
