package de.telran.home20240123.home;

public class Walls {
    private static String wallsShape;
    private static int numbersOfWalls;

    public Walls(String wallsShape, int numbersOfWalls) {
        this.wallsShape = wallsShape;
        this.numbersOfWalls = numbersOfWalls;
    }

    public static String getWallsShape() {
        return wallsShape;
    }

    public void setWallsShape(String wallsShape) {
        this.wallsShape = wallsShape;
    }

    public static int getNumbersOfWalls() {
        return numbersOfWalls;
    }

    public void setNumbersOfWalls(int numbersOfWalls) {
        this.numbersOfWalls = numbersOfWalls;
    }

    @Override
    public String toString() {
        return "Walls{" +
                "wallsShape='" + wallsShape + '\'' +
                ", numbersOfWalls=" + numbersOfWalls +
                '}';
    }
}
