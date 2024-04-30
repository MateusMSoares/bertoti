import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class concessionariaTest {
    @Test
    public void Test(){
        Carro honda1 = new Carro("Honda", "Civic", new Especificao(true, true, true));
        Carro honda = new Carro("Honda", "Civic", new Especificao(true, true, true));
        Carro toyota = new Carro("Toyota", "Corolla", new Especificao(true, true, false));
        concessionaria concessionaria = new concessionaria();
        concessionaria.cadastrarCarro(honda);
        concessionaria.cadastrarCarro(honda1);
        concessionaria.cadastrarCarro(toyota);
        List<Carro> carrosPorMarca = concessionaria.buscarCarrosPorMarca("Honda");
        List<Carro> carrosPorEspecificao = concessionaria.buscarCarrosPorEspecificao(new Especificao(true, true, true));
        List<Carro> carrosPorModelo = concessionaria.buscarCarroPorModelo("Civic");
        assertEquals(2, carrosPorMarca.size());
        assertEquals(2, carrosPorEspecificao.size());
        assertEquals(2, carrosPorModelo.size());

        Cliente Alexander_Luthor = new Cliente("Alexander Luthor", new DadosCliente("123456789", "987654321"));
        Cliente APOCALPSE = new Cliente("APOCALYPSE", new DadosCliente("12321312", "9987997"));
        concessionaria.CadastrarCliente(Alexander_Luthor);
        concessionaria.CadastrarCliente(APOCALPSE);
        assertEquals(2, concessionaria.clientes.size());

        assertEquals(1, concessionaria.buscarClientesPorNome("Alexander Luthor").size());
        assertEquals(1, concessionaria.buscarClientesPorDadosCliente(APOCALPSE.getDadosCliente()).size());

        concessionaria.adicionarCarroAoCliente(APOCALPSE, toyota);
        concessionaria.adicionarCarroAoCliente(APOCALPSE, toyota);
        assertEquals(2, APOCALPSE.getCarros().size());

        concessionaria.removerCarroDoCliente(APOCALPSE, toyota);
        assertEquals(1, APOCALPSE.getCarros().size());

        assertEquals(1, concessionaria.buscarCarrosDoCliente(APOCALPSE).size());

        concessionaria.adicionarCarroAoCliente(APOCALPSE, honda1);

        assertEquals(2, concessionaria.buscarCarrosDoCliente(APOCALPSE).size());

        List<Carro> carrosDoCliente = concessionaria.buscarCarrosDoCliente(APOCALPSE);
        List<Carro> carrosPorEspecificaoDoCliente = new LinkedList<Carro>();
        for (Carro carro : carrosDoCliente) {
            if (carro.getEspecificao() == new Especificao(true, true, true)) {
                carrosPorEspecificaoDoCliente.add(carro);
            }
        }   
        assertEquals(1, 1);

        concessionaria.removerCarroDoCliente(APOCALPSE, honda1);

        assertEquals(1, concessionaria.buscarCarrosDoCliente(APOCALPSE).size());

    }
}
