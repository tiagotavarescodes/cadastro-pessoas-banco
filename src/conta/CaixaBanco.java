package conta;

import java.util.ArrayList;
import java.util.Scanner;

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
		System.out.println("****Selecione uma operação****");
		System.out.println("------------------------------");
		System.out.println("|   Opção 1 - Criar Conta    |");
		System.out.println("|   Opção 2 - Depositar      |");
		System.out.println("|   Opção 3 - Sacar          |");
		System.out.println("|   Opção 4 - Transferir     |");
		System.out.println("|   Opção 5 - Listar         |");
		System.out.println("|   Opção 6 - Sair           |");
		
		int operacao = teclado.nextInt();
		
		switch (operacao) {
		case 1:
			criarConta();
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
			System.out.println("Obrigado por usar nossa agência!");
			System.exit(0);
			break;
			
		default:
			System.out.println("Opção Inválida!");
			operacoes();
			break;
		}
		
	}
	
	

}
