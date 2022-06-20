package Classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribuição por valor (tipo primitivo)
		
		a++;
		b--;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		DesafioData d1 = new DesafioData(1, 6, 2022);
		DesafioData d2 = d1; //atribuição por referência (Objeto)
		
		d2.dia = 3;
		d1.mes = 7;
		
		d1.ano = 2025;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
		
		
		
	}
	
	static void voltarDataParaValorPadrao(DesafioData d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
}
