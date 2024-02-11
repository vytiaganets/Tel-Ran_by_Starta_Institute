// Task 1. Имеется заданный список имен студентов:
//List<String> names = Arrays.asList("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, "");
//
//a) Напечатать список имен студентов со словом student в начале имени
//b) Написать метод findNameStartingWith(), который бы возвращал список имен, начинающихся на определенную букву
//c) Написать метод printNamesLongerThan(), который находил бы имена, в которых количество букв больше n и печатал их в CAPSLOCK
package de.telran.lesson20240212practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, "");
        //List<String> namesWith = findNameStartingWith(names, 'M');
        //System.out.println(namesWith);
        List<String> namesWith = printNamesLongerThan(names, 3);
        System.out.println(namesWith);
//        for(String name : names) {
//            if(name != null && name != "")
//            System.out.println("student " + name);
//        }

    }
   public static List<String> findNameStartingWith(List<String> names, char m){
        List<String> result = new ArrayList<>();
       for(String name : names) {
               if (name != null && !name.isEmpty() && name.charAt(0) == m) {
                   result.add(name);
               }
           }
        return result;
   }

    public static List<String> printNamesLongerThan(List<String> names, int n){
        List<String> result = new ArrayList<>();
        for(String name : names) {
            if (name != null && !name.isEmpty() && name.length() > n) {
                result.add(name.toUpperCase());
            }
        }
        return result;
    }
}
