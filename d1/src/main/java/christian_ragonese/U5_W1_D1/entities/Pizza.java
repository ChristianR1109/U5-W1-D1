package christian_ragonese.U5_W1_D1.entities;

import lombok.Getter;

import java.util.List;

@Getter
public class Pizza extends MenuItem {

    private List<Topping> toppings;

    public Pizza(String name, int calories, Double price, List<Topping> toppings) {
        super(name, calories, price);
        this.toppings = toppings;
    }
}
