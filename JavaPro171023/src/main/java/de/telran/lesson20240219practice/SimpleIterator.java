//1. Дан список из числовых данных.
//С помощью итератора:
//a). Напечатать только четные числа из списка.
//b). Удалить из списка все числа, заканчивающиеся на 0.
//c). Составить список квадратов чисел.
//public static void main(String[] args) {
//        List<Integer> list = new LinkedList<>(List.of(1, 2, 3, 4, 5));
//
//        Iterator<Integer> iterator = list.iterator();
//
//        while (iterator.hasNext()) {
//            int num = iterator.next();
//            if (num % 2 == 0) {
//                System.out.println(num);
//            }
//        }
//while (iterator.hasNext()) {
////            int num = iterator.next();
////            if (num % 10 == 0) {
////                iterator.remove();
////            }
////        }
////        System.out.println(list);
////        List<Integer> list2 = new LinkedList<>();
////        while (iterator.hasNext()) {
////            int num = iterator.next();
////            list2.add(num * num);
////            }
////        System.out.println(list2);

package de.telran.lesson20240219practice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class SimpleIterator {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list = new LinkedList<>();
            list.add("A");
            list.add("B");
            list.add("C");
            list.add("D");
            list.add("E");

//            for (int i = list.size()-1; i >= 0; i--) {
//                System.out.println(list.get(i));
//            }

//            for (int i = 0; i < list.size(); i++) { // O(n^2) when LinkedList, O(n) when ArrayList
//                System.out.println(list.get(i));
//            }

//            for (String s : list) {
//                System.out.println(s);
//            }
//            Iterator<String> iterator = list.iterator();
//            while (iterator.hasNext()){
//                System.out.println(iterator.next());
//            }

        }

    }
