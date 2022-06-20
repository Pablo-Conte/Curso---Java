package EstruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("----- Calculador de notas -----");
		System.out.println("- Dígite -1 para sair do programa e calcular os resultados");
		
		double total = 0;
		int quantidadeNotas = 0;
		double nota = 0;
		
		while(nota != -1) {
			System.out.printf("Coloque a nota de uma aluno: ");
			
			nota = entrada.nextDouble();
			
			if(nota == -1) {
				
			} else if (nota <= 10 && nota >= 0) {
				quantidadeNotas++;
				total += nota;
			} else {
				System.out.println("Nota Inválida, tente novamente!");
			}
			
		}
		
		double media = total / quantidadeNotas;
		
		System.out.printf("A nota média da turma foi %.2f (%d notas)", media, quantidadeNotas);
		
		
		entrada.close();
	}
}
