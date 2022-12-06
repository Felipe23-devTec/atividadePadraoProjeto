package encomendas;

import java.util.List;

public class Caixa implements Item {

	private List<Item> itens;

	public Caixa(List<Item> itens) {
		this.itens = itens;
	}

	public void addItem(Item item) {
		this.itens.add(item);
	}

	public double calculaPrecoFinal() {
	
		double precoFianl = 0;

		for(Item item: itens) {
			precoFianl += item.calculaPrecoFinal();
		}

		return precoFianl;
	}
	
}
