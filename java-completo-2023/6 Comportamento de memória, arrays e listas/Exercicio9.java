import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
        aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
        digitado, mostrar a mensagem "NENHUM NUMERO PAR"

        Exemplo 1:
        Quantos elementos vai ter o vetor? 6
        Digite um numero: 8
        Digite um numero: 2
        Digite um numero: 11
        Digite um numero: 14
        Digite um numero: 13
        Digite um numero: 20
        MEDIA DOS PARES = 11.0

        Exemplo 2:
        Quantos elementos vai ter o vetor? 3
        Digite um numero: 7
        Digite um numero: 9
        Digite um numero: 11
        NENHUM NUMERO PAR
    */

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");

        int[] n = new int[sc.nextInt()];
        int contagemPar=0, mediaDosPares=0;


        for(int i = 0; i < n.length; i++){
            System.out.print("Digite um numero: ");
            n[i]=sc.nextInt();
            if(n[i]%2==0){

                contagemPar +=1;
                mediaDosPares+=n[i];
            }
        }

        if (contagemPar!=0){
            mediaDosPares=mediaDosPares/contagemPar;
        }


        if (contagemPar!=0){
            System.out.println("Media dos pares = "+mediaDosPares);
        }else{
            System.out.println("Nenhum numero par");
        }


        sc.close();
    }
}
