package factoryMethodPattern;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) { // this method is the same for all subclasses
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type); // the factory method implemented by subclasses
}