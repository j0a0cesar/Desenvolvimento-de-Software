import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //IMC < 18.5 abaixo do peso
        // 18.5 entre 24.9 peso ideal
        // 25.0 entre 29.9 sobrepeso
        // imc >= 30 obsidade

        Scanner leitor = new Scanner(System.in);


        System.out.print("Digite a sua altura(m): ");
        float altura = leitor.nextFloat();

        System.out.print("Digite o seu peso(kg): ");
        float peso = leitor.nextFloat();

        float imc = peso/(altura*altura);

        if( imc < 18.5){
            System.out.print("O seu IMC é "+imc+"\nClassificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.print("O seu IMC é "+imc+"\nClassificação: Peso ideal");
        } else if (imc < 30) {
            System.out.print("O seu IMC é "+imc+"\nClassificação: Sobrepeso");
        }
        else{
            System.out.print("O seu IMC é "+imc+"\nClassificação: Obesidade");
        }

        leitor.close();
    }
}
