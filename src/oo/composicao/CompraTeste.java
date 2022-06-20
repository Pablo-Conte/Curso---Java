package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "João Pedro";
		
		compra1.adicionarItem("Caneta", 20, 7.45);
		compra1.adicionarItem("Borracha", 12, 3.89);
		compra1.adicionarItem("Caderno", 3, 18.79);
		
		System.out.println("Há "+ compra1.itens.size() + " itens");
		System.out.println("Preço total: " + compra1.getValorTotal());
		System.out.println();
		System.out.println("Itens:");
		
		for (Item a : compra1.itens) {
			System.out.println(a.nome);
		}
		
		System.out.println();
		double total = compra1.itens.get(1).compra.itens.get(1).compra.getValorTotal();
		System.out.println("O total é: " + total);
		
		
	}
}
