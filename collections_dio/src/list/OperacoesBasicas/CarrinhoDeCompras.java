package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	// atributos
	private List<Item> itemList;

	// construtor
	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}

	// metodos

	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
		itemList.add(item);
	}

	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		if (!itemList.isEmpty()) {
			for (Item i : itemList) {
				if (i.getNome().equalsIgnoreCase(nome)) {
					itensParaRemover.add(i);
				}
				itemList.removeAll(itensParaRemover);
			}
		} else {
			System.out.println("O carrinho está vazio!");
		}

	}

	public double calcularValorTotal() {
		double somaTotal = 0d;
		if (!itemList.isEmpty()) {
			for (Item i : itemList) {
				double valorItem = i.getPreco() * i.getQuantidade();
				somaTotal += valorItem;
			}
			return somaTotal;
		}else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	public void exibirItens() {
		System.out.println(itemList);
	}

	public static void main(String[] args) {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		carrinhoDeCompras.adicionarItem("Chocolate", 5, 3);
		carrinhoDeCompras.adicionarItem("Pão", 1, 7);
		carrinhoDeCompras.adicionarItem("Pacote de Macarrão", 4, 2);

		carrinhoDeCompras.exibirItens();
		System.out.println("O total do carrinho de compras é: " + carrinhoDeCompras.calcularValorTotal());
		
		carrinhoDeCompras.removerItem("Pão");
		
		carrinhoDeCompras.exibirItens();
		System.out.println("O total do carrinho de compras é: " + carrinhoDeCompras.calcularValorTotal());

	}
}
