package iteratorPattern;

import java.util.Iterator;
import java.util.List;

public class PacketHouseIterator implements Iterator<MenuItem> {
    List<MenuItem> menuItems; // use List to contain the menuItems
    int position = 0; // the current position of the iterator

    public PacketHouseIterator(List<MenuItem> menuItems) { // receive the array of menuItems
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size() && menuItems.get(position) != null; // check if the current position is the last position
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position = position + 1; // move the position to the next item
        return menuItem;
    }
}
