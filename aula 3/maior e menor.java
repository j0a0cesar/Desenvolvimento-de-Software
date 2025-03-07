import java.util.Scanner;
//maior menor numero
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        int[] numeros = {3, 6, 9, 13, 14, 27};
        

        int maior = 0;
        int menor = 10000;

        for(int i = 0; i < 6; i ++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
            if(numeros[i] < menor){
                 menor = numeros[i];
            }
        }
        System.out.println("O menor numero é: "+menor);
        System.out.println("O maior numero é: "+maior);
        leitor.close();
    }
}
