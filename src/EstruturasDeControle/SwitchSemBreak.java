package EstruturasDeControle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o bassai-dai");
		case "marrom":
			System.out.println("Sei o tekki shodan");
		case "roxa":
			System.out.println("Sei o Heian Goddan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
				System.out.println("Não sei nada");
		}
		
		System.out.println("Fim!");
	}
}
