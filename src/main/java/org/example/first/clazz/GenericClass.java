package org.example.first.clazz;

public class GenericClass <T> {

    private final T t;

    public GenericClass(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
