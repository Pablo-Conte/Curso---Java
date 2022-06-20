package Fundamentos;

import java.util.Scanner;

public class DesafioDoModuloFundamentos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Escolha o primeiro n�mero: ");
		double valor1 = entrada.nextDouble();
		System.out.printf("Escolha o segundo n�mero: ");
		double valor2 = entrada.nextDouble();
		double fds = 0;
		System.out.printf("Escolha uma forma de calcular o primeiro n�mero com o segundo n�mero: "); // + - * / %
		String FormaDeCalcular = entrada.next();
		
		double resultado = FormaDeCalcular.equals("+") ? valor1 + valor2 : fds;
		resultado = FormaDeCalcular.equals("-") ? valor1 - valor2 : resultado;
		resultado = FormaDeCalcular.equals("*") ? valor1 * valor2 : resultado;
		resultado = FormaDeCalcular.equals("/") ? valor1 / valor2 : resultado;
		resultado = FormaDeCalcular.equals("%") ? valor1 % valor2 : resultado;
		System.out.println(resultado);
		
		entrada.close();
	}
}
