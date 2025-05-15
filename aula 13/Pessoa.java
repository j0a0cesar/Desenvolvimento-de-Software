public class Pessoa {
    String nome;
    String email;
    String telefone;

    Pessoa(String nome,String email,String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    Pessoa(String nome){
        this.nome = nome;
        this.email = "sem-email";
        this.telefone = null;
    }
    Pessoa(String nome,String email){
        this.nome = nome;
        this.email = null;
        this.telefone = "sem-telefone";
    }

}
