import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //  Faça um programa que leia em um vetor uma sequência finita de números
        //digitados pelo usuário. Crie um segundo vetor que armazene o dobro de cada
        //número do primeiro vetor e depois apresente os valores deste vetor.
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o temho do seu vetor: ");
        int tamnho_vetor = leitor.nextInt();

        int [] vetor = new int[tamnho_vetor];


        for(int i = 0; i < vetor.length ; i++){
            System.out.print("Digite os valores inteiros [" +i+ "]: ");
            vetor[i] = leitor.nextInt();
        }
        int [] dobro_vetor = new int [vetor.length];

        for(int i =0; i < vetor.length; i++){
            dobro_vetor[i] = vetor[i] *2;
            System.out.println("O numero: "+vetor[i]+" o dobro dele é: "+dobro_vetor[i]);
            }


        leitor.close();
    }
}
