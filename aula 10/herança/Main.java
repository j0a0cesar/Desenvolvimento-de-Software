public class Main {
    public static void main(String[] args) {

        Animal a = new Animal();
        //a.nome = "amendoim";
        a.mudarNome("Amendoim");
        Animal b = new Animal();
        //b.nome = "bob";
        b.mudarNome("bob");


        Gato g = new Gato();
        //g.mudarNome("Garfielde");
        g.mudarNomeGato();
        
        a.mostrarNome();
        
        Cachorro c =  new Cachorro();
        c.mudarNome("bolt");
        c.mostrarNome();
        c.fazerSom();
        

    }
