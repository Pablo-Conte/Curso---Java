package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

	boolean ligarTurbo;
	boolean ligarAr;
	
	public Ferrari(){
		super(300);
		setDelta(15);
	}
	
//	public void acelerar() {
//		velocidadeAtual += 15;
//	}
	
	public String toString() {
		return "Ferrari está à " + super.velocidadeAtual + "Km/h";
	}
	
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	public void ligarAr() {
		ligarAr = true;
	}
	
	public void desligarAr() {
		ligarAr = false;
	}
	
	public int getDelta(){
		if(ligarTurbo == true && ligarAr == false) {
			return 35;
		} else if (ligarTurbo && !ligarAr) {
			return 30;
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}
}
