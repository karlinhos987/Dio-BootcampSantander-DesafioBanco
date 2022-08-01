package br.dio.banco;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        Cliente cliente = new Cliente();
        
        System.out.println("Digite o primeiro nome do cliente");
        String nome = scan.next();
        
        //System.out.println("Nome digitado: " + nome);
        
        cliente.setNome(nome);
        
        Conta contaCorrente = new ContaCorrente(cliente);
        Conta contaPoupanca = new ContaPoupanca(cliente);
        
        contaCorrente.depositar(300);
        contaPoupanca.depositar(300);

        contaCorrente.transferir(300, contaPoupanca);
        contaPoupanca.imprimirExtrato();
        contaCorrente.imprimirExtrato();
        System.out.println("-----------------");
        Banco banco = new Banco("Santander", List.of(contaCorrente, contaPoupanca));
        banco.listarClientes();
    }
}
