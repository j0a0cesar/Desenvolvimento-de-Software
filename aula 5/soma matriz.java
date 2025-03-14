
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;



public class Main {
// Escreva um programa que alimente uma matriz de 2 x 3 elementos inteiros e, utilizando estruturas de
//repetição, apresente na tela a soma de todos os elementos da matriz.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
         int [][] matriz = new int[2][3];

         for(int i = 0; i < 2;i++){
             for(int j = 0; j < 3; j++){
                 System.out.print("Digite o valor para posicão ["+i+"] ["+j+"] : ");
                 matriz[i][j] = input.nextInt();
             }
         }
         int soma = 0;
        for(int i = 0; i < 2;i++){
            for(int j = 0; j < 3; j++){
            soma += matriz[i][j];
            }
        }

        System.out.print("A soma dos elementos da matriz: "+soma);

}
}
