public class Carro {
    private String marca;
    private String modelo;
    private Especificao especificao;

    public Carro(String marca, String modelo, Especificao especificao) {
        this.marca = marca;
        this.modelo = modelo;
        this.especificao = especificao;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Especificao getEspecificao() {
        return especificao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setEspecificao(Especificao especificao) {
        this.especificao = especificao;
    }

}
