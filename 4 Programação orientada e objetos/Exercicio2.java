import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        /*
    Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
    seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
    salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
    afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
    projetada abaixo.

    Employee class
    ----------------
    Name: string
    GrossSalary: double
    Tax: double
    ----------------
    NetSalary(): double
    IncreaseSalary(Percentage: double): void
    ----------------
     */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee empregado = new Employee();

        System.out.print("Nome funcionário: ");
        empregado.setNome(sc.next());

        System.out.print("Salário Bruto: ");
        empregado.setSalario(sc.nextDouble());

        System.out.print("Imposto: ");
        empregado.setImposto(sc.nextDouble());

        System.out.println(empregado);

        System.out.println("Porcentagem do salario a acrescentar: ");
        empregado.atualizaSalario(sc.nextDouble());

        System.out.println("Salário Atualizado: " + empregado);

        sc.close();


    }

}

    class Employee{
        private String nome;
        private double salario, imposto;

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public void setImposto(double imposto) {
            this.imposto = imposto;
        }

        public String getNome() {
            return nome;
        }

        public double getSalario() {
            return salario;
        }

        public double getImposto() {
            return imposto;
        }

        public void atualizaSalario(double porcentagem){
            double novoSalario = ((porcentagem * getSalario())/100)+getSalario();
            setSalario(novoSalario);
        }

        @Override
        public String toString() {
            return getNome()+", $ " + String.format("%.2f",getSalario()-getImposto());
        }
    }