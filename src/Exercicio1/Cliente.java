package Exercicio1;

//Exerc�cio 1 | Author : Abner Werley | Date: 08/09/2021
public class Cliente {

	// Atributos --> Vari�veis
	private String nome;
	private String cpf;
	private String email;
	private String endereco;
	private int idade;

	// M�todos:
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void facilitador(String nome, String cpf, String email, String endereco, int idade) {
		Cliente dado = new Cliente();
		dado.setNome(nome);
		dado.setCpf(cpf);
		dado.setEmail(email);
		dado.setEndereco(endereco);
		dado.setIdade(idade);

		System.out.println("Nome:" + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("E-mail: " + email);
		System.out.println("Endere�o: " + endereco);
		System.out.println("Idade: " + idade);
		System.out.println();

	}
}
