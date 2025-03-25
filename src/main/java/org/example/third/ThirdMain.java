package org.example.third;

import org.example.third.generic.GenericCrossroad;
import org.example.third.simple.SimpleCrossroad;

public class ThirdMain {

    public static void main(String[] args) {
        SimpleCrossroad simpleCrossroad = new SimpleCrossroad(
                new StreetImpl("Simple first"), new StreetImpl("Simple second"));

        System.out.println("Simple crossroad street names: " + simpleCrossroad.getNames());

        GenericCrossroad<Street, Object> genericCrossroad = new GenericCrossroad<>(
                () -> "Generic first", simpleCrossroad);

        System.out.println("\nGeneric crossroad street names: " + genericCrossroad.getNames());
    }
}
