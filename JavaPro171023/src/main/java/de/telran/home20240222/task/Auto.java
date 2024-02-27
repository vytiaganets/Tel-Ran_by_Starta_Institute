package de.telran.home20240222.task;

public class Auto {
    private int autoNumber;

    private int numberOfCars;

    public Auto(int autoNumber, int numberOfCars) {
        this.autoNumber = autoNumber;
        this.numberOfCars = numberOfCars;
    }

    public int getAutoNumber() {
        return autoNumber;
    }

    public void setAutoNumber(int autoNumber) {
        this.autoNumber = autoNumber;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setnumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    @Override
    public String toString() {
        return "\n Auto{ " +
                "number=" + autoNumber +
                ", number of cars=" + numberOfCars +
                '}';
    }
}
