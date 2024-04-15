//Написать метод T[] filter(T[] t, Filter<T> filter), который принимает на вход массив (любого типа)
//и производит фильтрацию данных согласно реализации интерфейса Filter (например, через лямбда-выражение)
//Интерфейс Filter имеет метод apply (T t), с помощью которого можно будет указывать способ фильтрации.
//interface Filter {
//   boolean apply(T t);
//}
//Проверьте как работает метод на строках или других объектах.
package de.telran.lesson20240410practice;

import javax.sql.rowset.Predicate;
import java.util.Arrays;

public class CustomFilter {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, 4, 5, 6, 7};
        Integer[] filtered = customFilter(ints, (integer) -> integer % 2 == 0);
        System.out.println(Arrays.toString(filtered));
        String[] strings = {"adsgg", "ABC", "qwe", "BEF", "dkfbffbkw", "FDF", "qwqeqww"};
        String[] filteredStrings = customFilter(strings, (s) -> s.length() == 3);
        System.out.println(Arrays.toString(filteredStrings));
        //[2, 4, 6]
        //[ABC, qwe, BEF, FDF]
    }

    //public static <T> T[] customFilter(T[] data, Predicate<T> filter) {
    public static <T> T[] customFilter(T[] data, Filter<? super T> filter) {
        int j =0;
        for (int i = 0; i < data.length; i++) {
            boolean isValid = filter.apply(data[i]);
            if (isValid) {
            data[j++] = data[i];
        }
    }

    T[] result = Arrays.copyOf(data, j);
        return result;
}
}

