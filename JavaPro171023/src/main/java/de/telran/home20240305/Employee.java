package de.telran.home20240305;

public class Employee {
    private String firstName;
    private String lastName;
    private String department;
    private Integer salary;
    private String jobTitle;

    public Employee(String firstName, String lastName, String department, Integer salary, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
