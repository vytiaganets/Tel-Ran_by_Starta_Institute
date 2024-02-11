package de.telran.home20240125.swim;

public class Fish implements Swim {
    private String name;
    private int weight;

    public Fish(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void swim() {
        System.out.println("Fish{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}');
    }
}
