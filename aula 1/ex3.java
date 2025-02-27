import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner leitor = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int numero1 = leitor.nextInt();


        System.out.print("Segundo número: ");
        int numero2 = leitor.nextInt();

        int soma = numero1 + numero2;
        System.out.print("Soma é " +soma);

        leitor.close();
    }
}
