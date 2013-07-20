package itens;

public class Locacao {

	private Cliente cliente;
	private Item[] itens;

	public Locacao(Cliente cliente){
		this.cliente = cliente;
	}

	public void removeItemLocacao(Integer posicao){
		if (itens[posicao]!=null) {
			this.itens[posicao] = null;			
		} else {
			throw new IllegalArgumentException("Filme n�o encontrado!");
		}
	}

	public void adicionaItem(Item item) {
			if (itens == null) {
				itens = new Item[100];
			}
			
			for (int i = 0; i < itens.length; i++) {
				if (itens[i]==null) {
					itens[i] = item;
					return;
				}
			}
	}

	public void imprime(){
		Double valorTotal = 0.0;
		StringBuilder locacao = new StringBuilder("\n======================== Loca��o ======================" +
		"\nCliente: " + cliente.getDocumento() + " - " + cliente.getNome());
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] != null && itens[i].getFilme() != null) {
				locacao.append("\n\n\t" + (i+1) + ") T�tulo: " + itens[i].getFilme().getTitulo() + ", " + 
						" g�nero: " + itens[i].getFilme().getGenero() + ", " +
						" M�dia: " + itens[i].getMidia().getDescricao() + ", " +
						" valor: " + (!itens[i].isReservado() ? itens[i].getValorItem() : "0.0") + ", " +
						" prazo: " + itens[i].getFilme().getCategoria().getPrazo() + " dias.");
				if (itens[i].isReservado()) {
					locacao.append(" [ITEM RESERVADO]");
				} else {
					valorTotal += itens[i].getValorItem();
					itens[i].setReservado(Boolean.TRUE);
				}
			}
		}
		System.out.println(locacao.toString() + "\n\nValor Total Loca��o ===========================================> " + valorTotal);
	}
	
	
}
