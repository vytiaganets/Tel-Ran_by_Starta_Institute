//Описание задания.
// 1 уровень сложности: 1. У нас в доме живут домашние животные. Попробуйте в этой задаче создать класс Pet
//и записать ему в наследники Cat и Dog. Определите, какие характеристики и поведение ваших питомцев
//общие, а какие проявляются только у конкретного типа.
package de.telran.home20240118;

public class Pet {
    private String name;
    private int age;
    private double weight;
    private String breed;

    public Pet(String name, int age, double weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }
}
