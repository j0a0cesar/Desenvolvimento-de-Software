public class Arqueiro extends Personagem{
    public Arqueiro(String nome, float vida, float dano) {
        super(nome, vida, dano);
    }
    @Override
    void atacar() {
        System.out.println(nome+ " ataca com flechas!");
    }
}
