public class Animal {
    protected String nome;



    public void mostrarNome(){
        System.out.println(this.nome);
    }
    public void mudarNome(String novoNome){
        this.nome = novoNome;
    }
    public void fazerSom(){
        System.out.println("som generico");
    }

}
