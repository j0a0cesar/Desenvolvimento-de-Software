import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Player> jogadores = new ArrayList<>();
        jogadores.add(new Player(1, 2));
        jogadores.add(new Player(4, 4));

        List<Inimigos> jogadoresMaus = new ArrayList<>();
        jogadoresMaus.add(new Inimigos(3,3));
        
        

        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {

                boolean tem = false;

                for (int i = 0;i < jogadores.size(); i++) {
                    if (jogadores.get(i).x == linha && jogadores.get(i).y == coluna) {
                        System.out.print("[ X ]");
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
