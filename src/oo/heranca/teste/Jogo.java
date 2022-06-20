package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		
		Heroi heroi = new Heroi(0,0);
		
		System.out.println("Monstro tem => : " + monstro.vida);
		System.out.println("Her�i tem => " + heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Her�i tem => " + heroi.vida);
		
		
	}
}
