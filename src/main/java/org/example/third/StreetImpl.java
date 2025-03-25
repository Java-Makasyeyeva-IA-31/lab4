package org.example.third;

public class StreetImpl implements Street {

    private final String name;

    public StreetImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
