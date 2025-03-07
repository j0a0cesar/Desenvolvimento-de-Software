import java.util.Scanner;
import java.util.stream.IntStream;

//maior menor numero
public class Main {

    public static  float celsiusTof(float cel){
        return (cel * 9/5) + 32;
    }
    public static int soma(int num1, int num2){
        int soma =num1+ num2;
        return soma;
        
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //celsiusTof(22.f);

        System.out.print("Numero 1: ");
        int num1 = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Numero 2: ");
        int num2 = Integer.parseInt(leitor.nextLine());

        System.out.print("Soma: " +soma(num1, num2));


        leitor.close();
    }
}
