package Fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		//Trabalho na ter�a (V ou F)
		//Trabalho na quinta (V ou F)
		//se um der certo compra a tv de 32 e um sorvete
		//se dois derem certo a tv de 50 e um sorvete
		//se o trabalho de quinta e sexta n�o derem certo, n�o ganhar�o tv nem sorvete
		
		boolean trabalho1 = false;
		boolean trabalho2 = true;
		
		if(trabalho1 && trabalho2) {
			System.out.println("Compramos TV de 50 polegadas e sorvete");
		}
		if(trabalho1 ^ trabalho2) {
			System.out.println("Compramos uma TV de 32 polegadas e sorvete");
		}
		if(!trabalho1 && !trabalho2) {
			System.out.println("Ferrou Bahia, vamos ficar em casa sem TV e sorvete, por�m mais saud�vel");
		}
		
	}
}
