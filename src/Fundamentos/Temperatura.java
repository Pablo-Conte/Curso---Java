package Fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		//(f� -32) x 5/9 = C�
		
		double fahrenheit = 32;
		final double subtracao = -32;
		final double multiplicacao = 5/9.0;
		double celcius = (fahrenheit + subtracao) * multiplicacao;
		System.out.println(fahrenheit + "�F s�o " + celcius + "�C.");
		fahrenheit = 86;
		celcius = (fahrenheit + subtracao) * multiplicacao;
		System.out.println(fahrenheit + "�F s�o " + celcius + "�C.");
	}
}
