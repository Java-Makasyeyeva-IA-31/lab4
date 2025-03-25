package org.example.fourth;

import java.util.List;

public class FourthMain {

    public static void main(String[] args) {
        printResults(List.of(1, 2, 3, 4, 5));
        printResults(List.of(1, 1, 1, 1, 1, 1));
        printResults(List.of("First", "Second", "Third", "Fourth"));
        printResults(List.of("First", "First", "First"));
    }

    private static void printResults(List<?> collection) {
        Wildcard wildcard = new Wildcard(collection);
        System.out.print("Collection: ");
        wildcard.print();

        System.out.println("Start size: " + wildcard.getSize());

        System.out.println("Are all elements equal: " + wildcard.areAllEqual());

        wildcard.clear();
        System.out.println("Size after clear: " + wildcard.getSize());
        System.out.println();
    }
}
