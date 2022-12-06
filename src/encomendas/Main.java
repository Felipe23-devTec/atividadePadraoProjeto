package encomendas;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {

		Caixa carrinho = new Caixa(new ArrayList<Item>());

		carrinho.addItem(new Produto("Shampoo", 20.0));
		carrinho.addItem(new Produto("TV", 500.0));

		Caixa musica = new Caixa(new ArrayList<Item>());
		musica.addItem(new Produto("Violão", 800));
		musica.addItem(new Produto("Baixo", 1050));
		carrinho.addItem(musica);

		Caixa comida = new Caixa(new ArrayList<Item>());
		comida.addItem(new Produto("Leite", 50));
		comida.addItem(new Produto("Arroz", 40));
		carrinho.addItem(comida);

		System.out.println(carrinho.calculaPrecoFinal());

		
	}
}
