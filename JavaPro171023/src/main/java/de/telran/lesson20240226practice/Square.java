//////4. На основе Rectangle создать класс c для хранения данных о квадрате.
//////Реализовать возможность добавления Square в HashSet и TreeSet.
package de.telran.lesson20240226practice;

import de.telran.lesson20240221practice.CompareByX;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Square extends de.telran.lesson20240221practice.Rectangle {
    public Square(double x) {
        super(x, x);
    }

    public static void main(String[] args) {
        Square square1 = new Square(1.0);
        Square square2 = new Square(1.0);
        Square square3 = new Square(2.0);
        Square square4 = new Square(2.0);
        Square square5 = new Square(2.0);

        Set<Square> set = new HashSet<>();
        set.add(square1);
        set.add(square2);
        set.add(square3);
        System.out.println(set.size());//2
        set = new TreeSet<>(new CompareByX());
        set.add(square1);
        set.add(square2);
        set.add(square3);
        set.add(square4);
        set.add(square5);
        System.out.println(set.size());//2
        System.out.println(set);//[de.telran.lesson20240226practice.Square@fe000000, de.telran.lesson20240226practice.Square@0]
        //HashSet ----- equals(), hashcode()
        //o.equals(o2) -----> o1.hashCode() == o2.hashCode()

        //TreeSet ----- equals() must be consistent with compareTo()
        //o1.equals(o2) -----> o1.compareTo(o2) == 0
    }
}
