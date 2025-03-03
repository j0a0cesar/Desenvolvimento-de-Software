import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //saldo inicial
        //saquar
        //depositar
        //sair

        Scanner leitor = new Scanner(System.in);


        System.out.print("Digite a operação desejada:\n[1] Saldo Incial\n[2] Saquar\n[3] Depositar\n[4] Sair\n");
        int op = leitor.nextInt();

        float saldo = 10000;

        switch (op) {
            case 1:

                System.out.print("O saldo é de: " + saldo);
                break;
            case 2:

                System.out.print("Digite o valor que deseja sacar: ");
                float valor = leitor.nextFloat();
                if (valor <= saldo) {
                    saldo = saldo - valor;
                    System.out.print("O saldo atualizado é de: " + saldo);
                } else {
                    System.out.print("O valor de " + valor + " é maior do que o Saldo  de: " + saldo);

                }
                break;
            case 3:

                System.out.print("Que valor deseja depositar: ");
                float depositar = leitor.nextFloat();
                saldo = saldo + depositar;
                System.out.print("O saldo atualizdo é de : "+saldo);
                break;
            case 4:

                System.out.print("Saindo...");
                break;
            default:
                System.out.print("Opção Invalida!\nTente Novamente.");

        }
        leitor.close();
    }
}
