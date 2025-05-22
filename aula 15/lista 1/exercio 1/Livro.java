public class Livro {
    private String codigo;
    private String titulo;
    private String autor;
    String isbn;
    private int ano;

    Livro(String codigo, String titulo, String autor, String isbn, int ano){
        this.codigo =codigo;
        this.titulo =titulo;
        this.autor= autor;
        this.isbn =isbn;
        this.ano =ano;
    }
    //metodo SET (coloca codigo no livro)
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    //metodo GET (vê o codigo do livro)
    public String getCodigo() {
        return codigo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }
    public void exibirLivro(){
        System.out.println("Código: "+getCodigo());
        System.out.println("Título: "+getTitulo());
        System.out.println("Autor: "+getAutor());
        System.out.println("ISBN: "+isbn);
        System.out.println("Ano: "+getAno());
    }
}

