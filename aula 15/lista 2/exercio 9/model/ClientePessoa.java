package model;

public class ClientePessoa extends Cliente {

    public ClientePessoa(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public double getLimiteCredito() {
        return 10000.0;
    }
}
