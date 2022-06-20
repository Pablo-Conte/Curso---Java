package EstruturasDeControle;

public class For3 {

	public static void main(String[] args) {
		
		for(int cont=0; cont < 10; cont++) {
			for(int cont2=0; cont2 < 10; cont2++) {
				System.out.printf("[%d %d]", cont, cont2);
			}
			System.out.println();
		}
	}
}
