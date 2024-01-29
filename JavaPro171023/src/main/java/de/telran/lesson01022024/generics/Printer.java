package de.telran.lesson01022024.generics;

public class Printer {
    public <T> void print(T[] items) {
        for (T item : items){
            System.out.println(item);
        }
    }
//public void print(int[] items){//it's work
public void print(){
    System.out.println("I am class -> " + this.getClass().getName());
}
}
