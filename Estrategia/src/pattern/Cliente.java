package pattern;

public class Cliente {
	
	//nao tenho mais 1 classe p cada cliente
	private String tipo;
	
	private Emprestimo emprestimo;
	
	public void setEmprestimo(Emprestimo emp) {
		emprestimo = emp;
	}
	
	public void chamarEmprestimo() {
		emprestimo.emprestar();
	}

}
