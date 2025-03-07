import java.util.Scanner;
import java.util.stream.IntStream;

//maior menor numero
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


        int numeros[] = {3, 6, 9, 13, 14, 27};


        int par[] = new int[6];
        int impar[] = new int[6];

        for(int i = 0; i < numeros.length; i ++) {
            if (numeros[i] % 2 == 0) {
                par[i] = numeros[i];

            }
        }
        for(int i = 0; i < numeros.length; i ++){
            if(numeros[i] % 2 == 1 ){
                 impar[i] = numeros[i];
            }
        }
        for(int i = 0; i < par.length; i++) {
            if (par[i] >0) {
                System.out.println("O numeros pares são: " + par[i]);
            }
        }

        for(int i = 0; i < impar.length; i++) {
            if (impar[i] > 0) {
                System.out.println("O numeros impares são: " + impar[i]);
            }
        }

        leitor.close();
    }
}
