import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a temperatura em celsius: ");
        float temp = leitor.nextInt();

        System.out.print("Escolha a conversão de temperatura:\n[1]Fahrenheint\n[2]Kelvin\n ");
        int op = leitor.nextInt();

        switch(op){
            case 1:
                float fahren =  (temp * 9/5) + 32 ;
                System.out.print("A temperatura em Fahrenheint: "+fahren);
                break;
            case 2:
                float kel = temp + 273;
                System.out.print("A temperatura em Kelvin: "+kel);
                break;
            default:
                System.out.print("Opção Invalida!\nTente Novamente.");
        }

            leitor.close();
        }

}
