package abstractFactoryPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name; // name of the pizza

    Dough dough; // dough used for the pizza
    Sauce sauce; // sauce used for the pizza
    Veggies[] veggies; // veggies used for the pizza
    Cheese cheese; // cheese used for the pizza
    Pepperoni pepperoni; // pepperoni used for the pizza
    Clams clam; // clam used for the pizza

    abstract void prepare(); // the factory method

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza: " + name + "";
    }
}