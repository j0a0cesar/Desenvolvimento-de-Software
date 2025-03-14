
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;



public class Main {
// Elabore um programa que leia um vetor com 5 notas de um aluno e um outro
//vetor com 5 pesos e calcule a média ponderada do aluno.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
         int [] vetor = new int[5];

         System.out.println("----------");
        System.out.println("Entrada de Dados:");


         for(int i = 0; i < vetor.length; i++){
             System.out.print("Digite os valor da sua nota ["+i+"]: ");
             vetor[i] = input.nextInt();

         }
         float media_polderada = 0;
         float peso1 = 1, peso2 = 2, peso3 = 3, peso4 = 4, peso5 = 5;
         media_polderada = ((vetor[0] * peso1) + (vetor[1] * peso2) + (vetor[2] * peso3) + (vetor[3] * peso4) + (vetor[4] * peso5)) /(peso1+peso2+peso3 +peso4+peso5);
         System.out.print("A média polderada é: "+media_polderada);

         input.close();

}
}
