package br.dio.banco;

public class ContaPoupanca extends Conta{
	public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato da Conta Corrente ***");
        imprimirDadosConta();
    }
}