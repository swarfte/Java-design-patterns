package decoratorPattern;

public class Espresso extends Beverage {
    public Espresso() {
        description = "decoratorPattern.Espresso";
    }
    public double cost() {
        return 1.99;
    }
}
