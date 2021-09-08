package Exercicio4;

//Exercício 4 | Author : Abner Werley | Date: 08/09/2021
public class Funcionario {

	String nome;
	String funcao;
	double salario;
	int tempoNaEmpresa;

	public void funcionarioQualquer(String nome, String funcao, double salario, int tempoNaEmpresa) {
		Funcionario f1 = new Funcionario();
		f1.nome = nome;
		f1.funcao = funcao;
		f1.salario = salario;
		f1.tempoNaEmpresa = tempoNaEmpresa;

		System.out.println("Nome: " + nome);
		System.out.println("Função: " + funcao);
		System.out.println("Salário: " + salario + " reais.");
		System.out.println("Tempo na empresa: " + tempoNaEmpresa + " anos.");
		System.out.println();
	}
}
