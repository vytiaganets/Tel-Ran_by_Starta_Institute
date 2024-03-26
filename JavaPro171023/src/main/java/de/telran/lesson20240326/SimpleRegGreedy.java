package de.telran.lesson20240326;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleRegGreedy {
    //greedy - жадный
    public static void main(String[] args) {
        String str = "Egor Anna Alexa Archip Peter";
        //String regEx = "A.+a";// жадный
        //String regEx = "A.++a";// сверхжадный false
        //String regEx = "A.++$";// сверхжадный 5 --- 28  true // сверхжадный корректный для данной строки
        String regEx = "A.+?a";// ленивый 5 --- 9
        Pattern pattern = Pattern.compile(regEx);
        Matcher  matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.start()+" --- "+ matcher.end());
            System.out.println(str.substring(matcher.start(), matcher.end()));
            // ленивый
            //5 --- 9
            //Anna
            //10 --- 15
            //Alexa
            //true
        }
        System.out.println(Pattern.matches(regEx, "Anna"));
    }
}
