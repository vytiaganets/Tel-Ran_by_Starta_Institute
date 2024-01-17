package de.telran.lesson_01.garage;

import de.telran.lesson_01.Car;

public class Garage {
    public static void main(String[] args) {
        Car car = new Car("VW", 3, "yellow");
        car.setCountPassenger(2);
        car.run();
    }
}
