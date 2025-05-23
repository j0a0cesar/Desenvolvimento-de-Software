public class Ano {
    private int ano;
    private boolean bissexto;
    private Mes [] meses;

    Ano(int ano, boolean bissexto){
        this.ano = ano;
        this.bissexto = bissexto;
        this.meses= new Mes[12];
        inicializarMeses();
    }
    private void inicializarMeses(){
        String [] nomes = {"Janeiro", "Fevereiro","Março","Abril","Maio","Junho",
        "Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int [] diaPorMes = {31,(bissexto ? 29:28),31,30,31,30,
                31,31,30,31,30,31};
        for(int i = 0; i < 12;i++){
            meses[i] = new Mes(nomes[i], diaPorMes[i]);
        }
    }

    public void adicionarCompromissoNoMes(int mes, int dia,Compromisso comp) {

        if (mes > 0 && mes< 13) {
            meses[mes -1].adicionarCompromissoNoDia(comp,dia);
            System.out.println("Compromisso adicionado mes " + mes);
        } else {
            System.out.println("mes inválido");
        }
    }

    public Compromisso consultarCompromsissoNoMes(int mes,int dia,int hora) {
        if (mes > 0 && mes < 13) {
            return meses[mes - 1].consultarCompromsissoNoDia(hora,dia);
        } else {
            System.out.println("Mês inválido");
            return null;
        }
    }

    public void excluirCompromissoNoMes(int mes, int dia,int hora) {
        if (mes > 0 && mes < 13) {
            meses[mes-1].excluirCompromissoDoDia(hora, dia);
            System.out.println("Compromisso removido no mês " +mes);
        } else {
            System.out.println("Mês inválido");
        }
    }

    public void listarCompromissos(int mes,int dia,int hora) {
        System.out.println("Compromissos do mês " +mes+ ":");

            if (mes > 0 && mes < 13 ) {
                meses[mes-1].listarCompromissosDoDia(dia);

            }else{
                System.out.println("Mês inválido");
        }

    }
}
