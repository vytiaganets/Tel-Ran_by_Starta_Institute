package de.telran.lesson20240118;

public class Horse {
    String name;
    private int countHorseShoe;
    int weight;
    String color;
    public Horse() {
    }
    public Horse(String name, int countHorseShoe, int weight, String color) {
        this.name = name;
        this.countHorseShoe = countHorseShoe;
        this.weight = weight;
        this.color = color;
    }
    public void run() {
        System.out.println(color + " цвета лошадь по имени " + name + " бежит !");
    }
    void transpots(int weight) {
        System.out.println("лошадь по имени " + name + " везет груз " + weight + " У нее " + countHorseShoe + " подков");
    }
}
