package Classe;

public class DesafioData {

	int dia;
	int mes;
	int ano;
	
	DesafioData(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	DesafioData(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970);
	}
	
	String obterDataFormatada(){
		//return dia + "/" + mes + "/" + ano;
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, this.mes, this.ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());  //esse método é falho, funcionará somente em terminal, roda? roda, mas não é bom.
	}                                              //Somente usamos de exemplo para ver que dá para chamar um método dentro de outro.
	
}
