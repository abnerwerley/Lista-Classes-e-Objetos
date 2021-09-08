package Exercicio2;

//Exerc�cio 2 | Author : Abner Werley | Date: 08/09/2021
public class Aviao {

	// Vari�veis:
	private String modelo;
	private String fabricadora;
	private int anoFabricacao;

	// M�todos:
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricadora() {
		return fabricadora;
	}

	public void setFabricadora(String fabricadora) {
		this.fabricadora = fabricadora;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public void definaEImprima(String modelo, String fabricadora, int anoFabricacao) {
		Aviao aviao1 = new Aviao();
		aviao1.setModelo(modelo);
		aviao1.setFabricadora(fabricadora);
		aviao1.setAnoFabricacao(anoFabricacao);

		System.out.println("Modelo: " + modelo);
		System.out.println("Fabricadora: " + fabricadora);
		System.out.println("Ano de fabrica��o: " + anoFabricacao);
		System.out.println();
	}

}
