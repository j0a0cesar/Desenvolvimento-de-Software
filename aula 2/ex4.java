import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //verificar se o numero é primo
        //divisivel por 2 e por ele mesmo
        //o 1 não é primo
        //2,3,5,7...


        System.out.print("Digite um número: ");
        int num = leitor.nextInt();

        // Verifica se o número é menor que 2 (não é primo)
        if (num < 2) {
            System.out.println("O número " + num + " não é primo.");
        } else {
            boolean ehPrimo = true;

            // Verifica divisibilidade de 2 até a raiz quadrada do número
            for (int i = 2; i <= sqrt(num); i++) {
                if (num % i == 0) {
                    ehPrimo = false;
                    break; // Se encontrou um divisor, sai do loop
                }
            }

            // Exibe o resultado
            if (ehPrimo) {
                System.out.println("O número " + num + " é primo.");
            } else {
                System.out.println("O número " + num + " não é primo.");
            }
        }

        leitor.close();
    }
}
