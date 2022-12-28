package factoryMethodPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name; // name of the pizza
    String dough; // dough used for the pizza
    String sauce; // sauce used for the pizza
    List<String> toppings = new ArrayList<>(); // toppings used for the pizza

    void prepare() { // prepare the pizza
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }

    void bake() { // bake the pizza
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() { // cut the pizza
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() { // box the pizza
        System.out.println("Place pizza in official abstractFactoryPattern.PizzaStore box");
    }

    public String getName() { // get the name of the pizza
        return name;
    }
}
