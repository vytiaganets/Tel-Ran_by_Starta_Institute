package de.telran.home20240123.home;

public class Roof {
    private static String roofBase;
    private static int roofSize;

    public Roof(String roofBase, int roofSize) {
        this.roofBase = roofBase;
        this.roofSize = roofSize;
    }

    public static String getRoofBase() {
        return roofBase;
    }

    public void setRoofBase(String roofBase) {
        this.roofBase = roofBase;
    }

    public static int getRoofSize() {
        return roofSize;
    }

    public void setRoofSize(int roofSize) {
        this.roofSize = roofSize;
    }

    @Override
    public String toString() {
        return "Roof{" +
                "roofBase='" + roofBase + '\'' +
                ", roofSize='" + roofSize + '\'' +
                '}';
    }
}
