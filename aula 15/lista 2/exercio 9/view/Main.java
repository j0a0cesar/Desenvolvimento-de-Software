package view;

import controller.ClienteController;
import model.ClienteEmpresa;
import model.ClientePessoa;

public class Main {
    public static void main(String[] args) {
        ClienteController controller = new ClienteController();

        ClientePessoa joao = new ClientePessoa("João da Silva", "123.456.789-00");
        ClienteEmpresa empresa = new ClienteEmpresa("Empresa X", "12.345.678/0001-99");

        controller.realizarEmprestimo(joao, 5000.0);
        controller.realizarEmprestimo(joao, 6000.0); // excede limite

        controller.realizarEmprestimo(empresa, 24000.0);
        controller.realizarDevolucao(empresa, 1000.0);

        controller.exibirStatus(joao);
        System.out.println("------------------");
        controller.exibirStatus(empresa);
    }
}
