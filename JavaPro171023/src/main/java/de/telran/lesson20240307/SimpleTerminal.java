package de.telran.lesson20240307;

import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class SimpleTerminal {
    public static void main(String[] args) {

        System.out.println("Terminal methods");
        List<String> givenList = Arrays.asList("a", "bb", "ccc");
        System.out.println("==========task1==========");
        System.out.println("== findFirst");
        //== findFirst
        Optional<String> str = givenList.stream()
                .filter(x -> !x.contains("c"))
                .findFirst();
        System.out.println(str.get());
        // == anyMatch
        System.out.println("==========task2==========");
        System.out.println("== anyMatch");
        boolean is = givenList.stream()
                .anyMatch(x -> x.startsWith("b"));
        System.out.println("anyMatch" + is);
        // == allMatch
        System.out.println("==========task3==========");
        System.out.println("== allMatch");
        is = givenList.stream()
                .allMatch(x -> x.startsWith("b"));
        System.out.println(is);

        // == min / max
        System.out.println("==========task2==========");
        System.out.println("== min / max");
        System.out.println("== min / max");
        System.out.println(givenList.stream()
                .min(String::compareTo));
        System.out.println(givenList.stream()
                .map(x -> x.length())
                .max(Comparator.naturalOrder()));
        System.out.println(givenList.stream()
                .max(Comparator.comparingInt(x -> x.length())));

        // == toArray
        System.out.println("==========task3==========");
        System.out.println("== toArray");

        String[] arrStr1 = givenList.stream()
                .map(String::toUpperCase)
                .toArray(String[]::new);
        System.out.println(Arrays.toString(arrStr1));

//        arrStr1 = givenList.stream()
//                .map(String::toUpperCase)
//                .toArray();//Object[] error
//        System.out .println(Arrays.toString(arrStr1));

        //=====collect=====
        // ---toList
        System.out.println("==========task4==========");
        System.out.println("---toList");
        List<String> result = givenList.stream()
                .collect(toList());
        result.add("sss");
        System.out.println(result);
        result = givenList.stream()
                .collect(toUnmodifiableList());//нельзя изменятьchange
        result = givenList.stream()
                .toList();//change  - analog
        //result.add("sss"); //UnsupportedOperationException
        System.out.println(result);

        // ---toSet

        System.out.println("==========task5==========");
        System.out.println("---toSet");
        List<String> listWithDuplicates = Arrays.asList("a", "bb", "c",
                "d", "bb");
        Set<String> resultSet = new HashSet<>(listWithDuplicates);
        Set<String> resultSet1 = listWithDuplicates.stream().distinct()
                .collect(toSet());
        System.out.println(resultSet);
        System.out.println(resultSet1);
        resultSet1 = givenList.stream()
                .collect(toUnmodifiableSet());
        //resultSet.add("dd*); //UnsupportedOperationException

        // --- toCollection
        System.out.println("==========task5==========");
        System.out.println("--- toCollection");
        result = givenList.stream()
                .collect(toCollection(LinkedList::new));
        System.out.println(result);

        // --- toMap
        System.out.println("==========task5==========");
        System.out.println("--- toMap");
        Map<String, Integer> resultMap = givenList.stream()
                .collect(toMap(Function.identity(), String::length));
        System.out.println(resultMap);//{bb=2, a=1, ccc=3}

        Map<String, String> resultMapStr = givenList.stream()
                .collect(toMap(Function.identity(), String::toUpperCase));
        System.out.println(resultMapStr);//{bb=BB, a=A, ccc=CCC}

        List<String> givenListNoDublicate = Arrays.asList("a", "bb", "ccc");
        Map<Integer, String> resultMapInt = givenListNoDublicate.stream()
                .collect(toMap(String::length, Function.identity()));
        System.out.println(resultMapInt);//{1=a, 2=bb, 3=ccc}

        // IllegalStateException //Duplicate key bb дубликаты ключа, поэтому не работает
        resultMap = listWithDuplicates.stream()
                .distinct()//убираем дубликаты
                .collect(toMap(Function.identity(), String::length));

        ////Задание 1: Фильтрация списка целых чисел на нечетные числа
        ////Задание 2: Преобразование списка строк в список чисел
        ////Задание 3: Суммирование списка чисел
        ////Задание 4: Определение максимального значения в списке
        ////Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний ре
        ////Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов
        ////Задание 7:Преобразование списка обьектов класса в список их имен, отсортированных по возрасту
        ////Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел
        ////Задание 9: Получение списка слов, содержащих только уникальные символы, из списка строк
    }
}