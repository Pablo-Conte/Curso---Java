package EstruturasDeControle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o número");
		valor = valor.replace(",", ".");
		Double numero = Double.parseDouble(valor);
		
		double verificacao = numero % 2;
		
		if (verificacao == 0) {
			System.out.printf("%.2f é um Número Par", numero);
		} else {
			System.out.printf("%.2f é um Número Impar", numero);
		}
	}
}
