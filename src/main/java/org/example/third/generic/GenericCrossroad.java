package org.example.third.generic;

import org.example.third.Street;

public class GenericCrossroad<F extends Street, S> {

    private final F first;
    private final S second;

    public GenericCrossroad(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public String getNames() {
        return "First street name: " + first.getName() + ", second street name: " + second.toString();
    }
}
