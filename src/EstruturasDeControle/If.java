package EstruturasDeControle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Informe a m�dia: ");
		double media = entrada.nextDouble();
		
		if (media <= 10 && media>= 7) {
			System.out.printf("A nota do aluno � maior ou igual 7. Logo, aluno aprovado.");
		} else if (media < 7 && media >= 6) {
			System.out.printf("A nota do aluno est� entre 7 e 6. Logo, aluno de recupera��o.");
		} else if (media < 6 && media >= 0){
			System.out.printf("A nota do aluno � menor que 6. Logo, aluno reprovado.");
		} else {
			System.out.printf("Voc� digitou a parada errada merm�o");
		}
		
		entrada.close();
	}
}
