package de.telran.lesson20240116.garage;

import de.telran.lesson20240116.Car;

public class Garage {
    public static void main(String[] args) {
        Car car = new Car("VW", 3, "yellow");
        car.setCountPassenger(2);
        car.run();
    }
}
