package de.telran.lesson20240315summary;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SimpleStudent {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Ivan", 2),
                new Student("Peter", 3),
                new Student("Andrey", 1),
                new Student("Sergey", 2),
                new Student("Anatoliy", 3),
                new Student("Anatoliy", 4));
        Map<Integer, List<Student>> result = students.stream()
                .filter(student -> student.getCourse() % 2 == 0)
                .collect(Collectors.groupingBy(Student::getCourse));
        System.out.println(result);
    }
}
