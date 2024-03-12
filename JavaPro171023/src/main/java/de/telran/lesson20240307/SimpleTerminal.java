package de.telran.lesson20240307;

import java.util.*;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;
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
        System.out.println(resultMap);
//--- toUnmodifiableMap
        resultMap = givenList.stream()
                .collect(toUnmodifiableMap(Function.identity(), String::length));
// resultMap.put ("foo", 3); //UnsupportedOperationException
        // - joining
        String resultString = givenList.stream().collect(joining());
        System.out.print(resultString);//{bb=2, a=1, c=1, d=1}
        resultString = givenList.stream().collect(joining(" "));
        System.out.println(resultString);//abbccca bb ccc
        resultString = givenList.stream().collect(joining("", "PRE-", "POST"));
        System.out.println(resultString);//PRE-abbcccPOST
        //toSting standart
        resultString = givenList.stream().collect(joining("", "[", "]"));
        System.out.println(resultString);//[abbccc]
        System.out.println(givenList);//[a, bb, ccc]
        //---counting
        Long resultLong = givenList.stream().collect(counting());
        System.out.println(resultLong);//3 - objects: [a, bb, ccc]

        resultLong = givenList.stream().count();//analog
        System.out.println(resultLong);//3 - objects: [a, bb, ccc]

        //- summarizingDouble
        DoubleSummaryStatistics resultStat = givenList.stream()
                .collect(summarizingDouble(String::length));
        System.out.println(resultStat);//DoubleSummaryStatistics{count=3, sum=6,000000, min=1,000000, average=2,000000, max=3,000000}
        System.out.println("Average values: " + resultStat.getAverage());//Average values: 2.0
        //--- averagingDouble
        Double resultDouble = givenList.stream ()
                .collect (averagingDouble (String::length));
        System.out.println (resultDouble);
        //---summingDouble
        resultDouble = givenList.stream()
                .collect(summingDouble (String::length));
        System.out.println (resultDouble);
        System.out.println(givenList.stream().mapToInt (String::length)
                .sum ());
// - - - maxBy()/minBy()
        Optional<String> resultOpt = givenList.stream()
                .collect(maxBy(Comparator.naturalOrder()));
        System.out.println("maxBy: "+resultOpt);//maxBy: Optional[ccc]
        resultOpt = givenList.stream()
                .collect(maxBy(String::compareTo)); // аналог
        System.out.println("maxBy = "+resultOpt);
        System.out.println(givenList.stream()
                .max (String::compareTo));//аналог
        resultOpt = givenList.stream()
                .collect(minBy(Comparator.naturalOrder()));
        System.out.println("minBy: "+resultOpt);//minBy: Optional[a]

        System.out.println(givenList.stream () // аналог
                .min(String::compareTo));
        //---groupingBy
        Map<Integer, Set<String>> resultMap1 = givenList.stream ()
                .collect (groupingBy(String::length, toSet())) ;
        System.out.println(resultMap1);
        List<String> list = List.of("bb","ccc", "dd", "aj", "uiu", "aa", "bb");
        Map<Integer, List<String>> resultMap2 = list.stream()
                .collect(groupingBy (String::length, toList()));
        System.out.println(resultMap2);

        resultMap1 = list.stream().collect(groupingBy(String::length, toSet()));
        System.out.println(resultMap1);//without duplikats and sorts

        resultMap1 = list.stream().collect(groupingBy(String::length, toCollection(TreeSet::new)));
        System.out.println(resultMap1);//without duplikats with sorts

        Map<Integer, Optional<String>> resultMapString = list.stream().collect(groupingBy(String::length, minBy(String::compareTo)));//min value
        System.out.println(resultMapString);

        resultMapString=givenList.stream().collect(groupingBy(String::length, maxBy(String::compareTo)));//max

        //Emplovee
        //.collect (groupingBy (Employee:: getDapartment, maxBy(Comparator. comparingInt (Employee: :getSalary))).
        //.collect(groupingBy(Employee::getDapartament, maxBy(Comparator.comparingInt(Employee::getSalary)))

        // --- partitioningBy
        Map<Boolean, List<String>> resultMap3 = givenList.stream()
                .collect (partitioningBy(s -> s. length() > 2));
        System.out.println(resultMap3);

        Map<Boolean, List<Integer>> mapInt = IntStream.range (0, 100).boxed()
                .collect (partitioningBy(i->(i % 3) == 0));
        System.out.println(mapInt);

        mapInt = IntStream.range(0,100).boxed().limit(10).peek(x-> System.out.println(x)).collect(groupingBy(i->(i%3)==0, mapping(i->i, toList())));
        System.out.println(mapInt);

        // --- teeing
        List<Integer> numbers = Arrays.asList (42, 4, 2, 24);
        int sum = numbers.stream().collect(teeing (
                minBy (Integer::compareTo), // The first collector
                maxBy (Integer:: compareTo), // The second collector
        (min, max) -> min.get()+max.get()// Receives the result from those collectors and combines them
));
        System.out.println(sum);//44


        String resultStr = list.stream().collect(teeing (
                minBy (String::compareTo), // The first collector
                maxBy (String:: compareTo), // The second collector
                (min, max) -> min.get()+max.get()// Receives the result from those collectors and combines them
        ));
        System.out.println(resultStr);//aauiu


        String resultStr1 = list.stream().collect(teeing (

                minBy (String::compareTo), // The first collector
                maxBy (String:: compareTo), // The second collector
                (min, max) -> min.get()+max.get()// Receives the result from those collectors and combines them
        ));
        System.out.println(resultStr1);//aauiu

//        Collection<String> resultCollection = list.stream().collect (teeing (
//                toList(), // The first collector
//                toSet(), // The second collector
//                (v1, v2) -> /*(v1.size() > v2.size()) ? v2 : v1*/ v1.addAll(v2)
//        ));
//        System.out.println(resultCollection);

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
    //3. Переписать через стримы
    public static Map<Boolean, List<Integer>> getMap(){
        Map<Boolean, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                if (map.containsKey(true)) {
                    map.get(true).add(i);
                } else {
                    map.put(true, new ArrayList<>());
                    map.get(true).add(i);
                }
            } else {
                if (map.containsKey(false)) {
                    map.get(false).add(i);
                } else {
                    map.put(false, new ArrayList<>());
                    map.get(false).add(i);
                }
            }
        }
        return map;
    }
}