package iteratorPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class PancakeHouseMenu implements Menu {
    List<MenuItem> menuItems; // use List to contain the menuItems

    public PancakeHouseMenu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
        menuItems.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99));
        menuItems.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49));
        menuItems.add(new MenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59));
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator(); // use this iterator to iterate the menuItems
    }

}
