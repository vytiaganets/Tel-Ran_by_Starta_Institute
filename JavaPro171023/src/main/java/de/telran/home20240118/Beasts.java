package de.telran.home20240118;

public class Beasts extends Animal {
    private int height;

    public Beasts(String name, int age, String color, float weight, int height) {
        super(name, age, color, weight);
        this.height = height;
    }

    public void scream() {
        if (height < 100) {
            System.out.println(getName() + " scream quietly");
        } else {
            System.out.println(getName() + " scream loudly");
        }
    }
}

