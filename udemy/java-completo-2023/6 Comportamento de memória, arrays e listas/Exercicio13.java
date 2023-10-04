import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
        N funcionários. Não deve haver repetição de id.
        Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
        Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
        mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
        conforme exemplos.
        Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
        ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
        aumento por porcentagem dada.

        How many employees will be registered? 3

        Emplyoee #1:
        Id: 333
        Name: Maria Brown
        Salary: 4000.00

        Emplyoee #2:
        Id: 536
        Name: Alex Grey
        Salary: 3000.00

        Emplyoee #3:
        Id: 772
        Name: Bob Green
        Salary: 5000.00

        Enter the employee id that will have salary increase : 536
        Enter the percentage: 10.0
        List of employees:
        333, Maria Brown, 4000.00
        536, Alex Grey, 3300.00
        772, Bob Green, 5000.0

        ------------------------------

        How many employees will be registered? 2
        Emplyoee #1:
        Id: 333
        Name: Maria Brown
        Salary: 4000.00

        Emplyoee #2:
        Id: 536
        Name: Alex Grey
        Salary: 3000.00

        Enter the employee id that will have salary increase: 776
        This id does not exist!
        List of employees:
        333, Maria Brown, 4000.00
        536, Alex Grey, 3000.00
        */
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos empregados serão registrados?");
        int numeroEmpregados = sc.nextInt();

        List<Funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < numeroEmpregados;){
            System.out.println("Empregado "+ ++i +"#");

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            while (validaId(funcionarios, id)){
                System.out.println("Id já existente.");
                System.out.print("Por favor insira outro: ");
                id = sc.nextInt();
                sc.nextLine();
            }

            System.out.print("Nome: ");
            String nome = sc.next();
            sc.nextLine();

            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            sc.nextLine();

            Funcionario funcionario = new Funcionario(id,nome,salario);
            funcionarios.add(funcionario);

            System.out.println();

        }
        System.out.print("Insira a ID do funcionario que terá aumento de salário: ");
        int id = sc.nextInt();

        System.out.print("Insira a porcentagem do aumento sobre o salário: ");
        double aumento = funcionarios.stream().filter(funcionario -> funcionario.getId() == id).findFirst().get().getSalario()*sc.nextDouble()/100;

        if (validaId(funcionarios,id)){
            funcionarios
                    .stream()
                    .filter(funcionario -> funcionario
                            .getId() == id)
                    .findFirst()
                    .get()
                    .setSalario(funcionarios
                            .stream()
                            .filter(funcionario -> funcionario
                                    .getId() == id).findFirst()
                            .get()
                            .getSalario()+aumento);
        }else {
            System.out.println("Funcionário inexistente.");
        }
        System.out.println("Lista de funcionários: ");
        funcionarios.forEach(System.out::println);

        sc.close();
    }

    static boolean validaId(List<Funcionario> funcionarios,int id){
        /*List<Integer> ids = new ArrayList<>();
        if (funcionarios.isEmpty()){
            return false;
        }
        funcionarios.forEach(funcionario -> ids.add(funcionario.getId()));
        return ids.contains(id);
         */
        return  funcionarios.stream().filter(f->f.getId()==id).findFirst().orElse(null) != null;
    }
}


    class Funcionario {
        Integer id;
        String nome;
        double salario;

        public Funcionario (int id, String nome, double salario){
            this.id = id;
            this.nome = nome;
            this.salario = salario;
        }

        public int getId() {
            return id;
        }

        public String getNome() {
            return nome;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        @Override
        public String toString() {
            return id+", "+nome+", "+ String.format("%.2f", salario) ;
        }
    }