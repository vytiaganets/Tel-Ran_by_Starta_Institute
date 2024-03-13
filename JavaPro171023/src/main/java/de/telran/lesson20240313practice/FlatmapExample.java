//1. Имеется два списка элементов.
//List<Integer> list1 = Arrays.asList(1, 2, 3);
//List<Integer> list2 = Arrays.asList(4, 5, 6);
//С помощью flatmap:
//a). Получить все возможные значения сумм чисел из обоих списков
//b). Получить все возможные комбинации пар чисел из обоих списков [1, 4] [2, 6]
//с). Найти все пары чисел, сумма которых будет равна заданному значению sum
package de.telran.lesson20240313practice;

import java.util.List;
import java.util.Arrays;
import java.util.stream.IntStream;

public class FlatmapExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "Two", "Three", "Four");
        list.stream()
                .flatMap(s -> s.chars().boxed())
                .map(Character::toString)
                .map(String::toLowerCase)
                .distinct()
                .forEach(System.out::print);
        //onetwhrfu
        System.out.println();
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        //task1
        list1.stream().flatMap(i -> list2.stream().map(j -> j + i)).distinct().forEach(System.out::println);
        //5
        //6
        //7
        //8
        //9
        //task2
        list1.stream().flatMap(i -> list2.stream().map(j -> Arrays.asList(i,j))).forEach(System.out::println);
        //[1, 4]
        //[1, 5]
        //[1, 6]
        //[2, 4]
        //[2, 5]
        //[2, 6]
        //[3, 4]
        //[3, 5]
        //[3, 6]
        //task3
        //
        System.out.println("==========task3======");
        System.out.println();
        int sum = 6;
        list1.stream().flatMap(i -> list2.stream().filter(j -> i + j == sum).map (j -> Arrays.asList(i, j))).forEach (System.out::println);
        //[1, 5]
        //[2, 4]
        //piphagorian triples
        System.out.println("============piphagorian triples========");
        IntStream.rangeClosed(1,10).boxed().flatMap(a->IntStream.rangeClosed(a,10).filter(b->Math.sqrt(a*a+b*b)%1==0)
                .mapToObj(b->new int[]{a,b,(int)Math.sqrt(a*a+b*b)})).forEach(ints->System.out.println(Arrays.toString(ints)));

    }
}
