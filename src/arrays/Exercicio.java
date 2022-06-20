package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);
		//System.out.println(notasAlunoA[4]); ERRO!
		
		double total = 0;
		
		for(int a = 0; a < notasAlunoA.length; a++) {
			total += notasAlunoA[a];
		}
		
		System.out.println(total / notasAlunoA.length);
		
		final double notaArmazenada = 5.9;
		
		double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};
		
		total = 0;
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			total += notasAlunoB[i];
		}
		
		System.out.println(Arrays.toString(notasAlunoB));
		System.out.println(total / notasAlunoB.length);
		
	}
}
