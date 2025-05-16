import java.util.Scanner;

public class InputHelp {
    static Scanner scan = new Scanner(System.in);

    public static int pegarNumeroRangne(String texto, int de, int ate){
        int num = -1;
        do{
            num = pegarNumero(texto);
        }while (num  < de || num > ate);

        return num;
    }

    public static int pegarNumero(String texto) {

        int num = -1;
        boolean erro = true;

        do {
            System.out.println(texto);
            try {
                num = Integer.parseInt(scan.nextLine());
                erro = false;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("\u001B[Digite um numero valido...\u001B[0m");
                System.out.println();
            }
        }while (erro);
        return num;
    }
}
