package compositePattern;

public abstract class MenuComponent {

    // the add, remove , get child method is only for the composite class
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    // the other method is for the leaf class, but we can implement it in the composite class
    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }


    // the print method is for the composite class and leaf class
    public void print() {
        throw new UnsupportedOperationException();
    }
}
