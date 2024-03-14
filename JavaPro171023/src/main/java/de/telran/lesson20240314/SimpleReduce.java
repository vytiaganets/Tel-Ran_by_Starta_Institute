package de.telran.lesson20240314;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SimpleReduce {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 9, -3, 6, 4);
        //reduce #1
        System.out.println(
                list.stream()
                        .reduce((a, b) -> a + b)
                        .orElse(0));

        List<String> listStr = List.of("Слоны", "ушли", "на", "север");
        System.out.println(
                Stream.of("Слоны", "ушли", "на", "север")
                        .reduce((a, b) -> a + " " + b)
                        .get()
        );
        //перегруженный 2 метод
        //overloaded 2 method
        Integer identity = 0;
        for (Integer el : list) {
            identity += el;
        }
        System.out.println("identity: " + identity);//identity: 19

        identity = 0;
        System.out.println(list.stream().reduce(identity, (a, b) -> a + b));//19
        ;
        System.out.println(listStr.stream().reduce("=> ", (a, b) -> a + " " + b));//=>  Слоны ушли на север

        //3-rd method

        List<Person> personList = Arrays.asList(
                new Person("Bob", 34),
                new Person("Nos", 24),
                new Person("Mob", 14)
        );
        identity = 0;
        System.out.println(
                personList.stream()
                        .reduce(identity,
                                (x, y) -> {
                                    System.out.println("--Be function = " + x + " + " + y.getAge());
                                    if (y.getAge() < 50) {
                                        return x + y.getAge();
                                    } else {
                                        return x + 0;
                                    }
                                    },
                                    (x, y) -> {
                                        System.out.println("== B0 = " + x + " + " + y);
                                        return x + y;
                                    }
                        )
        );
    }
}
