package adapterPattern;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class IteratorEnumeration implements Enumeration<Object> {
    private Iterator<?> iterator;

    public IteratorEnumeration(Iterator<?> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }

}
