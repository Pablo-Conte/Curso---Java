package Classe;

public class DesafioDataTest {

	public static void main(String[] args) {
		
		DesafioData dataNascimento = new DesafioData(29, 3, 2003);
		var dataFalecimento = new DesafioData();
		
		//dataNascimento.dia = 29;
		//dataNascimento.mes = 3;
		//dataNascimento.ano = 2003;
		
		//dataFalecimento.dia = 29;
		//dataFalecimento.mes = 12;
		//dataFalecimento.ano = 2099;
		
		String dataFormatada = dataNascimento.obterDataFormatada();
		
		System.out.printf("Data de nascimento de alguém: %s\n", dataFormatada);
		System.out.printf("Data de falecimento de alguém: %s\n", dataFalecimento.obterDataFormatada());
		
		dataNascimento.imprimirDataFormatada();
		dataFalecimento.imprimirDataFormatada();
		
		
	}
}
