package de.telran.home20240118;

public class Bird extends Animal {
    private int length;

    public Bird(String name, int age, String color, float weight, int length) {
        super(name, age, color, weight);
        this.length = length;
    }
    public void scream() {
        if (length < 10) {
            System.out.println(getName() + " sings quietly");
        } else {
            System.out.println(getName() + " sings loudly");
        }
    }
}
