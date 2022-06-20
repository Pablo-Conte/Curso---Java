package oo.heranca.desafio;

public class Civic extends Carro{

	public Civic(){
		super(110);
	}
	
	public String toString() {
		return "Civic está à " + super.velocidadeAtual + "Km/h";
	}
	
}
