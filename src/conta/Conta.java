package conta;

import cliente.Cliente;

public class Conta {

	private double saldo;
	private double rendaAnual;
	public Cliente titular;
	
	
	
	public double getSaldo() {
		return this.saldo;
	}

	
	public double getRendaAnual() {
		return this.rendaAnual;
	}


	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}


	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean sacar(double valor) {
		if (this.saldo>=valor) {
			this.saldo = this.saldo - valor;
			
			return true;
						
		}else {
			
			return false;
			
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			destino.depositar(valor);
			System.out.println("Transferência realizada com sucesso!!");
			
			return true;
			
		} else {
			System.out.println("Saldo insuficiente!!");
			
			return false;
			
		}
		
	}
			
		
		
	
	
	
	
}
