package oo.heranca.desafio;

public class Civic extends Carro{

	public Civic(){
		super(110);
	}
	
	public String toString() {
		return "Civic est� � " + super.velocidadeAtual + "Km/h";
	}
	
}
