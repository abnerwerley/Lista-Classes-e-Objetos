package Exercicio6;

//Exerc�cio 6 | Author : Abner Werley | Date: 08/09/2021
public class ContaBancaria {

	String nome;
	String agencia;
	String contaCorrente;
	double saldo;

	public void contaQualquer(String nome, String agencia, String contaCorrente, double saldo) {
		ContaBancaria conta = new ContaBancaria();
		conta.nome = nome;
		conta.agencia = agencia;
		conta.contaCorrente = contaCorrente;
		conta.saldo = saldo;

		System.out.println("Nome Completo: " + nome);
		System.out.println("Ag�ncia: " + agencia);
		System.out.println("Conta Corrente: " + contaCorrente);
		System.out.println("Saldo Dispon�vel: " + saldo);
		System.out.println();
	}
}
