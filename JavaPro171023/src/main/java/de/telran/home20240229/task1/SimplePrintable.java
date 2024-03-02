//Написать функциональный интерфейс Printable, который содержит один метод void print(String text).
//Используя этот интерфейс, напишите lambda выражения для печати переданного текста большими буквами, и маленькими буквами.
//Возможно ли данный интерфейс заменить одним из стандартных функциональных интерфейсов?
//Если да, приведите пример.
//English
//Write a functional Printable interface that contains one method void print(String text).
//Using this interface, write lambda expressions to print the passed text in capital letters,
//and in small letters.
//Is it possible to replace this interface with one of the standard functional interfaces?
//If yes, give an example.
package de.telran.home20240229.task1;

import java.util.function.Consumer;

public class SimplePrintable {
    public static void main(String[] args) {
        String textT = "Hello";
        Printable printable = (text -> {
            System.out.println(text.toLowerCase());
            System.out.println(text.toUpperCase());
            System.out.println(text + "!!!");
        });
        printable.print(textT);
        //Is it possible to replace this interface with one of the standard functional interfaces?
        //If yes, give an example.
        Consumer<String> printSomething = (System.out::println);
        printSomething.accept("Hello-Hello");
        //Hello
        //Hello!!!
        //Hello-Hello
    }
}