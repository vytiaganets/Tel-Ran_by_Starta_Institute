//1. Создать Supplier, который генерирует случайные значения типа Integer
//2. Создать BiFunction, которая возводит первый аргумент типа int в степень второго аргумента типа int
//4. Посчитать количество неповторяющихся слов в списке
//5. Посчитать количество людей с именем "Том" в списке имен
//6. Из списка имен вывести первое по алфавиту
//7. Посчитать количество чисел от 1 до 1000, которые делятся на 7.
//8. Посчитать сумму квадратов чисел от 1 до 10
//9. Дан список слов "Specific" "Measurable" "Achievable" "Relevant" "Time-bound"
//С помощью стримов вывести его аббревиатуру в виде S.M.A.R.T
//1. Create a Supplier that generates random Integer values
//2. Create a BiFunction that raises the first argument of type int to the power of the second argument of type int
package de.telran.lesson20240306practice;

import de.telran.lesson20240304practice.Task3;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class SimpleStream {
    public static void main(String[] args) {
//        DoSomething doSomething = new DoSomething(){
//            @Override
//            public void doSomething(){
//                System.out.println("do Something");
//            }
//        };
//        doSomething.doSomething();
//        doSomething=()-> System.out.println("doSomething in lambda");
//        doSomething.doSomething();

        //(void) --> Data Supplier
        //(data) --> (void) Consumer
        //(data) --> (data) Function, UnaryOperator, Predicate
        //(data1, data2) --> (data3) BiFunction, BiOperator

        //1. Создать Supplier, который генерирует случайные значения типа Integer
        System.out.println("=================Task1=================");
        System.out.println(ageSupplier);
        //1 variant better
        Random random = new Random();
        Supplier<Integer> generation = random::nextInt;
        System.out.println(generation.get());
        //2-nd variant
        generation = () -> new Random().nextInt();
        System.out.println(generation.get());

        //2. Создать BiFunction, которая возводит первый аргумент типа int в степень второго аргумента типа int
        System.out.println("=================Task3=================");
        BiFunction<Integer, Integer, Integer> p = (o1, o2) -> Task3.power(o1, o2);
        BinaryOperator<Integer> power = Task3::power;//Math.power
        System.out.println(power.apply(2, 10));

//        List<String> list = Arrays.asList("A", "B", "C");
//        list.stream().

        //4. Посчитать количество неповторяющихся слов в списке
        System.out.println("=================Task4=================");
        List<String> list2 = List.of("One", "One", "Three", "Four", "Five", "Four", "Seven");
        System.out.println(list2.stream().distinct().count());
        //5. Посчитать количество людей с именем "Том" в списке имен
        System.out.println("=================Task5=================");
        System.out.println(list2.stream().filter(s -> s.equals("Tom")).count());//0
        //6. Из списка имен вывести первое по алфавиту
        System.out.println("=================Task6=================");
        String name = list2.stream().min(String::compareTo).get();
        Optional<String> data = list2.stream().sorted().findFirst();
        String result = data.orElse("Some other string");
        System.out.println(result);//Five
        //7. Посчитать количество чисел от 1 до 1000, которые делятся на 7.
        System.out.println("=================Task7=================");
        long count = IntStream.rangeClosed(1, 1000).filter(value -> value % 7 == 0).count();
        long count1 = IntStream.rangeClosed(1, 1000).filter(value -> value % 7 == 0).sum();
        long count3 = IntStream.rangeClosed(1, 10).boxed().filter(value -> value % 7 == 0).reduce((i, j) -> i + j).get();
        System.out.println(count);//142
        System.out.println(count1);//71071
        System.out.println(count3);//7
        //8. Посчитать сумму квадратов чисел от 1 до 10
        System.out.println("=================Task8=================");
        int sumSquare = IntStream.rangeClosed(1, 10).map(n -> n = n * n).sum();
        //2-nd variant
        int sumSquare2 = IntStream.rangeClosed(1, 10).reduce(0, (i, j) -> i + j * j);
        System.out.println(sumSquare);//385
        System.out.println(sumSquare2);//385
        //9. Дан список слов "Specific" "Measurable" "Achievable" "Relevant" "Time-bound"
        //С помощью стримов вывести его аббревиатуру в виде S.M.A.R.T
        System.out.println("=================Task9=================");
        List<String> words = Arrays.asList("Specific", "Measurable", "Achievable", "Relevant", "Time-bound");
        System.out.println(words.stream().map(word -> word.charAt(0) + ".").collect(Collectors.joining()));
        //2-nd variant
        List<String> specific = List.of("Specific", "Measurable", "Achievable", "Relevant", "Time-bound");
        String string1 = specific.stream().map(s -> s.charAt(0) + ".").reduce(String::concat).get();
        System.out.println(string1);
        String string = specific.stream().map(s -> s.substring(0, 1)).reduce((c1, c2) -> c1 + "." + c2).get();
        System.out.println(string + ".");
    }

    static Supplier<Integer> ageSupplier = () -> (int) (Math.random() * 100);

    @FunctionalInterface
    public interface BiFunction<T, U, R> {
        R apply(T t, U u);
    }
}
