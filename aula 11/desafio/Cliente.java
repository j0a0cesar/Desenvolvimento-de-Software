public class Cliente extends Pessoa{

    String email;
    Cliente(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        this.email=email;
    }
    void comprar(){
        System.out.println("Cliente: "+this.nome);
        System.out.println("E-mail: "+this.email);
    }
}

