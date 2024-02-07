package de.telran.lesson20240205practice;

import de.telran.lesson20240131practice.school.Student;

public class Generics {
    public static void main(String[] args) {
        Object[] objects = new Object[5];

        objects[0] = 1;
        objects[1] = 2.2;
        objects[2] = "String value";
        //objects[3] = new Student("Ivan");

        Double value = (Double) objects[1];
        System.out.println(value);
    }
}
