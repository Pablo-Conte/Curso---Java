package EstruturasDeControle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "por favor";
		
		do {
			System.out.printf("Voc� precisa falar as palavras m�gicas para sair meu caro!\n");
			System.out.printf("Quer sair? ");
			valor = entrada.nextLine();
		} while (!valor.equalsIgnoreCase("por favor"));
		
		
		System.out.println("Obrigado!");
		entrada.close();
	}
}
