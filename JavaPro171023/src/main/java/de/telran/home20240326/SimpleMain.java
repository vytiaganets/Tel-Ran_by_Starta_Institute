package de.telran.home20240326;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class SimpleMain {
    public static void main(String[] args) {
        System.out.println("===================Task 1===================");
        //1. Написать регулярное выражение для проверка email (например my_25@domen-38.de).
        //1. Write a regular expression to check email (for example my_25@domen-38.de).
        String string = "my_25@domen-38.de";
        boolean email = string.matches("^[^_[.]-][\\w-]+([.][\\w-]+)*@[-\\w&&[^_]]{3,20}([.][a-zA-Z]{2,7})?[.][a-zA-Z]{2,}$");
        System.out.println("Ваш адрес электронной почты соответствует требованиям: " + email);

        System.out.println("===================Task 2===================");
        //2.* Написать регулярное выражение для проверки корректности нового пароля,
        //который соответствует определенным критериям:
        //состоять минимум из 8 символов;
        //должен обязательно включать хотя бы одну маленькую букву;
        //должен обязательно включать хотя бы одну большую букву;
        //должен обязательно включать хотя бы одну цифру;
        //должен обязательно включать хотя бы один спецсимвол (пример: !@#$%^&_+-=);
        //2.* Write a regular expression to check the correctness of the new password,
        //which meets certain criteria:
        //consist of at least 8 characters;
        //must include at least one small letter;
        //must include at least one capital letter;
        //must include at least one digit;
        //must include at least one special character (example: !@#$%^&_+-=);

        boolean password = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&_+=-]).{8,20}$", "4jdkOwm9%lDkfng");
        System.out.println("Ваш пароль соответствует требованиям: " + password);

        System.out.println("===================Task 3===================");
        //3. Разбить текст на слова с помощью регулярного выражение и рассчитать словарь встречающихся слов для этого текста
        //(подсчитать количество одинаковых слов, встречающихся в этом тексте).
        //3. Split text into words using a regular expression and calculate a dictionary of occurring words for that text
        //(count the number of identical words found in this text).

        String text = "3. Split text into words using a regular expression and calculate a dictionary of occurring words for that text\n" + "(count the number of identical words found in this text).";

        List<Map.Entry<String, Long>> dictionary;
        dictionary = Arrays.stream(text.toLowerCase().split("\\W+"))
                .collect(groupingBy(Function.identity(), counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .toList();
        System.out.println(dictionary);
        //===================Task 1===================
        //Ваш адрес электронной почты соответствует требованиям: true
        //===================Task 2===================
        //Ваш пароль соответствует требованиям: true
        //===================Task 3===================
        //[3=1, a=2, and=1, calculate=1, count=1, dictionary=1, expression=1, for=1, found=1, identical=1, in=1, into=1, number=1, occurring=1, of=2, regular=1, split=1, text=3, that=1, the=1, this=1, using=1, words=3]
    }
}