import static org.junit.Assert.assertEquals;

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

    }
}
