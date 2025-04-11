public class Funcionario extends Pessoa{


     String cargo;
     int id;
     float salario;

    Funcionario(String nome, String cpf, int idade,String cargo,int id, float salaraio) {
        super(nome, cpf, idade);
        this.cargo = cargo;
        this.id = id;
        this.salario = salaraio;
    }

    void trabalhar(){
        System.out.println("| "+this.nome);
        System.out.println("~ Trabalhando com "+this.cargo);
        System.out.println("~ Ganhando R$ "+this.salario);
    }
}
