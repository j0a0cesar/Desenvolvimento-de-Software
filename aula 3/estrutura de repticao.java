import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira a quantidade de produtos: ");

        int quantidade = leitor.nextInt();

        float soma = 0;

        for( int i = 0; i <= quantidade; i++){
            System.out.print("Digite o preço dos produtos: "+i+1);
            float preco = leitor.nextFloat();
            soma += preco;
        }

        System.out.print("Valor total: " +soma);

                leitor.close();

    }
}
