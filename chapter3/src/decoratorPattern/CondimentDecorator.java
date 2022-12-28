package decoratorPattern;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription(); // used to get the description of the beverage

    public Size getSize() {
        return beverage.getSize();
    }
}
