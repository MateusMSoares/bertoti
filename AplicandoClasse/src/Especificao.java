
public class Especificao {
    private boolean automatico;
    private boolean arCondicionado;
    private boolean bancoCouro;

    public Especificao(boolean automatico, boolean arCondicionado, boolean bancoCouro) {
        this.automatico = automatico;
        this.arCondicionado = arCondicionado;
        this.bancoCouro = bancoCouro;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean isBancoCouro() {
        return bancoCouro;
    }

    public void setBancoCouro(boolean bancoCouro) {
        this.bancoCouro = bancoCouro;
    }

    public boolean comparar(Especificao especificao) {
        if (this.automatico == especificao.automatico && this.arCondicionado == especificao.arCondicionado && this.bancoCouro == especificao.bancoCouro) {
            return true;
        }
        return false;
    }
    
}
