package Exercicio6;

//Exercício 6 | Author : Abner Werley | Date: 08/09/2021
public class TestaContaCorrente {

	public static void main(String[] args) {

		ContaBancaria conta = new ContaBancaria();
		conta.contaQualquer("Joãozinho da Silva", "0000-0", "123.456.789.10", 100.000);
		conta.contaQualquer("Ana Rodrigues", "0001-0", "987.654.321.00", 1.000000);
	}
}
