public class Personagem {

    String nome;
    float vida;
    float dano;
        public Personagem(String nome, float vida, float dano){
            this.nome = nome;
            this.vida = vida;
            this.dano = dano;
        }

        void mostraPersonagem(){
            System.out.println("Personagem: "+this.nome);
            System.out.println("Vida: "+this.vida);
            System.out.println("Dano: "+this.dano);
        }
        void atacar(){}

    void receberDano(){
            this.vida -=this.dano;
    }

}
