


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Guerreiro g = new Guerreiro("Jefferson",1200,450);
        Mago m = new Mago("Alvoro",7500,850);
        Arqueiro a = new Arqueiro("Ash",5000,650);
        
        Scanner input = new Scanner(System.in);
        
        Personagem []  personagens = new Personagem [3];
                personagens[0] = g;
                personagens[1] = m;
                personagens[2] = a;

        for(int i = 0; i < personagens.length; i++){
            personagens[i].mostraPersonagem();
            System.out.println();
        }
        do {
            System.out.println("[1] Mostrar os personagens");
            System.out.println("[2] Mostrar os personagens");
            System.out.println("[3] Mostrar os personagens");
            System.out.println("[4] Sair");
            System.out.print("Escolha a opção desejada: ");
            int op = input.nextInt();
            input.nextLine();

            switch (op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:

            }
        }while (op != 4) ;
        
    }
}

