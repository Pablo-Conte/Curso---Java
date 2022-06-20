package oo.composicao.desafio;

public class ClienteTest {

	public static void main(String[] args) {
		
		/* 
		 * Criar um cliente
		 * duas compras
		 * cada com dois itens
		 * cada iten associada a produtos diferentes
		 */
		
		Cliente c1 = new Cliente("Pablo");
		
		Produto p1 = new Produto(9.67, "feijão");
		Produto p2 = new Produto(1897.88, "arroz");
		Produto p3 = new Produto(10, "batata");
		Produto p4 = new Produto(998.90, "massa");
		
		Item i1 = new Item(100, p1);
		Item i2 = new Item(2, p2);
		Item i3 = new Item(10, p3);
		Item i4 = new Item(1, p4);
		
		Compra com1 = new Compra();
		Compra com2 = new Compra();
		
		com1.adicionarItens(i1);
		com1.adicionarItens(i2);
		com2.adicionarItens(i3);
		com2.adicionarItens(i4);
		
		c1.adicionarCompra(com1);
		c1.adicionarCompra(com2);
		
		double total = c1.obterValorTotal();
		
		System.out.println("O valor total de tudo deu: R$" + total);
	}
}
