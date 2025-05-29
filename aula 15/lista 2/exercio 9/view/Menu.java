package view;

import controller.ClienteController;
import model.ClientePessoa;
import model.ClienteEmpresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private final ClienteController controller = new ClienteController();

    private final List<ClientePessoa> clientesPessoa = new ArrayList<>();
    private final List<ClienteEmpresa> clientesEmpresa = new ArrayList<>();

    public void exibirMenu() {
        int opcao;

        do {
            System.out.println("\n====== MENU ======");
            System.out.println("1. Incluir cliente pessoa");
            System.out.println("2. Incluir cliente empresa");
            System.out.println("3. Mostrar dados cliente pessoa");
            System.out.println("4. Mostrar dados cliente empresa");
            System.out.println("5. Emprestar para cliente pessoa");
            System.out.println("6. Emprestar para cliente empresa");
            System.out.println("7. Devolução de cliente pessoa");
            System.out.println("8. Devolução de cliente empresa");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> incluirClientePessoa();
                case 2 -> incluirClienteEmpresa();
                case 3 -> mostrarDadosPessoa();
                case 4 -> mostrarDadosEmpresa();
                case 5 -> emprestarParaPessoa();
                case 6 -> emprestarParaEmpresa();
                case 7 -> devolverDePessoa();
                case 8 -> devolverDeEmpresa();
                case 9 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 9);
    }

    private void incluirClientePessoa() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        clientesPessoa.add(new ClientePessoa(nome, cpf));
        System.out.println("Cliente pessoa incluído com sucesso!");
    }

    private void incluirClienteEmpresa() {
        System.out.print("Nome da empresa: ");
        String nome = scanner.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();
        clientesEmpresa.add(new ClienteEmpresa(nome, cnpj));
        System.out.println("Cliente empresa incluído com sucesso!");
    }

    private void mostrarDadosPessoa() {
        System.out.print("Informe o CPF: ");
        String cpf = scanner.nextLine();
        ClientePessoa cliente = buscarClientePessoa(cpf);
        if (cliente != null) controller.exibirStatus(cliente);
        else System.out.println("Cliente não encontrado.");
    }

    private void mostrarDadosEmpresa() {
        System.out.print("Informe o CNPJ: ");
        String cnpj = scanner.nextLine();
        ClienteEmpresa cliente = buscarClienteEmpresa(cnpj);
        if (cliente != null) controller.exibirStatus(cliente);
        else System.out.println("Cliente não encontrado.");
    }

    private void emprestarParaPessoa() {
        System.out.print("CPF do cliente: ");
        String cpf = scanner.nextLine();
        ClientePessoa cliente = buscarClientePessoa(cpf);
        if (cliente != null) {
            System.out.print("Valor a emprestar: ");
            double valor = scanner.nextDouble();
            boolean ok = controller.realizarEmprestimo(cliente, valor);
            System.out.println(ok ? "Empréstimo realizado." : "Empréstimo não autorizado.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private void emprestarParaEmpresa() {
        System.out.print("CNPJ do cliente: ");
        String cnpj = scanner.nextLine();
        ClienteEmpresa cliente = buscarClienteEmpresa(cnpj);
        if (cliente != null) {
            System.out.print("Valor a emprestar: ");
            double valor = scanner.nextDouble();
            boolean ok = controller.realizarEmprestimo(cliente, valor);
            System.out.println(ok ? "Empréstimo realizado." : "Empréstimo não autorizado.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private void devolverDePessoa() {
        System.out.print("CPF do cliente: ");
        String cpf = scanner.nextLine();
        ClientePessoa cliente = buscarClientePessoa(cpf);
        if (cliente != null) {
            System.out.print("Valor a devolver: ");
            double valor = scanner.nextDouble();
            boolean ok = controller.realizarDevolucao(cliente, valor);
            System.out.println(ok ? "Devolução realizada." : "Valor inválido.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private void devolverDeEmpresa() {
        System.out.print("CNPJ do cliente: ");
        String cnpj = scanner.nextLine();
        ClienteEmpresa cliente = buscarClienteEmpresa(cnpj);
        if (cliente != null) {
            System.out.print("Valor a devolver: ");
            double valor = scanner.nextDouble();
            boolean ok = controller.realizarDevolucao(cliente, valor);
            System.out.println(ok ? "Devolução realizada." : "Valor inválido.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    // Métodos auxiliares
    private ClientePessoa buscarClientePessoa(String cpf) {
        return clientesPessoa.stream()
                .filter(c -> c.getCpfOuCnpj().equals(cpf))
                .findFirst()
                .orElse(null);
    }

    private ClienteEmpresa buscarClienteEmpresa(String cnpj) {
        return clientesEmpresa.stream()
                .filter(c -> c.getCpfOuCnpj().equals(cnpj))
                .findFirst()
                .orElse(null);
    }
}
