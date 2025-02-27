// Desenvolvimento-de-Software
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = leitor.nextInt();

        numero = numero * 2;

        System.out.print("O dobro do numero é " + numero);

        leitor.close();
    }
}
