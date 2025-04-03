import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //herença agrupar
        // personagens uma classe mae que colocario as posiçoes, desenho, movimentação
        // tentar fazer o boneco se mexer
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha o desenho do player:");

        //Player carinha = new Player(1, 1, "🚗");
        //Inimigos mau = new Inimigos(1,2"🏍");

        Persongagem[] persongagems = new Persongagem[2];
        persongagems[0] = new Persongagem(1, 1, "🚗");
        persongagems [1] = new Persongagem(1,2,"🏍");

        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {

                boolean tem = false;

                for (int i = 0;i < persongagems.length; i++) {
                    if (persongagems[i].x == linha && persongagems[i].y == coluna) {
                        System.out.print("[ "+persongagems[i].desenho+" ]");
                        tem = true;
                        break;
                    }
                }
                if(!tem) {
                    System.out.print("[ . ]");
                }

            }
            System.out.println();
        }
    }
}
