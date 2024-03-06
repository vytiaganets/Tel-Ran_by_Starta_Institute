package de.telran.lesson20240305;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 3, 8, 9, 4, 3, 1);
        list.stream()
                .filter(i -> i % 2 != 0)
                .limit(3)
                .forEach(System.out::println);
        //1
        //5
        //3
        System.out.println(list.stream().count());//8
        System.out.println();
        Stream<Integer> streamInt = Stream.of(1, 5, 3, 8, 9, 4, 3, 1);
        streamInt.filter(i -> i % 2 != 0)
                .limit(3)
                .forEach(System.out::println);
        //streamInt.count();//error стрим не может использоваться повторно
        Stream<Integer> str1 = list.stream()
                .filter(i->i%2!=0);
        Stream<Integer> str2 = str1.limit(3);
        List<Integer> outList = str2.collect(Collectors.toList());
        System.out.println(outList);

        //str1.count();  //error  stream is finished
        str1 = list.stream();
        System.out.println(str1.count());//8
    }
}
