package iteratorPattern;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items; // use array to contain the menuItems
    int position = 0; // the current position of the iterator

    public DinerMenuIterator(MenuItem[] items) { // receive the array of menuItems
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null; // check if the current position is the last position
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1; // move the position to the next item
        return menuItem;
    }

    @Override
    public void remove(){
        throw new UnsupportedOperationException("remove is not supported");
    }
}
