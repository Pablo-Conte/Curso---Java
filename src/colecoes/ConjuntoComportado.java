package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		Set<String> listaDeAprovados = new HashSet<String>();
		//SortedSet<String> listaDeAprovados = new TreeSet<String>();
		
		listaDeAprovados.add("Pablo");
		listaDeAprovados.add("Paulo");
		listaDeAprovados.add("Cleonice");
		listaDeAprovados.add("Luana");
		
		for(String candidato : listaDeAprovados) {
			System.out.println(candidato);
		}
		
		SortedSet<Double> nums = new TreeSet<>();
		
		System.out.println();
		nums.add(1.2);
		nums.add(2.3);
		nums.add(3.4);
		nums.add(4.9);
		
		//nums.get(1); Não é possível acessar pelo índice
		
		for(Double nums1 : nums) {
			System.out.println(nums1);
		}
	}
}
