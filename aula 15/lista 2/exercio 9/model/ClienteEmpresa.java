package model;

public class ClienteEmpresa extends Cliente {

    public ClienteEmpresa(String nome, String cnpj) {
        super(nome, cnpj);
    }

    @Override
    public double getLimiteCredito() {
        return 25000.0;
    }
}
