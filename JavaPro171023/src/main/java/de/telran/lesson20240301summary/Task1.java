//// Дан массив чисел. Нужно отфильтровать их и вернуть список без дубликатов. Кроме того, вернуть ещё один список
//        // где будут содержаться эти дубликаты.
//        List<Integer> input = List.of(1, 3, 4, 3, 6, 1);
//        List<Integer> output1 = List.of(1, 3, 4, 6);
//        List<Integer> output2 = List.of(3, 1);
package de.telran.lesson20240301summary;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> input = List.of(1,2,3,6,1,1);

        System.out.println(input);
        System.out.println(getLists(List.of("Hello", "World", "Java", "System", "World")));
        System.out.println(getLists(List.of(new Person("Alex"),
                new Person("Eva"),
                new Person("Ivan"),
                new Person("Mark"),
                new Person("Mark"))));
        //[1, 2, 3, 6, 1, 1]
        //TwoLists{uniqueElement=[Hello, World, Java, System], duplicates=[World]}
        //TwoLists{uniqueElement=[Person{name='Alex'}, Person{name='Eva'}, Person{name='Ivan'}, Person{name='Mark'}], duplicates=[Person{name='Mark'}]}

    }
    public static <T> TwoLists<T> getLists(List<T> list){
        Set<T> uniqueElements = new HashSet<>();
        List<T> output1 = new ArrayList<>();
        List<T> output2 = new ArrayList<>();

        for(T value : list){
            if(!uniqueElements.contains(value)){
                uniqueElements.add(value);
                output1.add(value);
            }else {
                output2.add(value);
            }
        }
        return new TwoLists<>(output1, output2);
    }
}
class TwoLists<T>{
    private List<T> uniqueElement;
    private List<T> duplicates;

    public TwoLists(List<T> uniqueElement, List<T> duplicates) {
        this.uniqueElement = uniqueElement;
        this.duplicates = duplicates;
    }

    @Override
    public String toString() {
        return "TwoLists{" +
                "uniqueElement=" + uniqueElement +
                ", duplicates=" + duplicates +
                '}';
    }
}
class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Person person = (Person) o;

        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}