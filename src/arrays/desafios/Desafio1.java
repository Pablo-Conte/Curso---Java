package arrays.desafios;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int quantidadeNotas = 0;
		
		System.out.print("Digite a quantidade de notas que você quer passar: ");
		quantidadeNotas = entrada.nextInt();
		
		double[] notas = new double[quantidadeNotas];
		
		for(int cont = 0; cont < quantidadeNotas; cont++) {
			System.out.printf("Nota %d: ", cont + 1);
			double nota = entrada.nextDouble();
			notas[cont] = nota;
		}
		
		double resultado = 0;
		
		for(double resultadoMedia : notas) {
			resultado += resultadoMedia;
		}
		
		double media = resultado / notas.length;
		
		for (int cont = 0; cont < notas.length; cont++){
			System.out.printf("\nNota %d: %.2f", cont+1, notas[cont]);
		}
		System.out.printf("\nA media do aluno é %.2f", media);
		
		entrada.close();
	}
}
