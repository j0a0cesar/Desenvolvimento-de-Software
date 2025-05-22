//Crie uma classe que represente um Ponto no espaço bidimensional. Na classe programa efetue
//as operações listadas abaixo. Para realização dos cálculos de elevação ao quadrado utilizar
//Math.pow(valor, 2) e para extração da raiz quadrada utilizar Math.sqrt(valor).
//(Não precisa usar Model-View-Controller MVC)
public class Main {

    public static void main(String[] args) {
        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto(2,5);

        double distancia1 = ponto1.calcularDistancia(ponto2);
        System.out.println("Calcula a distancia do ponto 1 ao ponto 2");
        double distancia2 = ponto2.calcularDistancia(7.,2);
        System.out.println("Calcula a distancia do poonto 2 para x= 7 e y = 2");

        ponto1.setX(10);

        ponto1.setY(3);
    }
}
