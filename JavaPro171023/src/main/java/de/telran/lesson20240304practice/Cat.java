package de.telran.lesson20240304practice;

public class Cat {
    private String name;
    private int age;
    private double weight;
    private String sort;

    public Cat() {
    }

    public Cat(String name, int age, double weight, String sort) {
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", sort='" + sort + '\'' +
                '}';
    }
}
