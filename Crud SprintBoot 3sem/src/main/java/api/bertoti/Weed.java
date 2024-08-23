package api.bertoti;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Weed {
    private static int idCounter = 0;
    private int id;
    private double price;
    private String name;
    private double thc;

    // Construtor
    public Weed(String name, double thc, double price) {
        this.id = ++idCounter; 
        this.name = name;
        this.thc = thc;
        this.price = price;
    }
}

