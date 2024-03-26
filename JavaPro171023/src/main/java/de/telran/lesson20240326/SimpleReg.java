package de.telran.lesson20240326;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Stream;

public class SimpleReg {

    public static void main(String[] args) {
        //1 method многократное использование
        String regEx = "www.*";// * справа должны быть любые символы 0 или более раз
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher("www.telran.de");
        boolean matches = matcher.matches();
        //System.out.println("Result RegEx = " + matches);//Result RegEx = true
        while (matcher.find()) {
            System.out.println(matcher.start() + " --- " + matcher.end());
        }
        //2 method однократное
        System.out.println("Result RegEx2 = " + Pattern.matches("www.*", "www.telran.de"));
        //3 method однократное
        String s = "www.telran.de";
        s.matches("www.telran.de");
        System.out.println("Result RegEx String = " + s.matches("www.*"));
        System.out.println(s.matches("^\\www\\.(.*)"));//true


        String text = "I1learned2about3Telran4College5and6now7I'm8studying9Java";
        String delimiter = "\\d";
        pattern = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);
        String[] result = pattern.split(text);
        for (String temp : result) {
            System.out.print(temp + " ");//I learned about Telran College and now I'm studying Java
        }
        System.out.println();
        text = "Мама\\мыла раму.Мокрой тряпкой?";
        //delimiter = "\\s";//\\s
        delimiter = "[\\s,\\.,\\?,\\\\]";//\\s разделитель на слова
        delimiter = "";//на символы
        pattern = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);
        result = pattern.split(text);
        System.out.println(text);
        System.out.println(Arrays.toString(result));//[Мама мыла раму. Мокрой тряпкой?]
        try {
            //IP адрес
            String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
            String IPAddress = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
            String ip = "125.38.33.25";
            System.out.println("IP = " + Pattern.matches(IPAddress, ip));//IP = true
        } catch (
                PatternSyntaxException ex) {
            System.out.println(ex.getIndex() + " --- " + ex.getPattern());
        }
    }
}
