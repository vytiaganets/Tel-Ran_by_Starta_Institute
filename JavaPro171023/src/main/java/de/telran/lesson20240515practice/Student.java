package de.telran.lesson20240515practice;
/* Имеется класс Student с полями name, surname, age.
Создать аннотацию @StudentInfo и соответствующий инжектор через рефлексию,
чтобы с их помощью иметь возможность инициализировать переменные типа Student. Например:
public class School {
    @StudentInfo(name = "Tom", surname = "Smith", age = 15)
    private Student student1;

    @StudentInfo(name = "Mary", surname = "Jennings", age = 17)
    private Student student2;
}
Инициализация полей должна производиться в момент вызова инжектора:
School school = new School();
Injector.inject(school); */

public class Student {
    private String name;
    private String surname;
    private int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", surname = '" + surname + '\'' +
                '}';
    }
}
