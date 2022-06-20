package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a);
		
		float b = (float) 1.123456789999; //explícita (CAST)
		System.out.println(b);
		
		int c = 256;
		System.out.println(c);
		byte d = (byte) c; //explícita (CAST)
		System.out.println(d);
		
		double e = 1;
		int f = (int) e; //explícita (CAST)
		System.out.println(f);
		
	}
}
