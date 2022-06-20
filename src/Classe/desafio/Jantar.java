package Classe.desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida food1 = new Comida("Arroz", 0.180);
		Comida food2 = new Comida("Feijão", 0.3);
		
		Pessoa p1 = new Pessoa("Pablo", 63);
		
		System.out.println(p1.getApresentar());
		p1.comer(food1);
		
		System.out.println(p1.getApresentar());
		p1.comer(food2);
		
		System.out.println(p1.getApresentar());
		
	}
}
