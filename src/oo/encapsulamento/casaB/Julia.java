package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	Ana sogra = new Ana();
	
	void testeAcessos() {
		
		//System.out.println(esposa.segredo); //N�o consigo acessar pois � privado
		//System.out.println(sogra.facoDentroDeCasa); //default ou pacote
		//System.out.println(sogra.formaDeFalar); //protected somente heran�a ou pacote
		System.out.println(sogra.todosSabem); //public, todos sabem
	}
}
