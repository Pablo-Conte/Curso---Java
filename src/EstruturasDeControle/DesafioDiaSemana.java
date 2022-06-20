package EstruturasDeControle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Qual dia tu escolhes?:");
		String dia = entrada.next();
		
		if (dia.equalsIgnoreCase("Domingo")) {
			System.out.println("Voc� escolheu Domingo!");
		} else if (dia.equalsIgnoreCase("Segunda")) {
			System.out.println("Voc� escolheu Segunda-Feira!");
		} else if (dia.equalsIgnoreCase("Ter�a")) {
			System.out.println("Voc� escolheu Ter�a-Feira!");
		} else if (dia.equalsIgnoreCase("Quarta")) {
			System.out.println("Voc� escolheu Quarta-Feira!");
		} else if (dia.equalsIgnoreCase("Quinta")) {
			System.out.println("Voc� escolheu Quinta-Feira!");
		} else if (dia.equalsIgnoreCase("Sexta")) {
			System.out.println("Voc� escolheu Sexta-Feira!");
		} else if (dia.equalsIgnoreCase("S�bado") || dia.equalsIgnoreCase("Sabado")) {
			System.out.println("Voc� escolheu S�bado!");
		} else {
			System.out.println("Irm�o, tu digitou errado?");
		}
		
		entrada.close();
	}
}
