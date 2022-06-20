package EstruturasDeControle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Qual dia tu escolhes?:");
		String dia = entrada.next();
		
		if (dia.equalsIgnoreCase("Domingo")) {
			System.out.println("Você escolheu Domingo!");
		} else if (dia.equalsIgnoreCase("Segunda")) {
			System.out.println("Você escolheu Segunda-Feira!");
		} else if (dia.equalsIgnoreCase("Terça")) {
			System.out.println("Você escolheu Terça-Feira!");
		} else if (dia.equalsIgnoreCase("Quarta")) {
			System.out.println("Você escolheu Quarta-Feira!");
		} else if (dia.equalsIgnoreCase("Quinta")) {
			System.out.println("Você escolheu Quinta-Feira!");
		} else if (dia.equalsIgnoreCase("Sexta")) {
			System.out.println("Você escolheu Sexta-Feira!");
		} else if (dia.equalsIgnoreCase("Sábado") || dia.equalsIgnoreCase("Sabado")) {
			System.out.println("Você escolheu Sábado!");
		} else {
			System.out.println("Irmão, tu digitou errado?");
		}
		
		entrada.close();
	}
}
