package biblioteca;

import java.util.List;
import java.util.LinkedList;

public class BibliotecaFatec {
	
	private List<Aluno> alunos = new LinkedList<Aluno>();
	private List<Livro> livros = new LinkedList<Livro>();
	
	
	public void cadastrarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void cadastrarLivro(Livro livro) {
		livros.add(livro);
	}
	
	public List<Aluno> buscarAluno(String nome){
		List<Aluno> alunosEncontrados = new LinkedList<Aluno>();
		for(Aluno aluno: alunos) {
			if(aluno.getNome().equals(nome)) alunosEncontrados.add(aluno);
		}
		return alunosEncontrados;
	}
	
	public List<Livro> buscarLivroPorTitulo(String titulo){
		List<Livro> encontrados = new LinkedList<Livro>();
		for(Livro livro:livros) {
			if(livro.getEspecificacao().getTituloLivro().equals(titulo)) encontrados.add(livro);
		}
		return encontrados;
	}
	
	
	public List<Livro> buscarLivroPorEspecificacao(Especificacao esp){
		List<Livro> encontrados = new LinkedList<Livro>();
		for(Livro livro:livros) {
			if(livro.getEspecificacao().comparar(esp)) encontrados.add(livro);
		}
		return encontrados;
	}
	
	public List<Aluno> getAlunos(){
		return alunos;
	}
	
	public List<Livro> getLivros(){
		return livros;
	}
}
