
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;



public class Main {
    //criar um sistema que permite cadastrar funcionarios, armazenar, nome, cargo,salario, o sfuncionarios devem ser armazenados em um array e exibidos ao final do cadastro
    //requisitos:
    // criar a classe Funcionario com:
    // atributos nome, cargo e salario;
    //construtor para inicilaizar os atributos
    //metodos getters e um metodo exibirInfo() para exibir os detalhes do funcionario
    // crir uma classe cadastroFuncionario com:
    // um array de funcionario para armazenar até 5 funcionarios
    // um loop para cadastrar funcionarios utilizando um inputhelper
    // exibir todos os funcionarios cadastrados no final
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Funcionario[] funcionarios = new Funcionario[5];

        for(int i = 0; i < funcionarios.length; i++){
            System.out.print("Cadastro do funcionario [" +(i+1)+"]: ");

            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Cargo: ");
            String cargo = input.nextLine();

            System.out.print("Salario: R$ ");
            double salario = input.nextDouble();
            input.nextLine();

            funcionarios[i] = new Funcionario(nome,cargo,salario);
        }
        System.out.println("\nFuncionários cadastrados:");
        for (Funcionario func : funcionarios) {
            func.exibirInfo();
        }

        input.close();

}
}
