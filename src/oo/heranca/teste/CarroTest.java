package oo.heranca.teste;


import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTest {

	public static void main(String[] args) {
		
		
		Ferrari f1 = new Ferrari();
		Carro c1 = new Civic();
		
		f1.ligarTurbo();
		f1.desligarAr();
		
		f1.acelerar();
		System.out.println(f1.toString());
		f1.acelerar();
		System.out.println(f1.toString());
		f1.acelerar();
		System.out.println(f1.toString());
		c1.acelerar();
		System.out.println(c1.toString());
		c1.acelerar();
		System.out.println(c1.toString());
		c1.acelerar();
		System.out.println(c1.toString());
		System.out.println("Velocidade do Ar da Ferrari: " + f1.velocidadeDoAr());
	}
}
