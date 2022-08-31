package conta;

import java.util.ArrayList;
import java.util.Scanner;

import cliente.Cliente;


public class CaixaBanco {
	
	static Scanner teclado = new Scanner(System.in);
	static ArrayList <Conta> contasBancarias;
	
	public static void main(String[] args) {
		contasBancarias = new ArrayList<Conta>();
		operacoes();
	}
	
	public static void operacoes() {
		
		System.out.println("******************************");
		System.out.println("********!!!Bem vindo!!!*******");
		System.out.println("****Selecione uma opera��o****");
		System.out.println("------------------------------");
		System.out.println("|   Op��o 1 - Criar Conta    |");
		System.out.println("|   Op��o 2 - Depositar      |");
		System.out.println("|   Op��o 3 - Sacar          |");
		System.out.println("|   Op��o 4 - Transferir     |");
		System.out.println("|   Op��o 5 - Listar         |");
		System.out.println("|   Op��o 6 - Sair           |");
		
		int operacao = teclado.nextInt();
		
		switch (operacao) {
		case 1:
			criaCronta();
			break;
		case 2:
			depositar();
			break;
		case 3:
			sacar();
			break;	
		case 4:
			transferir();
			break;
		case 5:
			listar();
			break;
		case 6:
			System.out.println("Obrigado por usar nossa ag�ncia!");
			System.exit(0);
			break;
			
		default:
			System.out.println("Op��o Inv�lida!");
			operacoes();
			break;
		}
		
	}
	
	public static void criaCronta() {
		
		System.out.println("\nNome:");
		String nome = teclado.next();
		
		System.out.println("\nCpf:");
		String cpf = teclado.next();
		
		System.out.println("\nEmail:");
		String email = teclado.next();
	
		Cliente cliente = new Cliente(nome, cpf, email);
		
		Conta conta = new Conta(cliente);
		
		contasBancarias.add(conta);
		System.out.println("Conta criada com sucesso!");
		
		operacoes();
	}
	
	private static Conta encontrarConta(int numeroConta) {
		Conta conta = null;
		if(contasBancarias.size() > 0) {
			for(Conta c : contasBancarias) {
				if(c.getNumeroConta() == numeroConta);
				conta = c;
			}
		}
		return conta;
			
	}
	
	public static void depositar() {
		System.out.println("N�mero da conta: ");
		int numeroConta = teclado.nextInt();
		
		Conta conta = encontrarConta(numeroConta);
		if(conta != null) {
			System.out.println("Qual valor deseja depositar? ");
			double valorDeposito = teclado.nextDouble();
			conta.depositar(valorDeposito);
			
		} else {
			System.out.println("Conta n�o encontrada!");
		}
		operacoes();
	}
	
	public static void sacar() {
		System.out.println("N�mero da conta: ");
		int numeroConta = teclado.nextInt();
		
		Conta conta = encontrarConta(numeroConta);
		if(conta != null) {
			System.out.println("Qual valor deseja sacar? ");
			double valorSaque = teclado.nextDouble();
			conta.sacar(valorSaque);
			
		} else {
			System.out.println("Conta n�o encontrada!");
		}
		operacoes();
	}
		
		public static void transferir() {
			System.out.println("N�mero conta remetente: ");
			int numeroContaRemetente = teclado.nextInt();
			
			Conta contaRemetente = encontrarConta(numeroContaRemetente);
			if(contaRemetente != null) {
				System.out.println("N�mero conta destinat�rio: ");
				int numeroContaDestinatario = teclado.nextInt();
				
				Conta contaDestinatario = encontrarConta(numeroContaDestinatario);
				if(contaDestinatario != null) {
					System.out.println("Valor transfer�ncia: ");
					Double valor = teclado.nextDouble();
					contaRemetente.transferir(valor, contaDestinatario);
				}
				
			operacoes();
			}
		}
		
		public static void listar() {
			if(contasBancarias.size() > 0) {
				for(Conta c : contasBancarias) {
					System.out.println(c);				
					
									
				}
				
		} else { System.out.println("N�o h� contas");
		
		}
 }
}
				
				
			
			
		
		
		
	


