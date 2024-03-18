//3. Один метод вызывает три других метода, которые выбрасывают проверяемые и непроверяемые исключения:
//public static void method1() {
//System.out.println (1 / 0);
//}
//public static void method20) {
//throw new NullPointerException("nulls everywhere!");
//}
//public static void method3() throws IOException {
//throw new IOException ("File not found");
//Отловить эти исключения и выбросить вместо них MyAppException, который содержал бы информацию о типе исходного исключения и его сообщение.
package de.telran.lesson20240318practice;

import java.io.IOException;

public class Task3{
    public static void method1() {
        System.out.println(1 / 0);
    }

    public static void method2() {
        throw new NullPointerException("nulls everywhere!");
    }

    public static void method3() throws IOException {
        throw new IOException("File not found");
    }

    public static void commonMethod() throws MyAppException{
        try {
            method1();
            method2();
            method3();
        } catch (
                Exception e) {
            throw new MyAppException(e.getMessage(), e);
        }

    }

    public static void main(String[] args) {
        try {
            commonMethod();
        } catch (
                MyAppException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());//reason exception
            e.printStackTrace();
        }
    }
}