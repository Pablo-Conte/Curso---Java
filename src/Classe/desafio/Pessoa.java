package Classe.desafio;

public class Pessoa {

	private String nome;
	private double peso;
	String deus = "deus";
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida food){
		if (food != null) {
			this.peso += food.getPesoComida();
		}
	}
	
	double getPesoPessoa() {
		return this.peso;
	}
	
	String getNomePessoa() {
		return this.nome;
	}

	String getApresentar() {
		return "Ol�, meu nome � " + getNomePessoa() + " e peso: " + getPesoPessoa() + " Kgs.";
	}
}
