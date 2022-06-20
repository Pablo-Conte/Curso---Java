package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<Usuario> listaUsers = new ArrayList<>();
		
		Usuario user1 = new Usuario("Ana");
		listaUsers.add(user1);
		//listaUsers.add(user1);
		listaUsers.add(new Usuario("Carlos"));
		listaUsers.add(new Usuario("Lia"));
		listaUsers.add(new Usuario("Bia"));
		listaUsers.add(new Usuario("Manu"));
		
		System.out.println(listaUsers.get(3)); // conseguimos acessar pelo índice
		
		System.out.println("REMOVIDA >>>> " + listaUsers.remove(1));
		System.out.println(listaUsers.remove(new Usuario("Manu")));
		
		System.out.println("Tem? " + listaUsers.contains(new Usuario("Lia")));
		System.out.println("Tem? " + listaUsers.contains(user1));
		
		for(Usuario u : listaUsers) {
			System.out.println(u.getNome());
		}

		
	}
}
