package org.example.second;

public class Locality {

    private int population;

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public <T extends Number> void setGenericPopulation(T genericPopulation) {
        this.population = genericPopulation.intValue();
    }
}
