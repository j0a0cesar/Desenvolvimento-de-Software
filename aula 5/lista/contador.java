import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Elabore um programa que leia 5 números do teclado e os armazene em um
        //vetor. Em seguida, leia um número n qualquer e apresente na tela a
        //quantidade de vezes que o número n aparece no vetor.
        Scanner leitor = new Scanner(System.in);


        int [] vetor = new int[5];
        int count = 0;

        for(int i = 0; i < vetor.length ; i++){
            System.out.print("Digite os valores inteiros [" +i+ "] :");
            vetor[i] = leitor.nextInt();
        }
        System.out.print("Digite um inteiro qualquer: ");
        int adivinha = leitor.nextInt();

        System.out.println("Posição: ");
        for(int i =0; i < vetor.length; i++){
            if( vetor[i] == adivinha){
            System.out.println("Na posicão: "+i+" o número : "+vetor[i]+" é igual a digita pelo usuario: "+adivinha);
            count ++;
            }
        }
        if(count > 0){
        System.out.println("O número : "+adivinha+" apareceu : "+count+"X ");
        }
        else{
        System.out.println("Não tem o número digitado pelo usuario: "+adivinha);
        }
        leitor.close();
    }
}
