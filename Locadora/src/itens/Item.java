package itens;

public class Item {

	private String codigoBarras;
	private Midia midia;
	private Filme filme;
	private boolean reservado;

	public Item(String codigoBarras, Midia midia, Filme filme) {
		
		if (codigoBarras == null) {
			throw new IllegalArgumentException("O c�digo de barras � obrigat�rio!");			
		}
		if (midia == null) {
			throw new IllegalArgumentException("A m�dia � obrigat�ria!");
		}		
		if (filme == null) {
			throw new IllegalArgumentException("O filme � obrigat�rio!");			
		}
		
		this.codigoBarras = codigoBarras;
		this.midia = midia;
		this.filme = filme;
	}
	
	public Double getValorItem(){
		if (filme.getCategoria() != null ) {
			return filme.getCategoria().aplicaPercentualAcrescimo(midia.getValor());
		}
		return  midia.getValor();
	}
	
	public String getCodigoBarras() {
		return this.codigoBarras;
	}

	public Midia getMidia(){
		return this.midia;
	}
	
	public Filme getFilme() {
		return filme;
	}

	public boolean isReservado() {
		return reservado;
	}
	
	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}
}
