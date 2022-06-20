package Classe;

import java.util.Date;

public class Equals {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		Usuarios u1 = new Usuarios("Pedro Silva", "pedro.silva@email.com.br");
		
		Usuarios u2 = new Usuarios("Pedro Silva", "pedro.silva@email.com.br");
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		System.out.println(u2.equals(new Date()));
	}
	
	// O hashcode será abordado em outra aula
}
