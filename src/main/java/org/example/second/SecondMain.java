package org.example.second;

public class SecondMain {

    public static void main(String[] args) {
        int value = 10;

        Locality locality = new Locality();
        locality.setPopulation(value);
        System.out.println("Base population is " + locality.getPopulation());

        locality.setGenericPopulation(new PowNumber(value));
        System.out.println("Power population is " + locality.getPopulation());
    }
}
