package de.telran.lesson_02.abstraction;

public abstract class Printer {
    String name;
    String color;
    void tankstelle() {
        System.out.println(name+ " - меня нужно заправлять");
    }
   abstract void print();
//    void print(){
//        System.out.println("Принтер печатает с помощью" +);
    }
