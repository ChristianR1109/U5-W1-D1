package christian_ragonese.U5_W1_D1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class MenuItem {
    protected String name;
    protected int calories;
    protected Double price;


    public MenuItem(String name, int calories, Double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " calories =" + calories +
                " price =" + price;
    }
}

