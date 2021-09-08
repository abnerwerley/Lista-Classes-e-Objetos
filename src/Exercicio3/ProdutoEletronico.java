package Exercicio3;

//Exercício 3 | Author : Abner Werley | Date: 08/09/2021
public class ProdutoEletronico {

	String produto;
	String marca;
	String sistemaOperacional;

	public void produtoQualquer(String produto, String marca, String sistemaOperacional) {

		ProdutoEletronico p1 = new ProdutoEletronico();
		p1.produto = produto;
		p1.marca = marca;
		p1.sistemaOperacional = sistemaOperacional;

		System.out.println("Produto: " + produto);
		System.out.println("Marca: " + marca);
		System.out.println("Sistema Operacional: " + sistemaOperacional);
		System.out.println();
	}
}
