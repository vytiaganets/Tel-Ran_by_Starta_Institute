package de.telran.home20240118;

public class SimpleAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom",1, 21.21, "run", true);
        Bird eagle = new Bird("Bob",1, "red", 200.2f, 1);
        Dog dog = new Dog("Ted", 2,25, "sos", true);
        Beasts lev = new Beasts("Leo", 22, "gold", 50.5f, 1);
        eagle.eat();
        eagle.getName();
        eagle.getColor();
        System.out.println("*****");
        lev.scream();
        lev.getAge();
        lev.getWeight();
    }
}
