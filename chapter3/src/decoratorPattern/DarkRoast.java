package decoratorPattern;

public class DarkRoast extends Beverage {
    public String getDescription() {
        return "Dark Roast Coffee";
    }
    public double cost() {
        return 0.99;
    }
}
