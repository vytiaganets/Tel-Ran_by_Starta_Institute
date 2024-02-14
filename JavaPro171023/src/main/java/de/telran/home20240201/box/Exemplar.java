package de.telran.home20240201.box;

public class Exemplar {
    private final int weight;
    private final int lenght;
    private final int height;
    private final String name;

    public Exemplar(int weight, int lenght, int height, String name) {
        this.weight = weight;
        this.lenght = lenght;
        this.height = height;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public int getLenght() {
        return lenght;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }
}
