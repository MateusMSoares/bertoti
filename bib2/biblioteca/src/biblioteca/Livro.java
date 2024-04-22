package biblioteca;

public class Livro {

	private Especificacao especificacao; //encapsulamento - dividir em parte logicas
	private String isbn;
	

	
	public Livro(Especificacao especificacao, String isbn) {
		this.especificacao = especificacao;
		this.isbn = isbn;
	}
	
	
	
	public Especificacao getEspecificacao() {
		return especificacao;
	}



	public void setEspecificacao(Especificacao especificacao) {
		this.especificacao = especificacao;
	}



	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	
}
