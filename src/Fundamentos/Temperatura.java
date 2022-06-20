package Fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		//(fº -32) x 5/9 = Cº
		
		double fahrenheit = 32;
		final double subtracao = -32;
		final double multiplicacao = 5/9.0;
		double celcius = (fahrenheit + subtracao) * multiplicacao;
		System.out.println(fahrenheit + "°F são " + celcius + "°C.");
		fahrenheit = 86;
		celcius = (fahrenheit + subtracao) * multiplicacao;
		System.out.println(fahrenheit + "°F são " + celcius + "°C.");
	}
}
