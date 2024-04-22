package biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

class Teste {

	@Test
	void test() {
		
		BibliotecaFatec bib = new BibliotecaFatec();
		
		bib.cadastrarAluno(new Aluno("Maria"));
		bib.cadastrarAluno(new Aluno("Joao"));
		
		assertEquals(bib.getAlunos().size(), 2);
		assertEquals(bib.getAlunos().get(0).getNome(), "Maria");
		
		List<Aluno> encontrados = bib.buscarAluno("Maria");
		
		assertEquals(encontrados.size(), 1);
		
		
		bib.cadastrarLivro(new Livro(new Especificacao("senhor dos aneis", "Tolkien", "Ficcao"), "12345"));
		
		assertEquals(bib.getLivros().size(), 1);
		
		List<Livro> livrosEncontrados = bib.buscarLivroPorTitulo("senhor dos aneis");
		
		assertEquals(livrosEncontrados.get(0).getIsbn(),"12345");
		
		List<Livro> livrosEncontradosEspecificacao = bib.buscarLivroPorEspecificacao(new Especificacao("senhor dos aneis", "Tolkien", "Ficcao"));
		
		assertEquals(livrosEncontradosEspecificacao.get(0).getIsbn(), "12345");
		
	}

}
