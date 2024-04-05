//1) Напишите регулярное выражение, которое соответствует пин-коду из 4 чисел.
//2) Напишите регулярное выражение, которое соответствует именам клавиш F1-F12.
//3) Напишите регулярное выражение, которое соответствует любому номеру телефона.
//Телефонный номер состоит из 7 цифр подряд, 1234567, или из 3х цифр, пробела или тире, а затем из 4 цифр (123-4567, 123 4567).
//4) Напишите регулярное выражение, которое соответствует URL-адресу сайта вида https://someaddress.someending
//5) Имеется текст "Php is the best programming language in the world. I study php." Замените в нем hp на java.
//6) напишите метод поиска в тексте всех слов, начинающихся с определенной буквы.
//1) Write a regular expression that matches a 4-number pin code.
//2) Write a regular expression that matches the names of the F1-F12 keys.
//3) Write a regular expression that matches any phone number.
//The phone number consists of 7 digits in a row, 1234567, or 3 digits, a space or a dash, and then 4 digits (123-4567, 123 4567).
//4) Write a regular expression that matches a site URL like https://someaddress.someending
//5) There is text "Php is the best programming language in the world. I study php." Replace hp with java.
//6) write a method for searching the text for all words starting with a certain letter.
package de.telran.lesson20240327practice;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleRegEx {
    public static void main(String[] args) {
        ////1) Напишите регулярное выражение, которое соответствует пин-коду из 4 чисел.
        System.out.println("==================Task1================");
        System.out.println(Pattern.matches("\\d", "1234"));//false
        System.out.println(Pattern.matches("(\\d{4})", "1234"));//true
        //Pattern pattern = Pattern.compile("(\\d{4})");
        //System.out.println(pattern);

        System.out.println(Pattern.matches("[\\d]{4}", "1234"));//true
        System.out.println(Pattern.matches("[\\d]{4}", "124"));//false
        System.out.println(Pattern.matches("[\\d]{4}", "12345"));//false
        System.out.println(Pattern.matches("[\\d]{4}", "1s34"));//false

        //2) Напишите регулярное выражение, которое соответствует именам клавиш F1-F12.
        System.out.println("==================Task2================");
        System.out.println(Pattern.matches("[F]([1-9]|[1][0-2])", "F9"));//true
        System.out.println(Pattern.matches("[F]([1-9]|[1][0-2])", "F12"));//true
        System.out.println(Pattern.matches("[F]([1-9]|[1][0-2])", "F20"));//false

        //3) Напишите регулярное выражение, которое соответствует любому номеру телефона.
        //Телефонный номер состоит из 7 цифр подряд, 1234567, или из 3х цифр, пробела или тире, а затем из 4 цифр (123-4567, 123 4567).
        System.out.println("==================Task3================");
        System.out.println(Pattern.matches("[\\d]{7}|([\\d]{3}[-\\s][\\d]{4})", "1234567"));//true
        System.out.println(Pattern.matches("[\\d]{3}[-\\s]?[\\d]{4}", "1234567"));//true
        System.out.println(Pattern.matches("[\\d]{3}[-\\s]?[\\d]{4}", "123 4567"));//true
        System.out.println(Pattern.matches("[\\d]{3}[-\\s]?[\\d]{4}", "123-4567"));//true

        //4) Напишите регулярное выражение, которое соответствует URL-адресу сайта вида https://someaddress.someending
        System.out.println("==================Task4================");
        System.out.println(Pattern.matches("https://[a-z]+[.][a-z]+", "https://someaddress.someending"));//false

        //5) Имеется текст "Php is the best programming language in the world. I study php." Замените в нем hp на java.
        System.out.println("==================Task5================");
        String text = "Php is the best programming language in the world. I study php.";
        Pattern pattern = Pattern.compile("[pP]hp");
        Matcher matcher = pattern.matcher(text);
        String replaced = matcher.replaceAll(text);
        System.out.println(replaced);
        //Php is the best programming language in the world. I study php. is the best programming language in the world. I study Php is the best programming language in the world. I study php..
        System.out.println("==================Task5.2================");
        String result = text.replaceAll("[pP]hp", "Java");
        System.out.println(result);
        //Java is the best programming language in the world. I study Java.
        //6) напишите метод поиска в тексте всех слов, начинающихся с определенной буквы.
        System.out.println("==================Task6================");
        text = "Some text with different words for-test purpose. This can be anything... t";

        List<String> words = findWordsStartingWith(text, 't');
        System.out.println(words);

    }

    public static List<String> findWordsStartingWith(String text, Character letter) {
        List<String> words = new ArrayList<>();
        //Pattern pattern = Pattern.compile("\\b[" + Character.toLowerCase(letter) + Character.toUpperCase(letter) + "][a-zA-Z]*");
        Pattern pattern = Pattern.compile("\\b[" + letter + "][a-zA-Z']*\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String word = matcher.group();
            words.add(word);
        }
        return words;
    }

}
