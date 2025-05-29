package controller;

import model.Cliente;

public class ClienteController {
    public boolean realizarEmprestimo(Cliente cliente, double valor) {
        return cliente.emprestar(valor);
    }

    public boolean realizarDevolucao(Cliente cliente, double valor) {
        return cliente.devolver(valor);
    }

    public void exibirStatus(Cliente cliente) {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF/CNPJ: " + cliente.getCpfOuCnpj());
        System.out.println("Valor emprestado: R$ " + cliente.getVlrEmprestado());
        System.out.println("Limite: R$ " + cliente.getLimiteCredito());
    }
}
