package oo.encapsulamento.casaA;

public class Ana {

	@SuppressWarnings("unused")
	private String segredo = "...";
	String facoDentroDeCasa = "..."; //default ou pacote
	protected String formaDeFalar = "...";
	public String todosSabem = "...";
	
	void testeAna() {
		Ana n1 = new Ana(); // aqui a Ana vai ter acesso ao seu segrede, que é privado
		n1.segredo = "Pão";
	}
}
