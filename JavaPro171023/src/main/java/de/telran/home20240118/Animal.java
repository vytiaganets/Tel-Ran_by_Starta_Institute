//2*. Создать классы и схему наследования для задачи учета животных в зоопарке:
//
//
//Как минимум должен быть общий класс Animal с характеристиками и поведением, характерными для всех животных.
//А дальше уже Ваше творчество, в котором вы должны разбить животных на группы и подгруппы.
//
//
package de.telran.home20240118;

public class Animal {
    private String name;
    private int age;
    private String color;
    private float weight;

    public Animal(String name, int age, String color, float weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
