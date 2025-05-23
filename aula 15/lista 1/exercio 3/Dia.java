public class Dia {
    private int diaMes;
    private Compromisso[] compromissos = new Compromisso[24];

    Dia(int diaMes) {
        this.diaMes = diaMes;
    }

    public Compromisso[] getCompromissos() {
        return compromissos;
    }

    public int getDiaMes() {
        return diaMes;
    }

    public void adicionarCompromisso(Compromisso comp) {
        int hora = comp.getHora();
        if (hora >= 0 && hora < 24) {
            compromissos[hora] = comp;
            System.out.println("Compromisso adicionado às " + hora + "h");
        } else {
            System.out.println("Horario inválido");
        }
    }

    public Compromisso consultarCompromsisso(int hora) {
        if (hora >= 0 && hora < 24) {
            return compromissos[hora];
        } else {
            System.out.println("Horario inválido");
            return null;
        }
    }

    public void excluirCompromisso(int hora) {
        if (hora >= 0 && hora < 24) {
            compromissos[hora] = null;
            System.out.println("Compromisso removido às " + hora + "h");
        } else {
            System.out.println("Horario inválido");
        }
    }

    public void listarCompromissos() {
        System.out.println("Compromissos do dia " + getDiaMes() + ":");
        boolean encontrou = false;
        for (int i = 0; i < compromissos.length; i++) {
            if (compromissos[i] != null) {
                compromissos[i].mostrarCompromisso();
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum compromisso agendado.");
        }
    }
}
