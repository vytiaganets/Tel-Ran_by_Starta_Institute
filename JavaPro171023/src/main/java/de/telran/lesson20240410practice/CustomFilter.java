////Написать метод T[] filter(T[] t, Filter<T> filter), который принимает на вход массив (любого типа)
////и производит фильтрацию данных согласно реализации интерфейса Filter (например, через лямбда-выражение)
////Интерфейс Filter имеет метод apply (T t), с помощью которого можно будет указывать способ фильтрации.
////interface Filter {
////   boolean apply(T t);
////}
////Проверьте как работает метод на строках или других объектах.
//package de.telran.lesson20240410practice;
//
//
//import javax.sql.rowset.Predicate;
//
//public class CustomFilter {
//    public static void main(String[] args) {
//    Integer[] ints = {1, 2, 3, 4};
//    int[] filtered = customFilter(ints, (integer) -> integer % 2 == 0);
//    String[] strings = {"ABC", "BEF", "FDF", "guqeqww"};
//    String[] filteredStrings = customFilter(strings, (s) -> s.length() == 3);
//    }
//
//    public static <T> T[] customFilter(T[] data, Predicate<T> filter) {
//        boolean isValid = filter.test(data[0]);
//        return null;
//    }
//}
