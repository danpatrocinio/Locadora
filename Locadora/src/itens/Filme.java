package itens;

public class Filme {
	
	private String titulo;
	private String genero;
	private Categoria categoria;

	public Filme(String titulo,String genero, Categoria categoria){
		
		if (titulo == null || genero == null || categoria == null) {
			throw new IllegalArgumentException("Todos os campos são obrigatórios!");
		}
		
		this.titulo = titulo;
		this.genero = genero;
		this.categoria = categoria;		
	}
	
	public String getTitulo() {
		return titulo;
	}	
	
	public String getGenero() {
		return genero;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
}
