public class Gerente extends Funcionario {
    String manda;
    int tamanhoEquipe;

    Gerente(String nome, String cpf, int idade,String cargo,int id,float salario, int tamanhoEquipe) {
        super(nome, cpf, idade, cargo, id, salario);
        this.tamanhoEquipe = tamanhoEquipe;

    }
    void liderar(){
        System.out.println("Gerente: "+this.nome);
        System.out.println("| Está liderando uma equipe de: "+this.tamanhoEquipe);
        System.out.println("| Ganhando salario R$: "+this.salario);
        System.out.println("| No cargo: "+this.cargo);
    }
}
