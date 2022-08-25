package cliente;

import conta.Conta;


public class CriaCliente {
	
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.titular = new Cliente("Tiago Teixeira", "11292373488");
		conta1.depositar(1500);
		conta1.sacar(1000);
		
		Conta conta2 = new Conta();
		conta2.titular = new Cliente("Lorena Teixeira", "11299873466");
		conta2.depositar(2000);
		
		conta1.transfere(1000, conta2);
		
		
		
		
		
		System.out.println("Cliente " + conta1.titular.getNome() + " do cpf " + conta1.titular.getCpf() + " está com o saldo de " + conta1.getSaldo());
		
		
	} 

}
