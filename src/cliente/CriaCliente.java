package cliente;

import conta.Conta;

public class CriaCliente {
	
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.titular = new Cliente("Tiago Teixeira", "11299373488");
		conta1.depositar(1500);
		conta1.sacar(500);
		
		
		System.out.println("Cliente " + conta1.titular.getNome() + " com o cpf " + conta1.titular.getCpf() + " está com o saldo de " + conta1.getSaldo());
		
		
	} 

}
