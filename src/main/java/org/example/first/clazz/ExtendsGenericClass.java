package org.example.first.clazz;

public class ExtendsGenericClass <N extends Number> {

    private final N number;

    public ExtendsGenericClass(N number) {
        this.number = number;
    }

    public N getNumber() {
        return number;
    }
}
