package de.telran.lesson20240315summary;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "The quick brown fox",
                "jumps over the lazy dog",
                "The quick brown fox jumps high"
        );
        List<String> stringList = sentences.stream()
                .flatMap(word->Arrays.stream(word.split(" ")))
                .distinct()
                .toList();
        System.out.println(stringList);


        Box<String> box = new Box<>("The quick brown fox");
        Box<Integer> resultBox = box
                .map(s -> s.length())
                .map(i -> i * 2);
        System.out.println(resultBox);//Box{element=38}

        Box<String> box2 = new Box<>("The quick brown fox jumps over the lazy dog");
        Box<String> box3 = box2.map(str -> str.toLowerCase())
                .flatMap(str -> new Box<>("Hello " + str));
        System.out.println(box3);//Box{element=Hellothe quick brown fox jumps over the lazy dog}
        Box<Box<String>> box4= box2.map(str -> str.toLowerCase()).map(str->new Box<>("Hello"+str));
        System.out.println(box4);//Box{element=Box{element=Hellothe quick brown fox jumps over the lazy dog}}


    }
}
