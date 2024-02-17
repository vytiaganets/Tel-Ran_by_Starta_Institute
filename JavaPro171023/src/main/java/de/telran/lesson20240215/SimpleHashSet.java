package de.telran.lesson20240215;

import java.util.HashSet;
import java.util.Set;

public class SimpleHashSet {
    public static void main(String[] args) {
        Integer intVal1 = 25;
        System.out.println(intVal1.hashCode());//25
        Integer intVal2 = 41;
        System.out.println(intVal2.hashCode());//41

        String str1 = "123456";
        System.out.println(str1.hashCode());//1450575459
        String str2 = "123456";
        System.out.println(str2.hashCode());//1450575459
        //Object
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat("Tom",10));
        cats.add(new Cat("Jack",1));
        System.out.println(cats);//[Cat{name='Jack', age=1}, Cat{name='Tom', age=10}]
    }
}
class Cat{
    String name;
    int age;
    public String talk(){
        return "Meow";
    }

    public Cat(String name, int age) {
        this.name = name;
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
        return name.equals(cat.name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;

    }
}
