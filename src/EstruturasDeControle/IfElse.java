package EstruturasDeControle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o n�mero");
		valor = valor.replace(",", ".");
		Double numero = Double.parseDouble(valor);
		
		double verificacao = numero % 2;
		
		if (verificacao == 0) {
			System.out.printf("%.2f � um N�mero Par", numero);
		} else {
			System.out.printf("%.2f � um N�mero Impar", numero);
		}
	}
}
