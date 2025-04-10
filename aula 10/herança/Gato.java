public class Gato  extends Animal{

    public void mudarNomeGato(){
        mudarNome("Gato > " +novoNome);
        System.out.println(this.nome);

    }

    @Override
    public void fazerSom() {
        //super.fazerSom();
        System.out.println("Miauuu");
    }
}
