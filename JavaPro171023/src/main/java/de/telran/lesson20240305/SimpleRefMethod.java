package de.telran.lesson20240305;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class SimpleRefMethod {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 2, 7, 6, 5);
        for (int el : list) {
            System.out.println(el);
        }
        System.out.println();

        list.forEach((el) -> System.out.println(el));

        System.out.println();

        System.out.println(parse("256") + 3);
        //R apply(T t);
        //1 через lambda  выражения
        Function<String, Integer> op = (str) -> Integer.parseInt(str);
        System.out.println(op.apply("256") + 3);
        // 2  Ссылка на метод
        op = SimpleRefMethod::parse;
        System.out.println(op.apply("256") + 3);//259

        //op = SimpleRefMethod::print; //error

        //3 Анонимный класс
        op = new Function<String, Integer>() {
            @Override
            public Integer apply(String str) {
                return Integer.parseInt(str);
            }
        };
        System.out.println(op.apply("256") + 3);

        // 4 через класс

        op = new Oper();
        System.out.println("Через класс ->" + op.apply("256") + 3);
        System.out.println();

        BiFunction<String, String, Integer> opBi = (s1, s2) -> Integer.parseInt(s1) + Integer.parseInt(s2);
        System.out.println(opBi.apply("33", "22"));

        opBi = SimpleRefMethod::parse;
        //opBi = SimpleRefMethod::concat;// error
        BiFunction<String, String, String> opBi2 = SimpleRefMethod::concat;
        System.out.println(opBi2.apply("33", "22"));
    }

    private static Integer parse(String str) {
        return Integer.parseInt(str);
    }

    private static Integer parse(String str1, String str2) {
        return Integer.parseInt(str1) + Integer.parseInt(str2);
    }

    private static void print(String str) {
        System.out.println(str);
    }

    private static String concat(String str1, String str2) {
        return str1 + str2;
    }

}
