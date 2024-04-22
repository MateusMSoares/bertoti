package pattern;

public class Teste {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.setEmprestimo(new EmprestimoProibido());
		
		cliente.chamarEmprestimo(); //POLIMORFISMO
		
		cliente.setEmprestimo(new EmprestimoPermitido());
		
		cliente.chamarEmprestimo(); //POLIMORFISMO
		
	}

}
