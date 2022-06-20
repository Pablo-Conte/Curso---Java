package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Test"); // String
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> caracteres
		
		System.out.println("tamanho é: " + conjunto.size());
		
		conjunto.add("Test");
		
		System.out.println("tamanho é: " + conjunto.size());
		
		System.out.println(conjunto.remove("Test"));;
		
		System.out.println("tamanho é: " + conjunto.size());
		
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains("Test"));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(conjunto + " e " + nums);
		
		conjunto.addAll(nums);
		System.out.println(conjunto);
		
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
	}
}
