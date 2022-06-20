package oo.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();
	
	void testeAcessos() {
		
		//System.out.println(esposa.segredo); //Não consigo acessar pois é privado
		System.out.println(esposa.facoDentroDeCasa); //default ou pacote
		System.out.println(esposa.formaDeFalar); //protected, moro na mesma casa, não foi herança mas por pacote
		System.out.println(esposa.todosSabem); //public, todos sabem
	}
}
