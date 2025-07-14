package christian_ragonese.U5_W1_D1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Topping {

    private String name;
    private int calories;
    private Double price;

    public Topping(String name, int calories, Double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
