package Fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		String s = new String("Pablo");
		s.toUpperCase();
		
		//wrappers s�o a vers�o objetos dos tipos primitivos!
		int a = 123;
		System.out.println(a);
	}
}
