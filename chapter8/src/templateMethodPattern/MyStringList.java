package templateMethodPattern;

import java.util.AbstractList;

public class MyStringList extends AbstractList<String> {
    String[] stringArray;

    public MyStringList(String[] stringArray) {
        this.stringArray = stringArray;
    }

    @Override
    public String get(int index) {
        return stringArray[index]; // based on the index, return the element
    }

    @Override
    public int size() { // base on the size of the stringArray
        return stringArray.length;
    }

    @Override
    public String set(int index, String element) {
        String oldValue = stringArray[index];
        stringArray[index] = element;
        return oldValue; // return the old value
    }
}
