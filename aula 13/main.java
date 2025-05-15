public class Main {
    public static void main(String[] args) {

      int soma1 = Calculadora.soma(2,3);
      float soma2 = Calculadora.soma(2.3f,4.5f);
      float soma3 = Calculadora.soma(2.1f,2.4f);

      Calculadora.soma(1,1.1f);

      Pessoa p1 = new Pessoa("joao","jc","42");
      Pessoa p2 = new Pessoa("cesar");
      Pessoa p3 = new Pessoa("padua");
    }
}
