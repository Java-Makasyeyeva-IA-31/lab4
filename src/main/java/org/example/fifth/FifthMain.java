package org.example.fifth;

import java.util.*;

public class FifthMain {

    public static void main(String[] args) {
        Collection<String> strings = List.of("Hello", "World");
        Collection<Integer> integers = Set.of(1, Integer.MAX_VALUE);

        Map<String, Character> charByString = Map.of();
        Map<? extends Number, Character> charByNumber = Map.of(1, 'a', Double.parseDouble("2"), 'b');

        Optional<Float> emptyOpt = Optional.empty();
        Optional<Double> doubleOpt = Optional.of(2.5);

        Queue<Optional<? extends Number>> queueOfNumbers = new ArrayDeque<>(List.of(emptyOpt, doubleOpt));
    }
}
