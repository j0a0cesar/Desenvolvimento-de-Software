public class Mago extends Personagem {
    public Mago(String nome, float vida, float dano) {
        super(nome, vida, dano);
    }
    @Override
    void atacar() {
        System.out.println(nome+ " ataca com feitiço!");
    }
}
