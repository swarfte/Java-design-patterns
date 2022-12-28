package abstractFactoryPattern;

public interface PizzaIngredientFactory {
public Dough createDough(); // the factory method
    public Sauce createSauce(); // the factory method
    public Cheese createCheese(); // the factory method
    public Veggies[] createVeggies(); // the factory method
    public Pepperoni createPepperoni(); // the factory method
    public Clams createClam(); // the factory method

}
