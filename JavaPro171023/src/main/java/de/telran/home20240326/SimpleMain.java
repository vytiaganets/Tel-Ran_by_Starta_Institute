//1. Написать регулярное выражение для проверка email (например my_25@domen-38.de).
//2.* Написать регулярное выражение для проверки корректности нового пароля,
//который соответствует определенным критериям:
//
//
//состоять минимум из 8 символов;
//
//должен обязательно включать хотя бы одну маленькую букву;
//
//должен обязательно включать хотя бы одну большую букву;
//
//должен обязательно включать хотя бы одну цифру;
//
//должен обязательно включать хотя бы один спецсимвол (пример: !@#$%^&_+-=);
//3. Разбить текст на слова с помощью регулярного выражение и рассчитать словарь встречающихся слов для этого текста
//(подсчитать количество одинаковых слов, встречающихся в этом тексте).
package de.telran.home20240326;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class SimpleMain {
    public static void main(String[] args) {

//  1. Написать регулярное выражение для проверки email (например my_25@domen-38.de).

//  1-й вариант
        Pattern emailPattern = Pattern.compile("^[^_[.]-][\\w-]+([.][\\w-]+)*@[-\\w&&[^_]]{3,20}([.][a-zA-Z]{2,7})?[.][a-zA-Z]{2,}$");
        Matcher emailMatcher = emailPattern.matcher("my_25@domen-38.de");
        boolean emailMatch = emailMatcher.matches();
        System.out.println("Your e-mail matches requirements: " + emailMatch);

//  2-й вариант
        boolean emailMatch1 = Pattern.matches("^[^_[.]-][\\w-]+([.][\\w-]+)*@[-\\w&&[^_]]{3,20}([.][a-zA-Z]{2,7})?[.][a-zA-Z]{2,}$", "my_25@domen-38.de");
        System.out.println("Your e-mail matches requirements: " + emailMatch1);

//  3-й вариант
        String email = "my_25@domen-38.de";
        boolean emailMatch2 = email.matches("^[^_[.]-][\\w-]+([.][\\w-]+)*@[-\\w&&[^_]]{3,20}([.][a-zA-Z]{2,7})?[.][a-zA-Z]{2,}$");
        System.out.println("Your e-mail matches requirements: " + emailMatch2);


//  2.* Написать регулярное выражение для проверки корректности нового пароля,
//  который соответствует определенным критериям:
//      состоять минимум из 8 символов;
//      должен обязательно включать хотя бы одну маленькую букву;
//      должен обязательно включать хотя бы одну большую букву;
//      должен обязательно включать хотя бы одну цифру;
//      должен обязательно включать хотя бы один спецсимвол (пример: !@#$%^&_+-=);

        boolean passwordMatch = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&_+=-]).{8,20}$", "4jdkOwm9%lDkfng");
        System.out.println("Your password matches requirements: " + passwordMatch);


//  3. Разбить текст на слова с помощью регулярного выражение и рассчитать словарь встречающихся слов для этого текста
//  (подсчитать количество одинаковых слов, встречающихся в этом тексте).


        String text = "A regular expression is a sequence of characters that forms a search pattern.\n" +
                "When you search for data in a text, you can use this search pattern to describe what you are searching for.\n" +
                "A regular expression can be a single character, or a more complicated pattern.\n" +
                "Regular expressions can be used to perform all types of text search and text replace operations.";

//  1-й вариант
        Map<String, Integer> dictionary = new TreeMap<>();

        Pattern pattern = Pattern.compile("\\w+");//
        Matcher matcher = pattern.matcher(text);
        String word = null;
        while (matcher.find()) {
            word = matcher.group().toLowerCase();
            if (!dictionary.containsKey(word)) {
                dictionary.put(word, 1);
            } else {
                dictionary.put(word, dictionary.get(word) + 1);
            }

        }
        System.out.println(dictionary);

//  2-й вариант
        List<Map.Entry<String, Long>> dictionary1;
        dictionary1 = Arrays.stream(text.toLowerCase().split("\\W+"))
                .collect(groupingBy(Function.identity(), counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .toList();

        System.out.println(dictionary1);

    }
}