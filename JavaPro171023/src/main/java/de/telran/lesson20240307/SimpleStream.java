package de.telran.lesson20240307;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStream {
    public static void main(String[] args) {
        System.out.println("=============task1=============");
        String[][] arrStr = {{"a", "b", "c"},
                {"d", "e", "f"}, {"g", "o", "y"}};
        List<String> lists = Arrays.stream
                        (arrStr).flatMap(x -> Arrays.stream(x))
                .collect(Collectors.toList());
        System.out.println(lists);
        lists = Arrays.stream(arrStr)
                .flatMap(Arrays::stream)//duplicate
                .collect(Collectors.toList());
        System.out.println(lists);
        System.out.println("=============task2=============");
        Stream.of(1, 2, 3, 4, 5, 6)
                .flatMap(x -> {
                    if (x % 2 == 0) {
                        return Stream.of(-x, x, x * 10);
                    }
                    return Stream.empty();
                })
                .forEach(x -> System.out.print(x + ","));
        System.out.println();
        System.out.println("=============task3=============");
        // Убираем ряд
        Arrays.stream(arrStr)
                .filter(el ->
                        !Arrays.stream(el)//strings stream
                                .anyMatch(x -> x.contains("a")))
                .flatMap(x -> Arrays.stream(x))
                .forEach(x -> System.out.print(x + ","));
        System.out.println();
        System.out.println("=============task4=============");

    }
}
