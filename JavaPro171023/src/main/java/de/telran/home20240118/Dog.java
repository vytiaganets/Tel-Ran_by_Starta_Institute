package de.telran.home20240118;

public class Dog extends Pet {
    private boolean isBarking;

    public Dog(String name, int age, double weight, String breed, boolean isBarking) {
        super(name, age, weight, breed);
        this.isBarking = isBarking;
    }
}
