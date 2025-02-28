import java.util.Scanner;

public class Main {

    public static void desafio01(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = leitor.nextInt();

        numero = numero * 2;

        System.out.print("O dobro do numero é " + numero);

        leitor.close();
    }
    public static void desafio02(){
       Scanner leitor = new Scanner(System.in);

        System.out.print("Dia: ");
        int dia = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Mês: ");
        String mes = leitor.nextLine();

        System.out.print("Ano: ");
        int ano = leitor.nextInt();

        System.out.print("Você nasceu no dia "+dia+" de "+mes+" de " +ano+ ". Correto?");

        leitor.close();
    }
    public static void desafio03(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int numero1 = leitor.nextInt();


        System.out.print("Segundo número: ");
        int numero2 = leitor.nextInt();

        int soma = numero1 + numero2;
        System.out.print("Soma é " +soma);

        leitor.close();
    }
    public static void desafio04(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = leitor.nextInt();

        int ant = numero - 1;

        int suc = numero + 1;
        System.out.print("Antecessor do número " +numero+ " é " +ant+ " e o sucessor é " +suc+ "!");

        leitor.close();
    }
    public static void main(String[] args) {
    //desafio01();

    //desafio02();
    
    //desafio03();
    
    //desafio04();


    }

}
