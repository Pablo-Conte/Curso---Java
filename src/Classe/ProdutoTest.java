package Classe;

public class ProdutoTest {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89); // EXEMPLO criando instância com um construtor
		//p1.nome = "Notebook";
		//p1.preco = 4356.89;
		//p1.desconto = 0.25;
		
		var p2 = new Produto(); // EXEMPLO criando instância de forma padrão
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		
		
		double precoFinal = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("O montante médio do seu carrinho é igual a: R$%.2f", precoFinal);
		
		//int a = 3;
		//Scanner entrada = new Scanner(System.in);
	}
}
