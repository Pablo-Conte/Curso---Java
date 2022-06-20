package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	String nome;
	List<Compra> compras = new ArrayList<>();
	
	Cliente (String nome){
		this.nome = nome;
	}
	
	void adicionarCompra(Compra c1) {
		compras.add(c1);
	}
	
	double obterValorTotal() {
		double total = 0;
		for(Compra c : compras) {
			for (Item i :c.itens) {
				total += (i.produto.preco) * (i.qtd);
			}
		}
		return total;
	}
}
