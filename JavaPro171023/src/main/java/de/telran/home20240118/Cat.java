package de.telran.home20240118;

public class Cat extends Pet {
    private boolean isMewing;

    public Cat(String name, int age, double weight, String breed, boolean isMewing) {
        super(name, age, weight, breed);
        this.isMewing = isMewing;
    }
}
