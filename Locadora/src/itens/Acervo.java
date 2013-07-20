package itens;

public class Acervo {

	private Item[] itens;
	private int contador;
	
	public Acervo(){	
	}

	public Acervo(Item... itens){
		for (Item item : itens) {
			adicionaItem((Item) item);
		}
	}
		
	public void adicionaItem(Item item){

		if (itens == null) {
			itens = new Item[100];
		}
		
		int posicao = 0;
		for (int i = 0; i < itens.length; i++) {
			if (itens[i]==null) {
				posicao = i;
				break;
			}
		}
		this.itens[posicao] = item;
		this.contador++;
	}
	
	public void removeItem(Item item){
		for (int i = 0; i < itens.length; i++) {
			if (itens[i]!=null) {
				if (itens[i].getCodigoBarras().equals(item.getCodigoBarras())) {
					itens[i] = null;
				}
			}
		}
	}
	
	public void imprimeAcervo(){
		System.out.println("\n\n========================== Acervo ========================");
		System.out.println("Cód.  | Título                                ");
		System.out.println("==========================================================");
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] !=null && itens[i].getFilme() != null) {
				System.out.println(itens[i].getCodigoBarras() + " - " +  itens[i].getFilme().getTitulo() + 
						" (" + itens[i].getMidia().getDescricao() + ") - " + (itens[i].isReservado() ? "Reservado" : "Disponível"));
			}
		}
		System.out.println("\nTotal de itens do acervo: " + contador);
		System.out.println("==========================================================");
	}
	
}
