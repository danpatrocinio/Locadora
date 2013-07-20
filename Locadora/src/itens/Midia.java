package itens;

public class Midia {

	private String descricao;
	private Double valor;
	
	public Midia(String descricao, Double valor){
		if (descricao == null || valor == null || valor.compareTo(0.0) < 0) {
			throw new IllegalArgumentException("Mídia inválida! Todos os valores devem ser informados!");
		}
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public Double getValor(){
		return this.valor;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	
}
