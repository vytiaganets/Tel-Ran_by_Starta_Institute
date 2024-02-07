package de.telran.lesson20240118;

public class Unicorn extends Horse {
    int countHorn;
    public Unicorn(){

    }
    public Unicorn(String name, int weight, String color, int countHorn) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.countHorn = countHorn;
    }

    public void butt(){
        System.out.println(name + " при защите бодается " + countHorn + " рогов");
    }
}
