public class Programa {
    public static void main(String[]args) {
        //Crie uma classe que represente um Livro de uma biblioteca. Em outra classe
        //(Programa), instancie os seguintes livros e apresente seus dados na tela.
        //(Não precisa usar Model-View-Controller MVC)

        Livro livro1 = new Livro("001","Iracema", "José de Alencar","9788542221138",1865);
        Livro livro2= new Livro("002","Cortiço", "Aluíso de Azevedo","9788542221139",1890);
        Livro livro3 = new Livro("003","Memória Póstumas de Brás Cubas", "Machado de Assis","9788542221140",1881);

        livro1.exibirLivro();
        livro2.exibirLivro();
        livro3.exibirLivro();
    }
}
