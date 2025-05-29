package controller;

import model.*;
import view.*;

public class AgendaController {

    public static void executar() {
        int opc;

        do {
            opc = AgendaView.menuPrincipal();

            switch (opc) {
                case 1:
                    Pessoal p = AgendaView.lerContatoPessoal();
                    Agenda.adicionar(p);
                    break;

                case 2:
                    Comercial c = AgendaView.lerContatoComercial();
                    Agenda.adicionar(c);
                    break;

                case 3:
                    boolean sucesso = Agenda.excluirContato(AgendaView.lerCodigo());

                    if(sucesso)
                        AgendaView.mostrarMensagem("Excluído.");
                    else
                        AgendaView.mostrarMensagem("Não encontrado.");

                    break;

                case 4:
                    int cod = AgendaView.lerCodigo();
                    Contato cont = Agenda.getContato(cod);
                    AgendaView.mostrarContato(cont);
                    break;

                case 5:
                    AgendaView.mostrarLista(Agenda.listarContatos());
                    break;

                case 6:
                    AgendaView.mostrarMensagem("Saindo...");
                    break;

                default:
                    AgendaView.mostrarMensagem("Opção inválida.");
                    break;
            }
        } while (opc != 6);
    }
}
