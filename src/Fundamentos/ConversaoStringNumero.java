package Fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("D�gite o primeiro n�mero:");
		String valor2 = JOptionPane.showInputDialog("D�gite o segundo n�mero:");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		
		System.out.printf("%.2f + %.2f = %.2f\n", numero1, numero2, soma);
		
		double media = (numero1 + numero2)/2;
		
		System.out.printf("A m�dia entre %.2f e %.2f � igual a: %.2f", numero1, numero2, media);
	}
}
