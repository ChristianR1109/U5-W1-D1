package christian_ragonese.U5_W1_D1;

import christian_ragonese.U5_W1_D1.entities.Drink;
import christian_ragonese.U5_W1_D1.entities.Menu;
import christian_ragonese.U5_W1_D1.entities.Pizza;
import christian_ragonese.U5_W1_D1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ConfigClass {

    @Bean
    public Pizza margherita() {
        return new Pizza("Pizza Margherita", 1104, 4.99, List.of(cheese()));
    }

    @Bean
    public Pizza hawaiian() {
        return new Pizza("Hawaiian Pizza", 1024, 6.49, List.of(cheese(), ham(), pineapple()));
    }

    @Bean
    public Pizza salamiPizza() {
        return new Pizza("Salami Pizza", 1160, 5.99, List.of(tomato(), cheese(), salami()));
    }

    @Bean
    public Topping cheese() {
        return new Topping("Cheese", 92, 0.69);
    }

    @Bean
    public Topping ham() {
        return new Topping("Ham", 35, 0.99);
    }

    @Bean
    public Topping pineapple() {
        return new Topping("Pineapple", 24, 0.79);
    }

    @Bean
    public Topping tomato() {
        return new Topping("Tomato", 22, 0.69);
    }

    @Bean
    public Topping salami() {
        return new Topping("Salami", 86, 0.99);
    }

    @Bean
    public Drink lemonade() {
        return new Drink("Lemonade (0.33l)", 128, 1.29);
    }

    @Bean
    public Drink water() {
        return new Drink("Water (0.5l)", 0, 1.29);
    }

    @Bean
    public Drink wine() {
        return new Drink("Wine (0.75l, 13%", 607, 7.49);
    }

    @Bean
    public Menu menu() {
        Menu menu = new Menu();

        menu.addPizza(margherita());
        menu.addPizza(hawaiian());
        menu.addPizza(salamiPizza());

        menu.addTopping(cheese());
        menu.addTopping(ham());
        menu.addTopping(tomato());
        menu.addTopping(pineapple());
        menu.addTopping(salami());

        menu.addDrink(lemonade());
        menu.addDrink((water()));
        menu.addDrink(wine());
        return menu;
    }
}

