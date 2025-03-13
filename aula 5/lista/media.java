import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Construa um programa que leia em um vetor uma sequência de 5 números
        //digitados pelo usuário, calcule a média( dos 5 valores ) destes valores em um outro vetor, e
        //depois apresente na tela quais valores são menores, iguais ou superiores à
        //média.
        float [] vetor = new float[5];
        float soma = 0 ;
        float media = 0;
        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < vetor.length ; i++){
            System.out.print("Digite os valores [" +i+ "] :");
            vetor[i] = leitor.nextFloat();
        }
        for( int i = 0; i < vetor.length; i ++){
            soma += vetor[i];
        }
        media = soma /5;
        for(int i =0; i < vetor.length; i++){
            if( vetor[i] > media){
                System.out.println("A média: "+media+" nota superior a média: "+vetor[i]);
            }
            else if(vetor[i] == media){
                System.out.println("A média: "+media+" nota igual a média: "+vetor[i]);
            }
            else{
                System.out.println("A média: "+media+" nota inferior a media: "+vetor[i]);
            }
        }
    }
}
