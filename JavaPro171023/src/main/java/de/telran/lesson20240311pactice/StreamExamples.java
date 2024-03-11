package de.telran.lesson20240311pactice;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
//        List<String> list = IntStream
//                .rangeClosed(1, 10)
//                .mapToObj(value -> String.valueOf(value))
//                .toList();
//        System.out.println(list.get(0).getClass().getSimpleName());
//
//        IntStream.rangeClosed(1,1000).map(i->(byte) i).forEach(value -> System.out.println(value));

        System.out.println("Text 1");
        Stream<String> stringStream = Stream.of("A", "B", "C");
        System.out.println("Text 2");
        Stream<String> stringStream2 = stringStream.map(s->s+"---").peek(s-> System.out.println("Text 3"));
        System.out.println("Text 4");
        List<String> result = stringStream2.toList();//запуск терминальной операции и запуск текст4 после текст4 function started to work
        System.out.println("Text 5");
        //Text 1
        //Text 2
        //Text 4
        //Text 3
        //Text 3
        //Text 3
        //Text 5
    }
}
