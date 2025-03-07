
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int [] matricula = {1234, 2345, 3456, 4567, 5678, 6789};
        String [] nome = {"Arthur", "Becca", "Bruna","João", "Matheus", "Victor"};
        //int[][] notas = new int[5][5];
        float [][] notas = {
                {7, 8, 9, 10, 6},
                {6, 7, 8, 9, 10},
                {10, 8, 9, 6, 7},
                {6, 9, 8, 7, 10},
                {9, 8, 7, 10, 6},
                {9, 10, 8, 6, 7},
        };
        float [] media = new float[notas.length];
        for(int i = 0; i < notas.length; i ++){
            float soma = 0;
            for( int j = 0; j < notas[i].length; j++){
                soma += notas[i][j];
            }
            media[i] =  soma/ notas[i].length;
        }
        for(int i = 0; i < 6; i ++){
            System.out.println("Nome: "+nome[i]);
            System.out.println("Matrícula: "+matricula[i]);
            System.out.println("Nota 1°: "+notas[i][0]);
            System.out.println("Nota 2°: "+notas[i][1]);
            System.out.println("Nota 3°: "+notas[i][2]);
            System.out.println("Nota 4°: "+notas[i][3]);
            System.out.println("Nota 5°: "+notas[i][4]);
            if(media[i] >= 6){
                System.out.println("APROVADO SIM (X) NÃO()");
            }
            else{
                System.out.println("APROVADO SIM () NÃO(X)");
            }
            System.out.println("Média final: "+media[i]);
        }

        leitor.close();
    }
}
