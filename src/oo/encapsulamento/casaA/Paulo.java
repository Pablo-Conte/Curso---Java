package oo.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();
	
	void testeAcessos() {
		
		//System.out.println(esposa.segredo); //N�o consigo acessar pois � privado
		System.out.println(esposa.facoDentroDeCasa); //default ou pacote
		System.out.println(esposa.formaDeFalar); //protected, moro na mesma casa, n�o foi heran�a mas por pacote
		System.out.println(esposa.todosSabem); //public, todos sabem
	}
}
