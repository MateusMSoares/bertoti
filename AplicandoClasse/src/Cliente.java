import java.util.LinkedList;
import java.util.List;

public class Cliente {
    private String nome;
    private DadosCliente dadosCliente;
    private List<Carro> carros = new LinkedList<Carro>();

    public Cliente(String nome, DadosCliente dadosCliente) {
        this.nome = nome;
        this.dadosCliente = dadosCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DadosCliente getDadosCliente() {
        return dadosCliente;
    }

    public void setDadosCliente(DadosCliente dadosCliente) {
        this.dadosCliente = dadosCliente;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void adicionaCarro(Carro carro) {
        carros.add(carro);
    }

    public void removeCarro(Carro carro) {
        carros.remove(carro);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", dadosCliente=" + dadosCliente +
                ", carros=" + carros +
                '}';
    }

}
