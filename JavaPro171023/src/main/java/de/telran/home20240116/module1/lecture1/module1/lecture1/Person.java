//1 уровень сложности: 1.Класс module1.lecture1.module1.lecture1.Teachers
//Создать класс module1.lecture1.module1.lecture1.Teachers, который содержит:
//переменные fullName, age;
//методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  module1.lecture1.module1.lecture1.Teachers говорит".
//Добавьте два конструктора  - module1.lecture1.module1.lecture1.Teachers() и module1.lecture1.module1.lecture1.Teachers(fullName, age).
//Создайте два объекта этого класса. Один объект инициализируется конструктором module1.lecture1.module1.lecture1.Teachers(), другой - module1.lecture1.module1.lecture1.Teachers(fullName, age)
package de.telran.home20240116.module1.lecture1.module1.lecture1;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        this.fullName = "Name";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println("Такой-то " + fullName + " говорит.");
    }

    public void talk() {
        System.out.println("Такой-то " + fullName + " говорит.");

    }
}
