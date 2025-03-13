import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Escreva um algoritmo que leia em um vetor uma sequência finita(perguntar o tamnho do vetor) de números
        //digitados pelo usuário e, logo após, mostre o número de cada posição do
        //vetor e se ele é positivo, negativo ou zero.
        Scanner leitor = new Scanner(System.in);

            System.out.print("Digite o tamnho do seu vetor: ");
            int tamnho_vetor = leitor.nextInt();


        int [] vetor = new int[tamnho_vetor];


        for(int i = 0; i < vetor.length ; i++){
            System.out.print("Digite os valores inteiros [" +i+ "] :");
            vetor[i] = leitor.nextInt();
        }

        for(int i =0; i < vetor.length; i++){
            if( vetor[i] > 0){
                System.out.println("Na posicão: "+i+" o número: "+vetor[i]+" é maior que 0");
            }
            else if(vetor[i] < 0){
                System.out.println("Na posicão: "+i+" o número: "+vetor[i]+" é menor que 0");
            }
            else{
                System.out.println("Na posicão: "+i+" o número: "+vetor[i]+" é igual a 0");
            }
        }
    }
}
