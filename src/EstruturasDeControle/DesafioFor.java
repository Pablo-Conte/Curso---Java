package EstruturasDeControle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		//Vers�o do desafio
		//N�o pode usar valor n�merico para controlar o la�o!
		
		String nome = "#";
		int nomeQuantidade = nome.length();
		String nome2 = "Pablo";
		int nome2Quantidade = nome2.length();
		
		for(; nomeQuantidade <= nome2Quantidade; nomeQuantidade++) {
			System.out.println(nome);
			nome += "#";
		}
		
		//Vers�o "Certa"
		
		for(String v = "#"; !v.equals("######"); v+="#") {
			System.out.println(v);
		}
	}
}
