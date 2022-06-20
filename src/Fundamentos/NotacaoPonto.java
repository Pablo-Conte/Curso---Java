package Fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
	
		String s = "Hello World";
		
		s = s.replace("World", "sir");	
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".toUpperCase().replace("X", x).concat("!!!");
		System.out.println(y);
		
		//Tipos primitivos não tem o operador ponto "."
		int a = 10;
		//a. -> vai dar errado
		System.out.println(a);
	}
}
