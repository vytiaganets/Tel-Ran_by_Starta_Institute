//// Задача 15: Фильтрация и сортировка пользователей по возрасту.
// class User {
//     private String name;
//     private int age;
//
// public User(String name, int age) {
//     this.name = name;
//     this.age = age;
// }
//
// public String getName() {
//     return name;
// }
//
// public int getAge() {
//     return age;
// }
//
//}
package de.telran.lesson20240313practice;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("user1", 21),
                new User ("user2", 11),
                new User ("user3", 31),
                new User ("user4", 41),
                new User ("user5", 51)
                );

        List<User> filteredAndSorted = users.stream().filter(user -> user.age >= 18)
                .sorted(
                        (o1, o2) -> o1.age - o2.age
//                        Comparator.comparingInt(value -> value.age)
                ).toList();
        System.out.println(filteredAndSorted);

        Random random = new Random();
        IntStream.range(0, 10).map(i -> random.nextInt()).forEach(System.out::println);
        //[User{name='user1', age=21}, User{name='user3', age=31}, User{name='user4', age=41}, User{name='user5', age=51}]
        //459094512
        //956255282
        //1799758107
        //1316767033
        //-338518702
        //-1000026807
        //1041170079
        //-750059076
        //-1062241401
        //-900297977
    }
}
