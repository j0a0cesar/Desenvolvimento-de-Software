
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;



public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número, para saber a tabuada: ");
        int numero = input.nextInt();
        int tabuada = 0;

        for(int i = 1; i <= 10; i ++) {
            tabuada = numero * i;
            System.out.println("A tabuada do numero: " +numero+ " X " +i+ "= "+tabuada);
        }



}
}
