//1.Создать лямбда выражение, которое возвращает значение true, если строка не null, используя функциональный интерфейс Predicate.
//2.Создать лямбда выражение, которое проверяет, что строка не пуста, используя функциональный интерфейс Predicate.
//3.Написать программу проверяющую, что строка не null и не пуста, используя функциональный интерфейс Predicate.
//4.Написать программу, которая проверяет, что строка начинается буквой “J”или “N” и заканчивается “A”. Используем функциональный интерфейс Predicate.
//5.Написать лямбда выражение, которое принимает на вход число и возвращает значение “Положительное число”,“Отрицательное число” или  “Ноль”. Используем функциональный интерфейс Function.
//6.Написать лямбда выражение, которое возвращает случайное число от 0 до 10. Используем функциональный интерфейс Supplier.
//English
//1.Create a lambda expression that returns true if the string is not null, using the Predicate functional interface.
//2.Create a lambda expression that checks that the string is not empty using the Predicate functional interface.
//3.Write a program that checks that the string is not null or empty, using the Predicate functional interface.
//4.Write a program that checks that a string begins with the letter “J” or “N” and ends with “A”. We use the Predicate functional interface.
//5.Write a lambda expression that takes a number as input and returns the value “Positive number”, “Negative number” or “Zero”. We use the functional interface Function.
//6.Write a lambda expression that returns a random number from 0 to 10. We use the Supplier functional interface.
package de.telran.home20240229.task2;


import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SimpleMain {
    public static void main(String[] args) {
        //1.Create a lambda expression that returns true if the string is not null using the Predicate functional interface.
        System.out.println("=================Task1=================");
        Predicate<String> notNullPredicate = str -> str != null;

        String str1 = "example string";
        String str2 = null;

        System.out.println(notNullPredicate.test(str1));
        System.out.println(notNullPredicate.test(str2));
        //true
        //false
        //2.Create a lambda expression that checks that a string is not empty using the Predicate functional interface.
        System.out.println("=================Task2=================");
        Predicate<String> notNullPredicate2 = str -> str != null;
        String str11 = "example string";
        String str22 = null;
        if (notNullPredicate.test(str1)) {
            System.out.println("string str1 is not null");
        } else {
            System.out.println("the string str1 is null");
        }
        if (notNullPredicate.test(str2)) {
            System.out.println("string str2 is not null");
        } else {
            System.out.println("string str2 is null");
        }
        //string str1 is not null
        //string str2 is null
        //3.Write a program that checks that the string is not null or empty, using the Predicate functional interface.
        System.out.println("=================Task3=================");
        String str111 = "Hello, world!";
        String str222 = "";
        String str333 = null;

        Predicate<String> notNull = s -> s != null;
        Predicate<String> notEmpty = s -> !s.isEmpty();

        Predicate<String> notNullAndNotEmpty = notNull.and(notEmpty);

        if (notNullAndNotEmpty.test(str111)) {
            System.out.println("the string is not null and not empty");
        } else {
            System.out.println("the string is either null or empty");
        }

        if (notNullAndNotEmpty.test(str222)) {
            System.out.println("the string is not null and not empty");
        } else {
            System.out.println("the string is either null or empty");
        }

        if (notNullAndNotEmpty.test(str333)) {
            System.out.println("the string is not null and not empty");
        } else {
            System.out.println("the string is either null or empty");
        }
        //the string is not null and not empty
        //the string is either null or empty
        //the string is either null or empty
        //4.Write a program that checks that a string begins with the letter “J” or “N” and ends with “A”. We use the Predicate functional interface.
        System.out.println("=================Task4=================");
        Predicate<String> startsWithJ = str -> str != null && str.startsWith("J");
        Predicate<String> startsWithN = str -> str != null && str.startsWith("N");
        Predicate<String> endsWithA = str -> str != null && str.endsWith("A");
        System.out.println(endsWithA.and(startsWithJ.or(startsWithN)).test("NANANA"));
        //true
        //5.Write a lambda expression that takes a number as input and returns the value “Positive number”, “Negative number” or “Zero”. We use the functional interface Function.
        System.out.println("=================Task5=================");
        Function<Integer, String> checkInt = number -> {
            if (number == 0) {
                return "zero";
            }
            return number > 0 ? "positive" : "negative";
        };
        System.out.println(checkInt.apply(0));
        //zero
        //6.Write a lambda expression that returns a random number from 0 to 10. We use the Supplier functional interface.
        System.out.println("=================Task6=================");
        Supplier<Integer> randomNumber = () -> (int) (Math.random() * 10);
        System.out.println(randomNumber.get());
        //9
    }
}
