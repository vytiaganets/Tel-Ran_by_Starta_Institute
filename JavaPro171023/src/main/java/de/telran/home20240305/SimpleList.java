//1) Дан лист строк "BigBen", "BigBob", "Big", "Ben", "Big Bob".
//Сколько раз объект «Big» встречается в коллекции?
//2) Найти самый маленький элемент: Arrays.asList("a1", "b5", "a2", "b4")
//3) Выполнить сортировку в обратном алфавитном порядке и удалить дубликаты.
//4)1.Создать класс Employee с характеристиками:
//фамилия, имя, отчество
//должность
//отдел
//зарплата
//2.Вычислить среднюю зарплату всех сотрудников
//3.Получить список сотрудников с зп > 1000
//4. Получить список сотрудников из отдела маркетинг и увеличить зп на 15%
//5. Получить сотрудника с самой низкой зп
//6*. Получить сотрудника с самой высокой зп
//7. Получите сотрудников из всех отделов с максимальной зп
//8. Сгруппировать сотрудников по должности
//Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
//1) Given a sheet of strings "BigBen", "BigBob", "Big", "Ben", "Big Bob".
//How many times does the "Big" object appear in the collection?
//2) Find the smallest element: Arrays.asList("a1", "b5", "a2", "b4")
//3) Sort in reverse alphabetical order and remove duplicates.
//Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
//4) Create an Employee class with characteristics:
//Full Name
//job title
//department
//salary
//Calculate the average salary of all employees
//Get a list of employees with salaries > 1000
//4. Get a list of employees from the marketing department and increase your salary by 15%
//5. Get the employee with the lowest salary
//6*. Get the employee with the highest salary
//7. Get employees from all departments with the maximum salary
//8. Group employees by position
package de.telran.home20240305;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.*;

import static java.util.stream.Collectors.*;

public class SimpleList {
    public static void main(String[] args) {
        System.out.println("==========Task1==========");

        List<String> list1 = List.of("BigBen", "BigBob", "Big", "Ben", "Big Bob");
        long countWords = list1.stream()
                .filter(word -> word.contains("Big"))
                .count();
        System.out.println("The word 'Big' occurs " + countWords + " time.");
//The word 'Big' occurs 4 time.
        System.out.println("==========Task2==========");

        List<String> list2 = Arrays.asList("a1", "b5", "a2", "b4");
        String listResult1 = list2.stream()
                .sorted()
                .findFirst().get();
        System.out.println("Smallest element in an array: " + listResult1);
//Smallest element in an array: a1
        System.out.println("==========Task3==========");

        List<String> list3 = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        List<String> listResult2 = list3.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .toList();
        System.out.println("Sort in reverse alphabetical order without duplicates: " + listResult2);
        //Sort in reverse alphabetical order without duplicates: [c1, b5, b4, a2, a1]

        System.out.println("==========Task4==========");
        //1.Create an Employee class
        List<Employee> list = Arrays.asList(
                new Employee("Bob", "Red", "IT", 2397, "Manager"),
                new Employee("Bos", "Tod", "Manager", 2321, "Developer"),
                new Employee("Sos", "Nos", "Office", 1234, "Director"),
                new Employee("Was", "And", "IT", 2313, "Office manager"),
                new Employee("Lom", "Few", "Manager", 4321, "HR Director"));

        //2. Calculate the average salary of all employees.
        Double averageSalary = list.stream()
                .mapToInt(Employee::getSalary)
                .average().getAsDouble();
        System.out.println();
        System.out.println("Average employee salary: " + averageSalary + ".\n");
        //Average employee salary: 2517.2.

        //3. Get a list of employees with salaries > 1000
        List<Employee> listMax = list.stream()
                .filter(employee -> employee.getSalary() > 1000)
                .toList();
        System.out.println("Employees with salaries above 1000:" + listMax);
        //Employees with salaries above 1000:[Employee{firstName='Bob', lastName='Red', department='IT', salary=2397, jobTitle='Manager'}, Employee{firstName='Bos', lastName='Tod', department='Manager', salary=2321, jobTitle='Developer'}, Employee{firstName='Sos', lastName='Nos', department='Office', salary=1234, jobTitle='Director'}, Employee{firstName='Was', lastName='And', department='IT', salary=2313, jobTitle='Office manager'}, Employee{firstName='Lom', lastName='Few', department='Manager', salary=4321, jobTitle='HR Director'}]

        //4. Get a list of employees from the marketing department and increase your salary by 15%
        List<Employee> listManager = list.stream()
                .filter(employee -> employee.getDepartment().contains("Manager"))
                .map(employee -> new Employee(employee.getFirstName(), employee.getLastName(), employee.getDepartment(), (employee.getSalary() + (employee.getSalary() * 15 / 100)), employee.getJobTitle()))
                .toList();
        System.out.println("Employees from the marketing department have their salaries increased by 15%: " + listManager);
        //Employees from the marketing department have their salaries increased by 15%: [Employee{firstName='Bos', lastName='Tod', department='Manager', salary=2669, jobTitle='Developer'}, Employee{firstName='Lom', lastName='Few', department='Manager', salary=4969, jobTitle='HR Director'}]

        //5. Get the employee with the lowest salary
        Employee lowSalary = list.stream()
                .min(Comparator.comparing(Employee::getSalary))
                .get();
        System.out.println("Employee with the lowest salary:" + lowSalary);
        //Employee with the lowest salary:Employee{firstName='Sos', lastName='Nos', department='Office', salary=1234, jobTitle='Director'}

        //6*. Get the employee with the highest salary
        Employee highSalary = list.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .get();
        System.out.println("Employee with the highest salary:" + highSalary);
        //Employee with the highest salary:Employee{firstName='Lom', lastName='Few', department='Manager', salary=4321, jobTitle='HR Director'}

        //7. Get employees from all departments with the maximum salary
        Map<String, Optional<Employee>> employeesByDepartment = list.stream()
                .collect(groupingBy(Employee::getDepartment, maxBy(Comparator.comparingInt(Employee::getSalary))));
        System.out.println("Employees with the highest salary by department:" + employeesByDepartment);
        //Employees with the highest salary by department:{Office=Optional[Employee{firstName='Sos', lastName='Nos', department='Office', salary=1234, jobTitle='Director'}], IT=Optional[Employee{firstName='Bob', lastName='Red', department='IT', salary=2397, jobTitle='Manager'}], Manager=Optional[Employee{firstName='Lom', lastName='Few', department='Manager', salary=4321, jobTitle='HR Director'}]}

        //8. Group employees by position
        Map<String, List<Employee>> jobTitle = list.stream()
                .collect(groupingBy(employee -> employee.getJobTitle()));
        System.out.println("Employee by job title:" + jobTitle);
        //Employee by job title:{Director=[Employee{firstName='Sos', lastName='Nos', department='Office', salary=1234, jobTitle='Director'}], HR Director=[Employee{firstName='Lom', lastName='Few', department='Manager', salary=4321, jobTitle='HR Director'}], Office manager=[Employee{firstName='Was', lastName='And', department='IT', salary=2313, jobTitle='Office manager'}], Developer=[Employee{firstName='Bos', lastName='Tod', department='Manager', salary=2321, jobTitle='Developer'}], Manager=[Employee{firstName='Bob', lastName='Red', department='IT', salary=2397, jobTitle='Manager'}]}
    }
}
