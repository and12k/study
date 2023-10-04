import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
        Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta,
        o nome do titular da conta, e o valor de depósito inicial que o titular depositou ao abrir
        a conta. Este valor de depósito inicial, entretanto, é opcional, ou seja: se o titular não
        tiver dinheiro a depositar no momento de abrir sua conta, o depósito inicial não será feito
        e o saldo inicial da conta será, naturalmente, zero.
        Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser
        alterado. Já o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por
        ocasião de casamento, por exemplo).
        Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo
        para proteger isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de
        saques. Para cada saque realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode
        ficar com saldo negativo se o saldo não for suficiente para realizar o saque e/ou pagar
        a taxa.
        Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja
        ou não informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um
        saque, sempre mostrando os dados da conta após cada operação.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;
        int numeroConta;
        String titularConta;
        double valor;

        System.out.print("Enter account number: ");
        numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        titularConta = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)?");
        if (sc.next().charAt(0)=='y')
        {
            System.out.print("Enter initial deposit value: ");
            valor= sc.nextDouble();

            conta = new Conta(numeroConta, titularConta, valor);
        }else{
            conta = new Conta(numeroConta, titularConta);
        }

        System.out.println();
        System.out.println("Dados da conta");
        System.out.print(conta);
        System.out.println();

        System.out.println();
        System.out.print("Entre com um valor de depósito: ");
        conta.deposito(sc.nextDouble());
        System.out.println("Dados da conta atualizado: ");
        System.out.print(conta);
        System.out.println();

        System.out.println();
        System.out.print("Enter com um valor de saque: ");
        conta.sacar(sc.nextDouble());
        System.out.println("Dados da conta atualizado: ");
        System.out.print(conta);

        sc.close();

    }
}

    class Conta {

        final private int numeroConta;
        final private String titularConta;
        private double saldo;

        public Conta (int numeroConta, String titularDaConta,double saldo) {
            this.numeroConta = numeroConta;
            this.titularConta=titularDaConta;
            this.deposito(saldo);

        }
        public Conta (int numeroConta, String titularDaConta) {
            this.numeroConta = numeroConta;
            this.titularConta=titularDaConta;
            this.saldo = 0;
        }

        public int getNumeroConta(){
            return numeroConta;
        }

        public String getTitularDaConta() {
            return titularConta;
        }

        public double getSaldo() {
            return saldo;
        }
        public void deposito(double deposito){
            saldo+=deposito;
        }
        public void sacar(double saque){
            double taxa = 5;
            if((saque+ taxa)<saldo) {
                saldo-=saque+ taxa;
            }
            else {
                System.out.println("Saldo insuficiente para saque.");
            }
        }

        @Override
        public String toString() {
            return "Conta: "+numeroConta+", Nome do titular: "+titularConta+", "+String.format("Balance: $ %.2f",saldo);
        }
    }
