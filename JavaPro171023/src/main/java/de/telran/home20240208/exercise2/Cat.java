package de.telran.home20240208.exercise2;

public class Cat {
    private String catName;
    private String catColor;
    private int age;

    public Cat(String catName) {
        this.catName = catName;
    }

    public Cat(String catName, String catColor, int age) {
        this.catName = catName;
        this.catColor = catColor;
        this.age = age;
    }

    public String getCatName() {
        return catName;
    }

    public String getCatColor() {
        return catColor;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                ", catColor='" + catColor + '\'' +
                ", age=" + age +
                '}';
    }
}
