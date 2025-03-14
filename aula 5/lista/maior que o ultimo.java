
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;



public class Main {
// Elabore um algoritmo que leia 5 números do teclado e preencha um vetor de
//acordo com a seguinte regra: com exceção do 1º número, só é permitido
//armazenar um número se ele for maior que o anterior. Ex.: se o primeiro valor
//lido for 5, o próximo valor lido só poderá ser maior que 5
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
         int [] vetor = new int[5];

         System.out.print("Digite um valor inteiro: ");
         vetor[0] = input.nextInt();

         for(int i = 1; i < vetor.length; i++){
             System.out.print("Digite um valor inteiro: ");
             vetor[i] = input.nextInt();
             while(vetor[i] <= vetor[i -1]){
                 System.out.print("Digite um novo valor inteiro: ");
                 vetor[i] = input.nextInt();
             }
         }
         for(int i = 0; i < vetor.length; i++) {
             System.out.println("Os valores do seu arry são: "+vetor[i]);
         }
         input.close();

}
}
