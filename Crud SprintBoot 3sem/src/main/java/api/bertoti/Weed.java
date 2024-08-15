package api.bertoti;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Weed {
    private static int idCounter = 0;
    private int id;
    private double valor;
    private String nome;
    private double thc;

    // Construtor
    public Weed(double valor, String nome, double thc) {
        this.id = ++idCounter; 
        this.valor = valor;
        this.nome = nome;
        this.thc = thc;
    }
}

