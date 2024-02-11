package de.telran.home20240125.swim;

public class Human implements Swim {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public void swim(){
        System.out.println("Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}');
    }
}
