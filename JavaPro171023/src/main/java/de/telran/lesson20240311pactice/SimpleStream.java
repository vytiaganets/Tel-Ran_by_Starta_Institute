package de.telran.lesson20240311pactice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SimpleStream {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bob", 21, "green", true);
        Cat cat2 = new Cat("Pot", 2, "reed", false);
        Cat cat3 = new Cat("Put", 6, "black", true);
        List<Cat> catList = Arrays.asList(cat1, cat2, cat3);
        feedWithStream(catList);
        //Cat{name='Bob', age=21, colour='green', isHungry=false}
        //Cat{name='Pot', age=2, colour='reed', isHungry=false}
        //Cat{name='Put', age=6, colour='black', isHungry=false}

        //feed(catList);
    }

    private static void feedWithStream(List<Cat> catList) {
        catList.stream()
                .filter(Cat::isHungry)
                .forEach(cat -> cat.setHungry(false));

        //catlist.stream().filter(Cat::isHungry).forEach(cat->cat.setHungry(false));
        //catlist.forEach(cat -> cat.setHungry(false));

        //catList.stream().forEach(System.out::println);
    }
//    public static void feed(List<Cat> catList) {
//        for (int i = 0; i < catList.size(); i++) {
//            if (catList.get(i).isHungry()) {
//                catList.get(i).setHungry(false);
//            }
//        }
//    }

    //task2

    public static int getSumWithStream(List<Integer> integers) {
        //return integers.stream().filter(i -> i % 2 == 1).reduce(0, Integer:: sum);
        return integers.stream().filter(i -> i % 2 == 1).mapToInt(i -> i).sum();
    }

    //task3
//    public static Map<Boolean, List<Integer>> getMapWithStream() {
////        IntStream. range (O, 100). boxed().collect (Collectors.toMap ())
////        return IntStream.range (0, 100). boxed().collect(Collectors.groupingBy(i -> (i % 3) == 0, Collectors.counting ()));
//        return IntStream.range(0, 100).boxed().collect(Collectors.partitioningBy(i ->I(i % 3) == 0)) ;

    public static Map<Boolean, List<Integer>> getMapWithStream() {
        //return IntStream.range(0, 100).boxed().collect (Collectors.groupingBy(i -> (i % 3) == 0, Collectors.mapping(i -> i, Collectors.toList())));
        return IntStream.range(0, 100).boxed().collect(Collectors.partitioningBy(i -> (i % 3) == 0));
    }
}
