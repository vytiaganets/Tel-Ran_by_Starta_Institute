package de.telran.lesson20240119sum;

public class Car extends Vehicle {
int doors;
String bodyType;

    public Car(String vin, String model, String color, int power, int year, int doors, String bodyType) {
        super(vin, model, color, power, year);
        this.doors = doors;
        this.bodyType = bodyType;
    }
}
