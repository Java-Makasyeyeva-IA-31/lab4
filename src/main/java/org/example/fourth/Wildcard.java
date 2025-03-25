package org.example.fourth;

import java.util.ArrayList;
import java.util.List;

public class Wildcard {

    private final List<?> collection;

    public Wildcard(List<?> collection) {
        this.collection = new ArrayList<>(collection);
    }

    public void print() {
        System.out.println(collection);
    }

    public boolean areAllEqual() {
        if (!collection.isEmpty()) {
            Object first = collection.get(0);

            for (Object o : collection) {
                if (!o.equals(first)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void clear() {
        collection.clear();
    }

    public int getSize() {
        return collection.size();
    }
}
