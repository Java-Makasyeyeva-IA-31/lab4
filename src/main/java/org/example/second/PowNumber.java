package org.example.second;

public class PowNumber extends Number {

    private final long value;

    public PowNumber(int value) {
        this.value = (long) value * value;
    }

    @Override
    public int intValue() {
        return (int) value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}
