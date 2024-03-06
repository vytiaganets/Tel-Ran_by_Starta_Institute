package de.telran.lesson20240305;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SimpleIntermediate {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("10", "50", "30", "60", "70", "80");
        System.out.println(list);
        //filter & count

        long c = list.stream()
                .filter(p -> p.equals("10"))
                .count();
        System.out.println("count = " + c);

        //sorted
        List<String> stringList = list.stream()
                .sorted()
                .toList();
        System.out.println(stringList);

        stringList = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(stringList);

        //skip
        stringList = list.stream()
                .sorted()
                .skip(2)
                .toList();
        System.out.println(stringList);
        //от 3 по 5 включительно
        stringList = list.stream()
                .sorted()
                .skip(3)
                .limit(3)
                .toList();
        System.out.println(stringList);

        //distinct
        Set<String> setResult = list.stream()
                .distinct()
                .collect(Collectors.toSet());
        System.out.println(setResult);

        //peek
        stringList = list.stream()
                .peek(el -> System.out.println("Element  = " + el))
                .toList();
        System.out.println(stringList);

        list.stream().
                mapToInt(x -> Integer.parseInt(x))
                .forEach(el -> {
                    int sum = el + 10;
                    System.out.println(sum);
                });
    }
}

