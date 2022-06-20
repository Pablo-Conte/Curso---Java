package EstruturasDeControle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		//Versão do desafio
		//Não pode usar valor númerico para controlar o laço!
		
		String nome = "#";
		int nomeQuantidade = nome.length();
		String nome2 = "Pablo";
		int nome2Quantidade = nome2.length();
		
		for(; nomeQuantidade <= nome2Quantidade; nomeQuantidade++) {
			System.out.println(nome);
			nome += "#";
		}
		
		//Versão "Certa"
		
		for(String v = "#"; !v.equals("######"); v+="#") {
			System.out.println(v);
		}
	}
}
