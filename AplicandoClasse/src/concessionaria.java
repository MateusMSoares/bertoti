import java.util.LinkedList;
import java.util.List;

public class concessionaria {

    List<Carro> carros = new LinkedList<Carro>();
        // Carro honda = new Carro("Honda", "Civic", new Especificao(true, true, true));
        // Carro toyota = new Carro("Toyota", "Corolla", new Especificao(true, true, false));
        
        public void cadastrarCarro(Carro carro) {
            carros.add(carro);
        }

        public List<Carro> buscarCarrosPorMarca(String marca) {
            List<Carro> carrosPorMarca = new LinkedList<Carro>();
            for (Carro carro : carros) {
                if (carro.getMarca().equals(marca)) {
                    carrosPorMarca.add(carro);
                }
            }
            return carrosPorMarca;
        }

        public List<Carro> buscarCarrosPorEspecificao(Especificao especificao) {
            List<Carro> carrosPorEspecificao = new LinkedList<Carro>();
            for (Carro carro : carros) {
                if (carro.getEspecificao().comparar(especificao)) {
                    carrosPorEspecificao.add(carro);
                }
            }
            return carrosPorEspecificao;
        }

        public List<Carro> buscarCarroPorModelo(String modelo) {
            List<Carro> carrosPorMarca = new LinkedList<Carro>();
            for (Carro carro : carros) {
                if (carro.getModelo().equals(modelo)) {
                    carrosPorMarca.add(carro);
                }
            }
            return carrosPorMarca;
        }


}
