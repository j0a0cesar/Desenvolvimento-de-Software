public class Mes {
    private String nome;
    private Dia [] dias;

    Mes(String nome, int qtdedia){
        this.nome = nome;
        dias = new Dia[qtdedia];
        for(int i= 0; i < qtdedia;i++){
            dias[i] = new Dia(i+1);
        }
    }

    public void adicionarCompromissoNoDia(Compromisso comp, int dia) {

        if (dia > 0 && dia < dias.length) {
            dias[dia - 1].adicionarCompromisso(comp);
            System.out.println("Compromisso adicionado no " + dia);
        } else {
            System.out.println("Dia inválido");
        }
    }

    public Compromisso consultarCompromsissoNoDia(int hora, int dia) {
        if (dia > 0 && dia <= dias.length) {
            return dias[dia-1].consultarCompromsisso(hora);
        } else {
            System.out.println("Dia inválido");
            return null;
        }
    }

    public void excluirCompromissoDoDia(int hora, int dia) {
        if (dia > 0 && dia <= dias.length) {
            dias[dia-1].excluirCompromisso(hora);
            System.out.println("Compromisso removido às no dia " +dia);
        } else {
            System.out.println("Dia inválido");
        }
    }

    public void listarCompromissosDoDia(int dia) {
        System.out.println("Compromissos do dia :");
            if (dia > 0 && dia <= dias.length) {
                dias[dia-1].listarCompromissos();

            }else{
            System.out.println("Nenhum compromisso agendado.");
        }
    }

}
