package de.telran.lesson20240315summary;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        //Дан список чисел, вам нужно отфильтровать только положительные числа и в результате создать Хеш таблице, где исходное число будет помещено в ключ, а значением будет это же число умноженное на 5
        Map<Integer, Integer> result = List.of (3, 10, -54,2, -11, -5,20, 7) .stream()
                .filter(i -> i > 0)
                .collect(Collectors.toMap(p -> p, p -> p * 5));
        System.out.println(result);//O(n)

        //Output longer word
        String string = List.of("Table", "Laptop", "Blanket", "Charger", "Screen", "TV").stream()
                .max(Comparator.comparingInt(String::length)).get();
        System.out.println(string);
        Map<Integer, List<String>> collect = List.of("Table", "Laptop", "Blanket", "Charger", "Screen", "TV").stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(collect);

    }
}
