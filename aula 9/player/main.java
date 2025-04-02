import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Player> jogadores = new ArrayList<>();
        jogadores.add(new Player(1,2));
        jogadores.add(new Player(4,4));

        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {

                for(int i = 0;i < jogadores.size(); i++) {
                    if (linha == jogadores.get(i).x && coluna == jogadores.get(i).y) {
                        System.out.print("[ X ]");
                    } else {
                        System.out.print("[ . ]");
                    }
                }

            }
            System.out.println();
        }
    }
