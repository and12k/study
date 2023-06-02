import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        /*
        Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
        uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
        que a pessoa terá que pagar 6% de IOF sobre o valor em dólar, Criar uma classe CurrencyConverter
        para ser responsável pelso cálculos.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double dollarPrice, dollarToBeBought;

        System.out.print("What is the dollar price? ");
        dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        dollarToBeBought = sc.nextDouble();

        System.out.printf("Amount to be paid in Reais = %.2f%n", CurrencyConverter.converter(dollarPrice,dollarToBeBought));


        sc.close();

    }


}
    class CurrencyConverter{
        private static final double IOF = 0.06;

        public static double converter (double dollarPrice, double dollarsToBeBought ){
            double total =dollarPrice*dollarsToBeBought;
            total = total+(total*IOF);
            return total;
        }
    }