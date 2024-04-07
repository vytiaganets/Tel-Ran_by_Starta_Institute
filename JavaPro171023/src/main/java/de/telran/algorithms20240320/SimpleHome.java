package de.telran.algorithms20240320;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SimpleHome {
    public static void main(String[] args) {
        System.out.println("=======================Task 1=======================");
        //1) Завершить реализацию Динамического массива (если не завершили в классе):
        //создать метод добавления массива данных в конец нашего Динамического массива - addArray(int[] arrAdd)
        //** создать метод добавления массива данных по индексу в наш Динамический массив - addAtArray(int index, int[] arrAdd)
        //создать метод удаления элемента по его значению в нашем Динамическом массиве boolean removeValue(int value),
        //который возвращает true, если объект найден и удален, иначе false.
        //1) Complete the implementation of the Dynamic Array (if not completed in the class):
        //create a method for adding a data array to the end of our Dynamic array - addArray(int[] arrAdd)
        //** create a method for adding a data array by index to our Dynamic array - addAtArray(int index, int[] arrAdd)
        //create a method for removing an element by its value in our Dynamic array boolean removeValue(int value),
        //which returns true if the object is found and deleted, false otherwise.
        DynamicArray array1 = new DynamicArray(3);
        array1.fillInRow();
        System.out.println(Arrays.toString(array1.getArr()));

        DynamicArray array2 = new DynamicArray(5);
        array2.fillEven();
        System.out.println(Arrays.toString(array2.getArr()));

        DynamicArray array3 = new DynamicArray(5);
        array3.fillOdd();
        System.out.println(Arrays.toString(array3.getArr()));

        int[] numbers = {1, 3, 5};
        array1.addArray(numbers);
        System.out.println(Arrays.toString(array1.getArr()));

        array2.addAtArray(3, numbers);
        System.out.println(Arrays.toString(array2.getArr()));

        System.out.println(array3.removeValue(5));
        System.out.println(Arrays.toString(array3.getArr()));


        System.out.println("=======================Task 2=======================");
        //2) Постройте частотный словарь букв русского (или английского) алфавита (количество различных букв,
        //которые встречаются в тексте);
        //для решения можно использовать Array или HashMap (на ваше усмотрение).
        //2) Construct a frequency dictionary of letters of the Russian (or English) alphabet (number of different letters,
        //which appear in the text);
        //you can use Array or HashMap for the solution (at your discretion).


        String text = "Construct a frequency dictionary of letters of the Russian (or English) alphabet (number of different letters,\n" +
                "which appear in the text);\n" +
                "you can use Array or HashMap for the solution (at your discretion).";

        System.out.println(letterDictionary(text));

        int[] letters = letterDictionary1(text);
        System.out.println(Arrays.toString(letters));
        for (int i = 0; i < letters.length; i++) {
            System.out.println((char) (i + 97) + " = " + letters[i]);
        }
        //=======================Task 1=======================
        //[1, 2, 3]
        //[2, 4, 6, 8, 10]
        //[1, 3, 5, 7, 9]
        //[1, 2, 3, 1, 3, 5, 0]
        //[2, 4, 6, 1, 3, 5, 8, 10, 0, 0]
        //true
        //[1, 3, 7, 9]
        //=======================Task 2=======================
        //{a=13, b=2, c=7, d=3, e=18, f=7, g=1, h=9, i=10, l=5, m=2, n=11, o=13, p=4, q=1, r=16, s=10, t=17, u=8, w=1, x=1, y=5}
        //[13, 2, 7, 3, 18, 7, 1, 9, 10, 0, 0, 5, 2, 11, 13, 4, 1, 16, 10, 17, 8, 0, 1, 1, 5, 0]
        //a = 13
        //b = 2
        //c = 7
        //d = 3
        //e = 18
        //f = 7
        //g = 1
        //h = 9
        //i = 10
        //j = 0
        //k = 0
        //l = 5
        //m = 2
        //n = 11
        //o = 13
        //p = 4
        //q = 1
        //r = 16
        //s = 10
        //t = 17
        //u = 8
        //v = 0
        //w = 1
        //x = 1
        //y = 5
        //z = 0
    }
    public static Map<Character, Long> letterDictionary(String text) {
        Map<Character, Long> dictionary = Arrays.stream(text.split("\\W+"))
                .map(String::toLowerCase)
                .flatMapToInt(String::chars)
                .mapToObj(letter -> (char) letter)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return dictionary;
    }

    public static int[] letterDictionary1(String text) {
        text = text.toLowerCase();
        int[] letters = new int[26];
        for (int i = 0; i < text.length(); i++) {
            int codePoint = text.codePointAt(i);
            if (codePoint > 96 && codePoint < 123) {
                letters[codePoint - 97] += 1;
            }
        }

        return letters;
    }
}
