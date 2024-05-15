package de.telran.lesson20240515practice;

public class School {
    @StudentInfo(name = "Tom", surname = "Smith", age = 15)
    private Student student1;

    @StudentInfo(name = "Mary", surname = "Jennings", age = 17)
    private Student student2;

    public static void main(String[] args) {
        School school = new School();
        Injector.inject(school);

        System.out.println(school.student1);
        System.out.println(school.student2);

        //Student {name = 'Tom', age = 15, surname = 'Smith'}
        //Student {name = 'Mary', age = 17, surname = 'Jennings'}
    }
}
