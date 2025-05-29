package model;

public abstract class Cliente {
    protected String nome;
    protected String cpfOuCnpj;
    protected double vlrEmprestado;

    public Cliente(String nome, String cpfOuCnpj) {
        this.nome = nome;
        this.cpfOuCnpj = cpfOuCnpj;
        this.vlrEmprestado = 0.0;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpfOuCnpj() { return cpfOuCnpj; }
    public void setCpfOuCnpj(String cpfOuCnpj) { this.cpfOuCnpj = cpfOuCnpj; }

    public double getVlrEmprestado() { return vlrEmprestado; }

    public abstract double getLimiteCredito();

    public boolean emprestar(double valor) {
        if (valor <= 0) return false;
        if (vlrEmprestado + valor <= getLimiteCredito()) {
            vlrEmprestado += valor;
            return true;
        }
        return false;
    }

    public boolean devolver(double valor) {
        if (valor <= 0 || valor > vlrEmprestado) return false;
        vlrEmprestado -= valor;
        return true;
    }
}
