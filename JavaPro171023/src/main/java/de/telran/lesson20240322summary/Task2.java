package de.telran.lesson20240322summary;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Company, Employee, Salary
//BMW, Smith, 2500
//Apple, Bob, 3700
//IBM, Tom, 3100
public class Task2 {
    public static void main(String[] args) throws IOException {
        Employee  employee1  = new Employee("BMW", "Smith", 2500);
        Employee  employee2  = new Employee("Apple", "Bob", 3700);
        Employee  employee3  = new Employee("IBM", "Tom", 3100);
        List<Employee> list = List.of(employee1, employee2, employee3);

        try(BufferedWriter fileWriter = new BufferedWriter(
                new FileWriter("src/main/java/de/telran/lesson20240322summary/task2.csv"))) {
            fileWriter.write("Company, Employee, Salary");
            fileWriter.newLine();
            for (Employee employee : list) {
                fileWriter.write(employee.getCompany());
                fileWriter.write(", ");
                fileWriter.write(employee.getName());
                fileWriter.write(", ");
                fileWriter.write(String.valueOf(employee.getSalary()));
                fileWriter.newLine();
            }
        } finally {

        }
    }
}
