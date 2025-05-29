package view;

import java.util.*;
import model.*;
import util.InputHelper;

public class AgendaView {

    public static int menuPrincipal() {
        System.out.println("\n===== AGENDA DE CONTATOS =====");
        System.out.println("1. Incluir Pessoal");
        System.out.println("2. Incluir Comercial");
        System.out.println("3. Excluir contato");
        System.out.println("4. Consultar contato");
        System.out.println("5. Listar todos");
        System.out.println("6. Sair");

        return InputHelper.lerInt("Escolha: ");
    }

    public static Pessoal lerContatoPessoal() {

        int codigo = InputHelper.lerInt("Código: ");
        String nome = InputHelper.lerString("Nome: ");
        String tel = InputHelper.lerString("Telefone: ");
        String aniv = InputHelper.lerString("Aniversário: ");

        return new Pessoal(codigo, nome, tel, aniv);
    }

    public static Comercial lerContatoComercial() {
        int codigo = InputHelper.lerInt("Código: ");
        String nome = InputHelper.lerString("Nome: ");
        String tel = InputHelper.lerString("Telefone: ");
        String cnpj = InputHelper.lerString("CNPJ: ");

        return new Comercial(codigo, nome, tel, cnpj);
    }

    public static int lerCodigo() {
        return InputHelper.lerInt("Digite o código: ");
    }

    public static void mostrarContato(Contato c) {
        if (c != null) System.out.println(c);
        else System.out.println("Contato não encontrado.");
    }

    public static void mostrarLista(List<Contato> contatos) {
        for (Contato c : contatos) System.out.println(c);
    }

    public static void mostrarMensagem(String msg) {
        System.out.println(msg);
    }
}
