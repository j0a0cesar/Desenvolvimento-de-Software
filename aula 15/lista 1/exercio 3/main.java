//A agenda deve permitir a criação de um compromisso
//com uma pessoa, em um determinado local e horário,
//para tratar um assunto específico. Para cada dia
//considerar que será possível agendar o compromisso
//para qualquer uma das 24 horas de um dia, qualquer
//dia do mês de 28 a 31 dias e em qualquer um dos 12
//meses do ano. (Não precisa usar
//Model-View-Controller MVC)
public class Main {

    public static void main(String[] args) {

        Ano ano2025 = new Ano(2025,false);

        Compromisso comp1 = new Compromisso("Edurado Pimentel","Palcio Iguaçu", "Bi-Articula na UP",15);
        Compromisso comp2 = new Compromisso("Padre Kelmon","Catedral de Curitiba", "Religião",17);
        Compromisso comp3 = new Compromisso("Simone Tebeti","Biblioteca Municipal", "Educação",20);

        ano2025.adicionarCompromissoNoMes(5,25,comp1);
        ano2025.adicionarCompromissoNoMes(5,26,comp2);
        ano2025.adicionarCompromissoNoMes(5,27,comp3);

        Compromisso c = ano2025.consultarCompromsissoNoMes(5,25,15);
        if(c != null){
            System.out.println("Consulta às 15h do dia 25/05: ");
            c.mostrarCompromisso();
        }
        ano2025.excluirCompromissoNoMes(5,26,17);

        ano2025.listarCompromissos(5,27,20);

    }
}
