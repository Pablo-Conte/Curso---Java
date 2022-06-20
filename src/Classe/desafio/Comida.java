package Classe.desafio;

public class Comida {

	private String nome;
	private double pesoComida;
	
	Comida(String nome, double pesoComida){
		this.nome = nome;
		this.pesoComida = pesoComida;
	}
	
	String getNomeComida() {
		return this.nome;
	}
	
	double getPesoComida() {
		return pesoComida;
	}
}
