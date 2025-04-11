public class Vendendor extends Funcionario{
    float meta;
    float vendas;

    Vendendor(String nome, String cpf, int idade,String cargo,int id,float salario,float meta,float vendas) {
        super(nome, cpf, idade, cargo, id, salario);
        this.meta = meta;
        this.vendas=vendas;
    }
    void vender(){
        System.out.println("Gerente: "+this.nome);
        System.out.println("| Tem a meta de vender: "+this.meta);
        System.out.println("| Vendeu: "+this.vendas);

    }
}
