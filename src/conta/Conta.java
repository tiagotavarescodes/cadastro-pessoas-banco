package conta;

import cliente.Cliente;

public class Conta {
	
	private static int contadorDeConta = 0;
	
	private int numeroConta;
	private double saldo = 0.0;
	private Cliente titular;
	
		
	public Conta(Cliente titular) {
		this.numeroConta = contadorDeConta;
		this.titular = titular;
		contadorDeConta = contadorDeConta + 1;
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public Cliente getTitular() {
		return titular;
	}


	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	
	@Override
	public String toString() {		
		return "\nNúmero da conta: " + this.getNumeroConta() + 
				"\nNome: " + this.titular.getNome() +
				"\nCPF: " + this.titular.getCpf() +
				"\nEmail: " + this.titular.getEmail() +
				"\nSaldo: " + this.getSaldo();
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
			setSaldo(getSaldo() + valor);
			System.out.println("Depósito realizado com sucesso!");
		} else {
			System.out.println("Não foi possível realizar o depósito!");
		}		
	}
	
	public void sacar(double valor) {
		if(getSaldo() >= valor && valor > 0) {
			setSaldo(getSaldo() - valor);
			System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Não foi possível realizar o saque!");
		}
	}
	
	public void transferir(double valor, Conta contaParaDeposito) {
		if(getSaldo() >= valor && valor > 0) {
			setSaldo(getSaldo() - valor);
			contaParaDeposito.depositar(valor);
			System.out.println("Transferência no valor de " + valor +" foi realizado com sucesso");
		}
		
	}
	
	
}
