package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> Adicionam elementos na lista.
		// tanto offer quanto add adicionam elementos na fila, a diferen�a � o comportamento de quando a fila estiver cheia.
		// Diferen�a de comportamento com a fila est� cheia.
		fila.add("Ana");
		fila.offer("Bia"); // offer ir� retornar true or false caso n�o conseguir adcionar algo, j� o add ir� dar uma exception.
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> obtem o pr�ximo elemento da fila sem remover
		// A diferen�a do comportamento ocorre quando a fila est� vazia.
		System.out.println(fila.peek()); //ir� retornar nulo
		System.out.println(fila.peek());
		System.out.println(fila.element()); //ir� retornar um erro de exception
		System.out.println(fila.element());
		
		
		
		//Poll e remove -> obtem o pr�ximo elemnto da fila removendo o mesmo
		// A diferen�a do comportametno ocorre quando a fila est� vazia, onde o remove vai gerar uma excepetion e o poll vai retornar null
		System.out.println(fila.poll());
		System.out.println(fila.remove()); //retorna exception
		System.out.println(fila.poll()); //retorna null
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
		
	}
}
