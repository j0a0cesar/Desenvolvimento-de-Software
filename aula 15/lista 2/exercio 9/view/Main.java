package view;

import controller.ClienteController;
import model.ClientePessoa;
import model.ClienteEmpresa;
import model.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClienteController controller = new ClienteController();

        List<ClientePessoa> clientesPessoa = new ArrayList<>();
        List<ClienteEmpresa> clientesEmpresa = new ArrayList<>();

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
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    clientesPessoa.add(new ClientePessoa(nome, cpf));
                    System.out.println("Cliente pessoa incluído com sucesso!");
                }

                case 2 -> {
                    System.out.print("Nome da empresa: ");
                    String nome = scanner.nextLine();
                    System.out.print("CNPJ: ");
                    String cnpj = scanner.nextLine();
                    clientesEmpresa.add(new ClienteEmpresa(nome, cnpj));
                    System.out.println("Cliente empresa incluído com sucesso!");
                }

                case 3 -> {
                    System.out.print("Informe o CPF: ");
                    String cpf = scanner.nextLine();
                    ClientePessoa cliente = buscarClientePessoa(clientesPessoa, cpf);
                    if (cliente != null) controller.exibirStatus(cliente);
                    else System.out.println("Cliente não encontrado.");
                }

                case 4 -> {
                    System.out.print("Informe o CNPJ: ");
                    String cnpj = scanner.nextLine();
                    ClienteEmpresa cliente = buscarClienteEmpresa(clientesEmpresa, cnpj);
                    if (cliente != null) controller.exibirStatus(cliente);
                    else System.out.println("Cliente não encontrado.");
                }

                case 5 -> {
                    System.out.print("CPF do cliente: ");
                    String cpf = scanner.nextLine();
                    ClientePessoa cliente = buscarClientePessoa(clientesPessoa, cpf);
                    if (cliente != null) {
                        System.out.print("Valor a emprestar: ");
                        double valor = scanner.nextDouble();
                        boolean ok = controller.realizarEmprestimo(cliente, valor);
                        System.out.println(ok ? "Empréstimo realizado." : "Empréstimo não autorizado.");
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                }

                case 6 -> {
                    System.out.print("CNPJ do cliente: ");
                    String cnpj = scanner.nextLine();
                    ClienteEmpresa cliente = buscarClienteEmpresa(clientesEmpresa, cnpj);
                    if (cliente != null) {
                        System.out.print("Valor a emprestar: ");
                        double valor = scanner.nextDouble();
                        boolean ok = controller.realizarEmprestimo(cliente, valor);
                        System.out.println(ok ? "Empréstimo realizado." : "Empréstimo não autorizado.");
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                }

                case 7 -> {
                    System.out.print("CPF do cliente: ");
                    String cpf = scanner.nextLine();
                    ClientePessoa cliente = buscarClientePessoa(clientesPessoa, cpf);
                    if (cliente != null) {
                        System.out.print("Valor a devolver: ");
                        double valor = scanner.nextDouble();
                        boolean ok = controller.realizarDevolucao(cliente, valor);
                        System.out.println(ok ? "Devolução realizada." : "Valor inválido.");
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                }

                case 8 -> {
                    System.out.print("CNPJ do cliente: ");
                    String cnpj = scanner.nextLine();
                    ClienteEmpresa cliente = buscarClienteEmpresa(clientesEmpresa, cnpj);
                    if (cliente != null) {
                        System.out.print("Valor a devolver: ");
                        double valor = scanner.nextDouble();
                        boolean ok = controller.realizarDevolucao(cliente, valor);
                        System.out.println(ok ? "Devolução realizada." : "Valor inválido.");
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                }

                case 9 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 9);
        scanner.close();
    }

    // Métodos auxiliares para buscar cliente
    private static ClientePessoa buscarClientePessoa(List<ClientePessoa> lista, String cpf) {
        for (ClientePessoa c : lista) {
            if (c.getCpfOuCnpj().equals(cpf)) return c;
        }
        return null;
    }

    private static ClienteEmpresa buscarClienteEmpresa(List<ClienteEmpresa> lista, String cnpj) {
        for (ClienteEmpresa c : lista) {
            if (c.getCpfOuCnpj().equals(cnpj)) return c;
        }
        return null;
    }
}
