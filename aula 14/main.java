import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.print("Digite um nome: ");
            String nome = scan.nextLine();


            int idade = InputHelp.pegarNumero("idade: ");
            int peso = InputHelp.pegarNumero("peso: ");
            int periodo = InputHelp.pegarNumeroRangne("Numero de 1 a 8", 1,8);
            /*try {
                System.out.print("Digite uma idade: ");

                //int idade = scan.nextInt();
                //scan.nextLine();


            }
            catch (NumberFormatException e){
                //catch (Exception e){  //pega todos os erros
                //throw new RuntimeException(e);
                //System.out.println(e);
                System.out.println("Digite apenas numeros!");
                System.out.println("Digite novamente");
            }catch (Exception e){
                System.out.println(" > > > ERRO < < <");
            }*/


        }
    }
}
