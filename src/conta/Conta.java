package conta;

import cliente.Cliente;

public class Conta {

	private double saldo;
	public Cliente titular;
	
	
	
	public double getSaldo() {
		return saldo;
	}

	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public void sacar(double valor) {
		if (saldo>=valor) {
			saldo = saldo - valor;
						
		}else {
			System.out.println("Saldo insuficiente!!");
		}
	}
	
	public void transfere(double valor, Conta destino) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			destino.depositar(valor);
			
		}
		
	}
	
}
