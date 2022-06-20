package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	Ana sogra = new Ana();
	
	void testeAcessos() {
		
		//System.out.println(esposa.segredo); //Não consigo acessar pois é privado
		//System.out.println(sogra.facoDentroDeCasa); //default ou pacote
		//System.out.println(sogra.formaDeFalar); //protected somente herança ou pacote
		System.out.println(sogra.todosSabem); //public, todos sabem
	}
}
