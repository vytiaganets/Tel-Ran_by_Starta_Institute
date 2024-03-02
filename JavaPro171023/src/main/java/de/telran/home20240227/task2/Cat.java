package de.telran.home20240227.task2;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String sort;

    public Cat() {
    }

    public Cat(String name, int age, int weight, String sort) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.sort = sort;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
