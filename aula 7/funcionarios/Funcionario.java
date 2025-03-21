

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome,String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome(String nome) {
        return nome;
    }

    public String getCargo(String cargo) {
        return cargo;
    }

    public double getSalario(double salario) {
        return salario;
    }
    public void exibirInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Cargo: "+cargo);
        System.out.println("Salario R$: "+salario);
        System.out.println("----------------------");
    }
}
