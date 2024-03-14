//Поток 1:
////Задание 1: Фильтрация списка целых чисел на нечетные числа
////Задание 2: Преобразование списка строк в список чисел
////Задание 3: Суммирование списка чисел
////Задание 4: Определение максимального значения в списке
////Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр
////Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов
////Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту ------
////Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел -------
////Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк
//Поток 2*:
//// Задача 1: Фильтрация четных чисел и умножение на 2.
// // Задача 2: Удаление дубликатов из списка строк.
// // Задача 3: Сортировка списка чисел в порядке убывания и выбор первых трех элементов.
// // Задача 4: Фильтрация строк, начинающихся на "A" и преобразование в верхний регистр.
// // Задача 5: Пропуск первых двух элементов и вывод оставшихся.
// // Задача 6: Фильтрация чисел больше 50 и вывод их квадратов.
// // Задача 7: Оставить только слова, содержащие букву "o" и вывести их в обратном порядке.
// // Задача 8: Фильтрация чисел, оставить только нечетные и вывести их в порядке возрастания.
// // Задача 9: Получить среднее значение чисел в списке.
// // Задача 10: Получить строку, объединяющую элементы списка через запятую.
// // Задача 11: Получить список квадратов чисел из другого списка.
// // Задача 12: Получить список букв из списка слов и вывести их в алфавитном порядке.
// // Задача 13: Получить первые 3 строки из списка и вывести их в обратном порядке.
// // Задача 14: Пропустить первые 2 элемента и оставить только уникальные.
// // Задача 15: Фильтрация и сортировка пользователей по возрасту.
// class User {
//     private String name;
//     private int age;
// public User(String name, int age) {
//     this.name = name;
//     this.age = age;
// }
// public String getName() {
//     return name;
// }
// public int getAge() {
//     return age;
// }
//}
//Thread 1:
////Task 1: Filtering a list of integers into odd numbers
////Task 2: Converting a list of strings into a list of numbers
////Task 3: Summing a list of numbers
////Task 4: Determining the maximum value in the list
////Task 5: Filtering a list of strings to those that start with a specific letter and converting them to uppercase
////Task 6: Obtaining a list of unique words from a list of strings longer than 4 characters
////Task 7: Converting a list of class objects into a list of their names, sorted by age ------
////Task 8: Finding the sum of numbers that are multiples of 3 and 5 from a list of numbers -------
////Task 9: Obtaining a list of words containing only unique characters from a list of strings
//Thread 2*:
//// Task 1: Filtering even numbers and multiplying by 2.
// // Task 2: Removing duplicates from a list of strings.
// // Task 3: Sort a list of numbers in descending order and select the first three elements.
// // Task 4: Filter strings starting with "A" and convert to uppercase.
// // Task 5: Skip the first two elements and print the remaining ones.
// // Task 6: Filtering numbers greater than 50 and displaying their squares.
// // Task 7: Leave only words containing the letter "o" and print them in reverse order.
// // Task 8: Filtering numbers, leaving only odd ones and displaying them in ascending order.
// // Task 9: Get the average of the numbers in the list.
// // Task 10: Get a string concatenating list elements separated by commas.
// // Task 11: Get a list of squares of numbers from another list.
// // Task 12: Get a list of letters from a list of words and display them in alphabetical order.
// // Task 13: Get the first 3 rows from the list and print them in reverse order.
// // Task 14: Skip the first 2 elements and leave only unique ones.
// // Task 15: Filtering and sorting users by age.
// class User {
// private String name;
// private int age;
// public User(String name, int age) {
// this.name = name;
// this.age = age;
// }
// public String getName() {
// return name;
// }
// public int getAge() {
// return age;
// }
//}
package de.telran.home20240307;

import java.util.*;

public class SimpleStream {
    public static void main(String[] args) {
//  Поток 1:
//  Задание 1: Фильтрация списка целых чисел на нечетные числа
        System.out.println("==========Task01==========");
        List<Integer> originalList = Arrays.asList(3, 32, 54, 34, 76, 23, 23, 45, 13, 54, 34, 1, 43, 35);
        List<Integer> sortedList = originalList.stream()
                .filter(num -> num % 2 != 0)
                .toList();
        System.out.println("Filtering a list of integers to odd numbers: " + sortedList);

//  Задание 2: Преобразование списка строк в список чисел
        System.out.println("==========Task02==========");
        List<String> originalList1 = Arrays.asList("10", "43", "4", "21", "45", "34", "6", "67", "98", "2", "54", "4", "23", "43");
        List<Integer> sortedList1 = originalList1.stream()
                .map(Integer::parseInt)
                .toList();
        System.out.println("Converting a list of strings to a list of numbers: " + sortedList1);

//  Задание 3: Суммирование списка чисел
        System.out.println("==========Task03==========");
        List<Integer> originalList2 = Arrays.asList(34, 23, 23, 3, 2, 32, 77, 65);
        Integer sum = originalList2.stream()
                .reduce(Integer::sum).orElse(0);

        System.out.println("Summing a list of numbers:" + sum);

//  Задание 4: Определение максимального значения в списке
        System.out.println("==========Task04==========");
        List<Integer> originalList3 = Arrays.asList(32, 23, 54, 67, 65, 26, 32, 4, 67, 34, 2, 4, 54, 56);
        Optional<Integer> maxElement = originalList3.stream()
                .max(Comparator.naturalOrder());

        System.out.println("Summing a list of numbers:" + maxElement);

//  Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр
        System.out.println("==========Task05==========");
        List<String> originalList4 = Arrays.asList("Blue", "Green", "White", "Black", "Green", "Yellow");
        List<String> finalList4 = originalList4.stream()
                .filter(word -> word.startsWith("B"))
                .map(String::toUpperCase)
                .toList();
        System.out.println("Filter a list of strings to those that start with a specific letter and convert them to uppercase:" + finalList4);

//  Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов
        System.out.println("==========Task06==========");
        List<String> originalList5 = Arrays.asList("Blue", "Green", "White", "Black", "Green", "Yellow");
        List<String> finalList5 = originalList5.stream()
                .filter(word -> word.length() > 4)
                .toList();
        System.out.println("Getting a list of unique words from a list of strings longer than 4 characters:" + finalList5);

//  Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту ------
        System.out.println("==========Task07==========");
        List<Teachers> originalList6 = Arrays.asList(
                new Teachers("Bob", 34),
                new Teachers("Vox", 24),
                new Teachers("Kox", 54),
                new Teachers("Sos", 35),
                new Teachers("Qop", 54),
                new Teachers("Zob", 78),
                new Teachers("Loc", 12));
        List<String> finalList6 = originalList6.stream()
                .sorted(Comparator.comparing(Teachers::getAgeOfTeacher))
                .map(Teachers::getNameOfTeacher)
                .toList();

        System.out.println("Convert a list of class objects into a list of their names, sorted by age:" + finalList6);

//  Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел -------
        System.out.println("==========Task08==========");
        List<Integer> originalList7 = Arrays.asList(45, 3, 54, 78, 54, 67, 5, 2, 32, 76, 32, 87, 4, 34);
        Integer sumOfElements = originalList7.stream()
                .filter(num -> num % 5 == 0 || num % 3 == 0)
                .reduce(0, Integer::sum);
        System.out.println("Finding the sum of multiples of 3 and 5 from a list of numbers:" + sumOfElements);

//  Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк
        System.out.println("==========Task09==========");
        List<String> originalList9 = Arrays.asList("Blue", "Green", "White", "Black", "Green", "Yellow", "Green");
        List<String> resultWords9 = originalList9.stream()
                .filter(word -> word.toLowerCase().chars().distinct().toArray().length == word.toLowerCase().chars().toArray().length)
                .toList();
        System.out.println("Getting a list of words containing only unique characters from a list of strings:" + resultWords9);
        //  Поток 2*:
//  Задача 1: Фильтрация четных чисел и умножение на 2.
        System.out.println("==========Task01==========");
        List<Integer> originalList11 = Arrays.asList(23, 33, 4, 23, 65, 56, 76, 76, 87, 78, 78, 4, 24, 43);
        List<Integer> finalList11 = originalList11.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .toList();
        System.out.println("Filtering even numbers and multiplying by 2:" + finalList11);

//  Задача 2: Удаление дубликатов из списка строк.
        System.out.println("==========Task02==========");
        List<String> originalList22 = Arrays.asList("Blue", "Green", "White", "Black", "Green", "Yellow", "Green");
        List<String> sortedList22 = originalList22.stream()
                .distinct()
                .toList();
        System.out.println("Removing duplicates from a list of strings:" + sortedList22);

//  Задача 3: Сортировка списка чисел в порядке убывания и выбор первых трех элементов.
        System.out.println("==========Task03==========");
        List<Integer> originalList33 = Arrays.asList(32, 12, 34, 4, 56, 4, 48, 45, 46, 12, 34, 45, 5, 54);
        List<Integer> sortedList33 = originalList33.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        System.out.println("Sort a list of numbers in descending order and select the first three elements:" + sortedList33);

//  Задача 4: Фильтрация строк, начинающихся на "B" и преобразование в верхний регистр.
        System.out.println("==========Task04==========");
        List<String> originalList44 = Arrays.asList("Blue", "Green", "White", "Black", "Green", "Yellow", "Green");
        List<String> finalList44 = originalList44.stream()
                .filter(word -> word.startsWith("B"))
                .map(String::toUpperCase)
                .toList();
        System.out.println("Filters strings starting with \"B\" and converts to uppercase." + finalList44);

//  Задача 5: Пропуск первых двух элементов и вывод оставшихся.
        System.out.println("==========Task05==========");
        List<Integer> originalList55 = Arrays.asList(23, 43, 45, 4, 56, 56, 65, 67, 7, 12, 34, 3, 67, 9);
        List<Integer> sortedList55 = originalList55.stream()
                .skip(2)
                .toList();
        System.out.println("Skip the first two elements and output the remaining ones." + sortedList55);

//  Задача 6: Фильтрация чисел больше 50 и вывод их квадратов.
        System.out.println("==========Task06==========");
        List<Integer> originalList66 = Arrays.asList(23, 34, 5, 44, 7, 84, 6, 2, 67, 6, 2, 24, 64, 23);
        List<Integer> sortedList66 = originalList66.stream()
                .filter(num -> num > 50)
                .map(num -> num * num)
                .toList();
        System.out.println("Filtering numbers greater than 50 and displaying their squares." + sortedList66);

//  Задача 7: Оставить только слова, содержащие букву "a" и вывести их в обратном порядке.
        System.out.println("==========Task07==========");
        List<String> originalList77 = Arrays.asList("Blue", "Green", "White", "Black", "Green", "Yellow", "Green");
        List<String> finalList77 = originalList77.stream()
                .filter(word -> word.contains("a") || word.contains("O"))
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Leave only words containing the letter \"a\" and print them in reverse order." + finalList77);

//  Задача 8: Фильтрация чисел, оставить только нечетные и вывести их в порядке возрастания.
        System.out.println("==========Task08==========");
        List<Integer> originalList88 = Arrays.asList(23, 34, 45, 54, 65, 7, 34, 6, 56, 7, 9, 23, 5, 34);
        List<Integer> sortedList88 = originalList88.stream()
                .filter(num -> num % 2 != 0)
                .sorted(Comparator.naturalOrder())
                .toList();
        System.out.println("Filtering numbers, leaving only odd ones and displaying them in ascending order." + sortedList88);

//  Задача 9: Получить среднее значение чисел в списке.
        System.out.println("==========Task09==========");
        List<Integer> originalList99 = Arrays.asList(32, 5, 65, 76, 8, 7, 45, 67, 98, 65, 45, 27, 8, 2);
        OptionalDouble averageValue99 = originalList99.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println("Get the average of numbers in a list." + averageValue99);

//  Задача 10: Получить строку, объединяющую элементы списка через запятую.
        System.out.println("==========Task10==========");
        List<String> originalList1010 = Arrays.asList("Blue", "Green", "White", "Black", "Green", "Yellow", "Green");
        String finalString1010 = originalList1010.stream()
                .reduce((word1, word2) -> word1 + ", " + word2).orElse("");
        System.out.println("Get a string concatenating list elements separated by commas." + finalString1010);

//  Задача 11: Получить список квадратов чисел из другого списка.
        System.out.println("==========Task11==========");
        List<Integer> originalList1111 = Arrays.asList(24, 4, 46, 2, 56, 8, 67, 34, 65, 23, 32, 2, 23, 23);
        List<Integer> powerList1111 = originalList1111.stream()
                .map(num -> (int) Math.pow(num, 2))
                .toList();
        System.out.println("Get a list of squares of numbers from another list." + powerList1111);

//  Задача 12: Получить список букв из списка слов и вывести их в алфавитном порядке.
        System.out.println("==========Task12==========");
        List<String> originalList1212 = Arrays.asList("Blue", "Green", "White", "Black", "Green", "Yellow", "Green");
        List<Integer> charList12 = originalList1212.stream()
                .flatMap(s -> s.chars().boxed())
                .sorted()
                .toList();
        System.out.println("Get a list of letters from a list of words and display them in alphabetical order." + charList12);

//  Задача 13: Получить первые 3 строки из списка и вывести их в обратном порядке.
        System.out.println("==========Task13==========");
        List<String> originalList1313 = Arrays.asList("Blue", "Green", "White", "Black", "Green", "Yellow", "Green");
        List<String> finalList1313 = originalList1313.stream()
                .limit(3)
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Get the first 3 rows from a list and print them in reverse order." + finalList1313);

//  Задача 14: Пропустить первые 2 элемента и оставить только уникальные.
        System.out.println("==========Task14==========");
        List<Integer> originalList1414 = Arrays.asList(32, 34, 6, 76, 87, 4, 3, 12, 3, 43, 74);
        List<Integer> finalList1414 = originalList1414.stream()
                .skip(2)
                .distinct()
                .toList();
        System.out.println("Skip the first 2 elements and leave only unique ones." + finalList1414);

//  Задача 15: Фильтрация и сортировка пользователей по возрасту.
        System.out.println("==========Task15==========");
        List<Cats> originalList1515 = Arrays.asList(
                new Cats("Ben", 2),
                new Cats("Bob", 3),
                new Cats("Rob", 2),
                new Cats("Fos", 4),
                new Cats("Gor", 1),
                new Cats("Bos", 5),
                new Cats("Jon", 8));

        List<Cats> finalList1515 = originalList1515.stream()
                .filter(cat -> cat.getAgeOfCat() < 4)
                .sorted(Comparator.comparing(Cats::getAgeOfCat))
                .toList();
        System.out.println("Filtering and sorting users by age." + finalList1515);
        //==========Task01==========
        //Filtering a list of integers to odd numbers: [3, 23, 23, 45, 13, 1, 43, 35]
        //==========Task02==========
        //Converting a list of strings to a list of numbers: [10, 43, 4, 21, 45, 34, 6, 67, 98, 2, 54, 4, 23, 43]
        //==========Task03==========
        //Summing a list of numbers:259
        //==========Task04==========
        //Summing a list of numbers:Optional[67]
        //==========Task05==========
        //Filter a list of strings to those that start with a specific letter and convert them to uppercase:[BLUE, BLACK]
        //==========Task06==========
        //Getting a list of unique words from a list of strings longer than 4 characters:[Green, White, Black, Green, Yellow]
        //==========Task07==========
        //Convert a list of class objects into a list of their names, sorted by age:[Loc, Vox, Bob, Sos, Kox, Qop, Zob]
        //==========Task08==========
        //Finding the sum of multiples of 3 and 5 from a list of numbers:326
        //==========Task09==========
        //Getting a list of words containing only unique characters from a list of strings:[Blue, White, Black]
        //==========Task01==========
        //Filtering even numbers and multiplying by 2:[8, 112, 152, 152, 156, 156, 8, 48]
        //==========Task02==========
        //Removing duplicates from a list of strings:[Blue, Green, White, Black, Yellow]
        //==========Task03==========
        //Sort a list of numbers in descending order and select the first three elements:[56, 54, 48]
        //==========Task04==========
        //Filters strings starting with "B" and converts to uppercase.[BLUE, BLACK]
        //==========Task05==========
        //Skip the first two elements and output the remaining ones.[45, 4, 56, 56, 65, 67, 7, 12, 34, 3, 67, 9]
        //==========Task06==========
        //Filtering numbers greater than 50 and displaying their squares.[7056, 4489, 4096]
        //==========Task07==========
        //Leave only words containing the letter "a" and print them in reverse order.[Black]
        //==========Task08==========
        //Filtering numbers, leaving only odd ones and displaying them in ascending order.[5, 7, 7, 9, 23, 23, 45, 65]
        //==========Task09==========
        //Get the average of numbers in a list.OptionalDouble[39.285714285714285]
        //==========Task10==========
        //Get a string concatenating list elements separated by commas.Blue, Green, White, Black, Green, Yellow, Green
        //==========Task11==========
        //Get a list of squares of numbers from another list.[576, 16, 2116, 4, 3136, 64, 4489, 1156, 4225, 529, 1024, 4, 529, 529]
        //==========Task12==========
        //Get a list of letters from a list of words and display them in alphabetical order.[66, 66, 71, 71, 71, 87, 89, 97, 99, 101, 101, 101, 101, 101, 101, 101, 101, 101, 104, 105, 107, 108, 108, 108, 108, 110, 110, 110, 111, 114, 114, 114, 116, 117, 119]
        //==========Task13==========
        //Get the first 3 rows from a list and print them in reverse order.[White, Green, Blue]
        //==========Task14==========
        //Skip the first 2 elements and leave only unique ones.[6, 76, 87, 4, 3, 12, 43, 74]
        //==========Task15==========
        //Filtering and sorting users by age.[Cats{nameOfCat='Gor', ageOfCat=1}, Cats{nameOfCat='Ben', ageOfCat=2}, Cats{nameOfCat='Rob', ageOfCat=2}, Cats{nameOfCat='Bob', ageOfCat=3}]
            }
}