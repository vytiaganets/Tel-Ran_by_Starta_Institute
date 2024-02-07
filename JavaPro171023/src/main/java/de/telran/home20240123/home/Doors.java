package de.telran.home20240123.home;

public class Doors {
    private static String doorsShape;
    private static int numbersOfDoors;

    public Doors(String doorsShape, int numbersOfDoors) {
        this.doorsShape = doorsShape;
        this.numbersOfDoors = numbersOfDoors;
    }

    public static String getDoorsShape() {
        return doorsShape;
    }

    public void setDoorsShape(String doorsShape) {
        this.doorsShape = doorsShape;
    }

    public static int getNumbersOfDoors() {
        return numbersOfDoors;
    }

    public void setNumbersOfDoors(int numbersOfDoors) {
        this.numbersOfDoors = numbersOfDoors;
    }

    @Override
    public String toString() {
        return "Doors{" +
                "doorsShape='" + doorsShape + '\'' +
                ", numbersOfDoors=" + numbersOfDoors +
                '}';
    }

}
