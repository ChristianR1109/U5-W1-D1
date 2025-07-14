package christian_ragonese.U5_W1_D1.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Pizza> pizzas = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Topping> toppings = new ArrayList<>();


    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public void printMenu() {
        System.out.println("MENU PIZZERIA");
        System.out.println("------------------------------");
        System.out.println("PIZZE");
        for (int i = 0; i < pizzas.size(); i++) {
            System.out.println(pizzas.get(i));
        }
        System.out.println("------------------------------");
        System.out.println("TOPPINGS");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(toppings.get(i));
        }
        System.out.println("------------------------------");
        System.out.println("DRINKS");
        for (int i = 0; i < drinks.size(); i++) {
            System.out.println(drinks.get(i));
        }
    }

}
