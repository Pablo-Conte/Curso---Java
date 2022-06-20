package Fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		/*
		int a = 3 * 4 - 10;
		int b = (int)Math.pow(a, 3);
		
		System.out.println(b );
		*/
		
		double part4 = 3+2;
		double part5 = part4 * 6;
		double part6 = Math.pow(part5, 2);
		double part7 = part6 / (3*2);
		
		double part1 = ((1-5)*(2-7));
		double part2 = part1 / 2;
		double part3 = Math.pow(part2, 2);
		
		double final1 = part7 - part3;
		double final2 = Math.pow(final1, 3);
		double final3 = Math.pow(10, 3);
		double final4 = final2 / final3;
		
		System.out.println(final4);
		
		
		
	}
}
