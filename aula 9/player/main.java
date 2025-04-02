import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Player> jogadores = new ArrayList<>();
        jogadores.add(new Player(1, 2));
        jogadores.add(new Player(4, 4));

        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {

                for (int i = 0;i < jogadores.size(); i++) {
                    if (jogadores.get(i).x == linha && jogadores.get(i).y == coluna) {
                        System.out.print("[ X ]");
                    }
                }
                System.out.print("[ . ]");

            }
            System.out.println();
        }

    }

}
