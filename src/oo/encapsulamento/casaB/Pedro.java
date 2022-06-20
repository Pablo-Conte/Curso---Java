package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{

	void testeAcesso() {
		//System.out.println(mae.segredo); //Não consigo acessar pois é privado
		//System.out.println(mae.facoDentroDeCasa); //default ou pacote
		System.out.println(formaDeFalar); //protected, moro na mesma casa, não foi herança mas por pacote
		System.out.println(todosSabem); //public, todos sabem
	}
}
