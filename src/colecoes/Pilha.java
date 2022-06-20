package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>(); // Stack, Lifo. last in, first out
		
		livros.add("O pequeno príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println();
		for(String livross : livros) {
			System.out.println(livross);
		}
		System.out.println();
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.pop()); // exception too
		//System.out.println(livros.remove()); // exception
		
//		livros.size();
//		livros.clear();
//		livros.contains();
//		livros.isEmpty();
		
		
		
	}
}
