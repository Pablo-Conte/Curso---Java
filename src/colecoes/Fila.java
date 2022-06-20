package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> Adicionam elementos na lista.
		// tanto offer quanto add adicionam elementos na fila, a diferença é o comportamento de quando a fila estiver cheia.
		// Diferença de comportamento com a fila está cheia.
		fila.add("Ana");
		fila.offer("Bia"); // offer irá retornar true or false caso não conseguir adcionar algo, já o add irá dar uma exception.
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> obtem o próximo elemento da fila sem remover
		// A diferença do comportamento ocorre quando a fila está vazia.
		System.out.println(fila.peek()); //irá retornar nulo
		System.out.println(fila.peek());
		System.out.println(fila.element()); //irá retornar um erro de exception
		System.out.println(fila.element());
		
		
		
		//Poll e remove -> obtem o próximo elemnto da fila removendo o mesmo
		// A diferença do comportametno ocorre quando a fila está vazia, onde o remove vai gerar uma excepetion e o poll vai retornar null
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
