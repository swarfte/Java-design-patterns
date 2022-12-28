package decoratorPattern;

public class Decaf extends Beverage{
    public String getDescription() {
        return "decoratorPattern.Decaf Coffee";
    }
    public double cost() {
        return 1.05;
    }
}
