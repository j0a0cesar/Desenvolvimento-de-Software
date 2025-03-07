import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual é quantidade de pessoas para a reserva: ");
        int pessoas = leitor.nextInt();

        while(pessoas > 5 || pessoas <= 0){
            System.out.println("Quantidade invalida!Digite um número (0-5)");
            System.out.print("Qual é quantidade de pessoas para a reserva: ");
            pessoas = leitor.nextInt();
        }

        leitor.close();
    }
}
