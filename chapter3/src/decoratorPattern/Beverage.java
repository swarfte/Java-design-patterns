package decoratorPattern;

public abstract class Beverage {

    public enum Size { TALL, GRANDE, VENTI };
    CondimentDecorator.Size size = CondimentDecorator.Size.TALL;
    String description = "Unknown decoratorPattern.Beverage";
    public String getDescription() {
        return description;
    }
    public abstract double cost(); // used to calculate the cost of the beverage

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

}
