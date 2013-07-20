package main;

import itens.Acervo;
import itens.Categoria;
import itens.Cliente;
import itens.Filme;
import itens.Item;
import itens.Locacao;
import itens.Midia;

public class Programa {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("123546879", "João");
		Cliente c2 = new Cliente("987654321","Maria");

		Categoria catalogo = new Categoria("Catalogo", 1.0, 3);
		Categoria lancamento = new Categoria("Lancamento", 1.25, 2);
		Categoria superLancamento = new Categoria("Super Lancamento", 1.5, 1);
		
		Midia vhs = new Midia("VHS", 2.50);
		Midia dvd = new Midia("DVD", 2.50);
		Midia blueRay = new Midia("BlueRay", 3.50);

		Filme titanic = new Filme("Titanic","Romance",catalogo);	
		Filme rambo = new Filme("Rambo 4","Ação",lancamento);
		Filme homemDeAco = new Filme("Homem de Aço","Ação",superLancamento);
		Filme meuMalvadoFavorito2 = new Filme("Meu malvado favorito 2","Comédia",superLancamento);

		Item item =  new Item("16831", vhs, titanic);
		Item item2 = new Item("18615", dvd, rambo);
		Item item3 = new Item("13515", blueRay, homemDeAco);
		Item item4 = new Item("20123", blueRay, meuMalvadoFavorito2);
		Item item5 = new Item("20124", blueRay, meuMalvadoFavorito2);
		
		Acervo acervo = new Acervo(item,item2,item3,item4,item5);

		Locacao locacao1 = new Locacao(c1);
		locacao1.adicionaItem(item);
		locacao1.adicionaItem(item2);
		locacao1.imprime();
		
		Locacao locacao2 = new Locacao(c2);
		locacao2.adicionaItem(item3);
		locacao2.adicionaItem(item4);
		locacao2.imprime();

		acervo.imprimeAcervo();
		
	}
}
