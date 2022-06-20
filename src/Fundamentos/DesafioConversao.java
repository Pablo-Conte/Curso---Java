package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dígite aqui o salário 1: ");
		String salario1 = entrada.nextLine();
		System.out.print("Dígite aqui o salário 2: ");
		String salario2 = entrada.nextLine();
		System.out.print("Dígite aqui o salário 3: ");
		String salario3 = entrada.nextLine();
		
		salario1 = salario1.replace(",", ".");
		salario2 = salario2.replace(",", ".");
		salario3 = salario3.replace(",", ".");
		
		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);
		
		double media = (sal1 + sal2 + sal3) / 3;
		
		System.out.printf("A média entre os salário dados é: R$%.2f", media);
		
		entrada.close();
	}
}
