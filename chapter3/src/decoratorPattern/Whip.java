package decoratorPattern;

public class Whip extends CondimentDecorator{
    Beverage beverage;
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", decoratorPattern.Whip";
    }
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
