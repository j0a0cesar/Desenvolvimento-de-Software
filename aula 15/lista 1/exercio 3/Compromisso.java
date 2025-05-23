public class Compromisso {
    private String pessoa;
    private String local;
    private String assunto;
    private int hora;

    Compromisso(String pessoa, String local, String assunto, int hora) {
        this.pessoa = pessoa;
        this.local = local;
        this.assunto = assunto;
        this.hora = hora;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getPessoa() {
        return pessoa;
    }

    public String getLocal() {
        return local;
    }

    public String getAssunto() {
        return assunto;
    }

    public int getHora() {
        return hora;
    }
    public void mostrarCompromisso(){
        System.out.println("Pessoa: "+getPessoa());
        System.out.println("Local: "+getLocal());
        System.out.println("Assunto: "+getAssunto());
        System.out.println("Hora: "+ getHora()+"h");
    }
}
