package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pablo", "Conte Correa", 230);
		p1.setIdade(19); //Alterar valor da variável
		
		System.out.println(p1); //Lemos o valor da variável
		System.out.println(p1.getNomeCompleto());
	}
}
