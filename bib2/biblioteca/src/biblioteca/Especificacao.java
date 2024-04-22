package biblioteca;

public class Especificacao {
	
	private String tituloLivro;
	private String autor;
	private String categoria;
	//resolvi colocar mais 1 atributo...
	
	public Especificacao(String tituloLivro, String autor, String categoria) {
		this.tituloLivro = tituloLivro;
		this.autor = autor;
		this.categoria = categoria;
	}


	public String getTituloLivro() {
		return tituloLivro;
	}


	public void setTituloLivro(String tituloLivro) {
		this.tituloLivro = tituloLivro;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	public boolean comparar(Especificacao esp) {
		if(!esp.tituloLivro.equals(tituloLivro)) return false;
		if(!esp.autor.equals(autor)) return false;
		if(!esp.categoria.equals(categoria)) return false;
		return true;
	}

}
