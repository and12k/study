import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Main.exercicioParte1(sc);

        Main.exercicioParte2(sc);

        sc.close();
    }
    public static void exercicioParte1(Scanner sc){
        System.out.print("Insira uma sequencia de nomes separados por ESPAÇO: ");

        final List<Pessoa> Pessoas = new ArrayList<>();

        Arrays.stream(sc.nextLine().split(" ")).forEach(nome -> Pessoas.add(new Pessoa(nome)) );
        
        Collections.sort(Pessoas);

        Pessoas.forEach(pessoa -> System.out.println(pessoa.getNome()));
    }
    public static void exercicioParte2(Scanner sc){

        System.out.println("Insira uma sequencia de nomes junto com seus sexos unificados por '-' e logo após os separe por ESPAÇO: (Exemplo Andre-M Renata-F) ");

        final List<Pessoa> Pessoas = new ArrayList<>();

        String[] pessoasInseridas = sc.nextLine().split(" ");

        for (String nomeESexo : pessoasInseridas){

            String[] novaPessoa = nomeESexo.split("-");
            String nome = novaPessoa[0];
            char sexo = novaPessoa[1].toUpperCase().charAt(0);
            Pessoas.add(new Pessoa(nome, sexo));
        }

        Collections.sort(Pessoas);

        System.out.println("Pessoas do grupo Masculino:");
        Pessoas.forEach(pessoa -> {if(pessoa.getSexo() == 'M') {System.out.println(pessoa.getNome());}});

        System.out.println("Pessoas do grupo Feminino:");
        Pessoas.forEach(pessoa -> {if(pessoa.getSexo() == 'F') {System.out.println(pessoa.getNome());}});
    }

}