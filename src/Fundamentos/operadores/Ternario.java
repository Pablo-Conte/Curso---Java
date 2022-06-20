package Fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 9.6;
		String resultadoRecuperacao = media >= 5.0 ? "Recuperação" : "Reprovado";
		String resultado = media >= 7.0 ? "Aprovado" : resultadoRecuperacao;
		System.out.printf("Estado do aluno: %s", resultado);
		
	}
}
