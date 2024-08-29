public class DadosCliente {
    private String cpf;
    private String rg;

    public DadosCliente(String cpf, String rg) {
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean comparar(DadosCliente dadosCliente) {
        if (this.cpf.equals(dadosCliente.getCpf()) && 
                this.rg.equals(dadosCliente.getRg())) {
            return true;
        }
        return false;
    }

    
}
