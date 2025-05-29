package model;

import java.util.*;

public class Agenda {
    private static List<Contato> contatos = new ArrayList<>();

    public static void adicionar(Contato contato) {
        contatos.add(contato);
    }

    public static Contato getContato(int codigo) {
        for (Contato c : contatos) {
            if (c.getCodigo() == codigo) return c;
        }
        return null;
    }

    public static boolean excluirContato(int codigo) {
        return contatos.removeIf(c -> c.getCodigo() == codigo);
    }

    public static List<Contato> listarContatos() {
        return contatos;
    }
}
