import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

    /*
    Fazer um programa para ler os valores da largura e altura
    de um retângulo. Em seguida, mostrar na tela o valor de
    sua área, perímetro e diagonal. Usar uma classe como
    mostrado no projeto ao lado.

    Rectangle class
    ----------------
    Altura: Double
    Largura: Double
    ----------------
    + Area(): Double
    + Perimeter(): Double
    + Diagonal(): Double
    ----------------
    */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a altura e a largura do retangulo:");
        Rectangle rectangle = new Rectangle();
        rectangle.setAltura(sc.nextDouble());
        rectangle.setLargura(sc.nextDouble());
        System.out.printf("Area = %.2f%n", rectangle.calcularArea());
        System.out.printf("Perimetro = %.2f%n", rectangle.calcularPerimetro());
        System.out.printf("Diagonal = %.2f%n", rectangle.calcularDiagonal());
        sc.close();




    }

}
class Rectangle{
    private double altura, largura;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double calcularArea(){
        return getAltura()*getLargura();
    }

    public double calcularPerimetro(){
        return 2*(getAltura()+getLargura());
    }

    public double calcularDiagonal(){
        return Math.sqrt(((getAltura()*getAltura())+(getLargura()*getLargura())));
    }
}