package itens;

public class Categoria {

	private String descricao;
	private Double percentualAcrescimo;
	private Integer prazoDias;

	public Categoria(String descricao, Double percentualAcrescimo, Integer prazoDias){
		if (descricao == null || prazoDias == null) {
			throw new IllegalArgumentException("A Descrição, Percentual de acréscimo e o prazo da categoria são obrigatórios!");
		}
		this.descricao = descricao;
		this.percentualAcrescimo = percentualAcrescimo == null ? 1.0 : percentualAcrescimo;
		this.prazoDias = prazoDias;
	}

	public String getDescricao() {
		return descricao;
	}

	public Integer getPrazo() {
		return this.prazoDias;
	}

	public Double aplicaPercentualAcrescimo(Double valor) {
		return (valor == null ? 0 : valor) * percentualAcrescimo;
	}

}
