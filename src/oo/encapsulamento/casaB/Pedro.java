package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{

	void testeAcesso() {
		//System.out.println(mae.segredo); //N�o consigo acessar pois � privado
		//System.out.println(mae.facoDentroDeCasa); //default ou pacote
		System.out.println(formaDeFalar); //protected, moro na mesma casa, n�o foi heran�a mas por pacote
		System.out.println(todosSabem); //public, todos sabem
	}
}
