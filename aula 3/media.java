import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a sua matrícula: ");
        int rgm = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Digite o seu nome: ");
        String nome = leitor.nextLine();

        System.out.print("Digite a sua 1° nota: ");
         float n1 = leitor.nextFloat();

        System.out.print("Digite a sua 2° nota: ");
        float n2 = leitor.nextFloat();

        float media =  (n1+n2)/2;
        System.out.print("Nome: "+nome);
        System.out.print("Matrícula: "+rgm);
        System.out.print("Nota 1°: "+n1);
        System.out.print("Nota 2°: "+n2);
                if(media >= 6){
                    System.out.println("APROVADO SIM (X) NÃO()");
                }
                else{
                    System.out.println("APROVADO SIM () NÃO(X)");
                }

                System.out.print("Média: "+media);

                leitor.close();

    }
}
