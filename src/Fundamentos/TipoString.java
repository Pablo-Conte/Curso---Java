package Fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal!".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pablo";
		var idade = 18;
		var salario = 1010.0;
		var sobrenome = "Conte Correa";
		
		System.out.printf("O %s %s tem %d anos e ganha R$%.2f por mês.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO %s %s tem %d anos e ganha R$%.2f por mês.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		
	}
}