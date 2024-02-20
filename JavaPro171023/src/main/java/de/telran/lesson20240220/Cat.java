package de.telran.lesson20240220;

import java.util.Objects;

public class Cat implements Comparable<Cat>{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
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
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Cat cat = (Cat) o;

        if (age != cat.age)
            return false;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
    public int compareTo(Cat o) {
        if(this.age == o.age) //сравнение 1-го уровня
            return this.name.compareTo(o.name); // сравнение 2-го уровня
        if(this.age < o.age) return -1;
        else return 1;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
