package cliente;

public class Cliente {
	
	private static int counter = 0;
	
	private String nome;
	private String cpf;
	private String email;
	
	
	public Cliente(String nome, String cpf, String email) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		counter = counter + 1;
		
	}
	

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		
		return "\nNome: " + this.getNome() +
			   "\nCPF: " + this.getCpf() +
			   "\nEmail: " + this.getEmail();
	}
	
	

}
