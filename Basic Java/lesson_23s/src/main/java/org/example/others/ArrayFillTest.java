package main.java.org.example.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayFillTest {


    public static final int SIZE_ARRAY = 3;

    public static void main(String[] args) {
        // Создание массива
        // 1. через аргументы
        String[] engWord1 = {"Hi", "I", "Hello"};

        // 2. через оператор new
        String[] engWord2 = new String[SIZE_ARRAY];
        engWord2[0] = "Hi";
        engWord2[1] = "I";
        engWord2[2] = "Hello";

        String[] engWord4 = new String[SIZE_ARRAY];

        // 3. через оператор new и аргументы
        String[] engWord3 = new String[]{"Hi", "I", "Hello"};

        // 4. нулевой длинны через new
        String[] engWord5 = new String[0];

        // 5. нулевой длинны через аргументы
        String[] engWord6 = {};

        someFunction(new int[]{6, 7, 8, 9, 10});


        // Вывести массив через for-each
        System.out.println("1. Вывести массив через for-each ");

        for(String engWord: engWord1) {
            System.out.println(engWord);
        }

        // Вывести массив через for
        System.out.println();
        System.out.println("2. Вывести массив через for ");
        for (int i = 0; i < engWord1.length; i++) {
            String engWord = engWord1[i];
            System.out.println(i + " = " + engWord);
        }

        // Вывести массив через while
        System.out.println();
        System.out.println("3. Вывести массив через while ");
        int i = 0;
        while (i < engWord1.length) {
            String engWord = engWord1[i];
            System.out.println(i + " = " + engWord);
            i++;
        }

        // Преобразовать массив в строку и вывести как строку
        System.out.println();
        System.out.println("4. Преобразовать массив в строку и вывести как строку ");

        System.out.println(Arrays.toString(engWord1));


        // Клонирование массива
        String[] engWordNew = engWord1;
        String[] engWordClone = engWord2.clone();


        // Заполнение массива один значением
        Arrays.fill(engWordClone, "!");
        System.out.println(Arrays.toString(engWordClone));
        Arrays.fill(engWordNew, "1");
        System.out.println(Arrays.toString(engWordNew));

        // Сортировка
        Arrays.sort(engWord3);
        System.out.println("engWord3 " + Arrays.toString(engWord3));

        // Максимальный индекс массива
        int maxArrayIndex = engWord1.length - 1;
        System.out.println("maxArrayIndex = " + maxArrayIndex);

        // Взять часть массива c начала
        String[] arrayPart = Arrays.copyOf(engWord3, 2);
        System.out.println("arrayPart = " + Arrays.toString(arrayPart));

        // Взять часть массива c конца
        String[] arrayPart2 = Arrays.copyOfRange(engWord3, 1, engWord3.length);
        System.out.println("arrayPart2 = " + Arrays.toString(arrayPart2));

        // Списки и ArrayList
        List<String> list = new ArrayList<>(); // диномический массив - то есть массив
        list.add("Hi"); // аналог массива list[0] = "Hi"
        list.add("Hello");
        list.add("I");

        System.out.println(list.get(0)); // аналог массива list[0]

    }

    private static void someFunction(int[] ints) {
    }

    private String[] getArray() {
        return new String[]{"hi", "I"};
    }

    private static void printArrray(String[] engWords) {
        System.out.println(Arrays.toString(engWords));
    }

}
