package de.telran.lesson20240322summary;

public class Employee {
    private final String company;
    private final String name;
    private final int salary;

    public Employee(String company, String name, int salary) {
        this.company = company;
        this.name = name;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
