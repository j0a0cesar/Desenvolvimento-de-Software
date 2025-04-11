public class Guerreiro extends Personagem{
    public Guerreiro(String nome, float vida, float dano) {
        super(nome, vida, dano);
    }

    @Override
    void atacar() {
        System.out.println(nome+ " ataca com espada!");
    }
}
