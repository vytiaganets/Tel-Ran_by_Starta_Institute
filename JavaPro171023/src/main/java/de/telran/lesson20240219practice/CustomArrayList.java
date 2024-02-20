//2. Имеется класс CustomArrayList, в котором данные хранятся во внутреннем массиве.
//Доработать класс так, чтобы можно было перебирать внутренние данные в цикле вида
//for (String s : list) {
//   System.out.println(s);
//}

//1. Итератор
//
//- в обратном порядке
//- в случайном порядке

package de.telran.lesson20240219practice;

import java.util.Iterator;

public class CustomArrayList implements Iterable<String> {

    private String[] data;

    public CustomArrayList(String[] data) {
        this.data = data;
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList(new String[] {"A", "B", "C", "D"});

        for (String s : list) {
            System.out.println(s);
        }

        for (String s : list) {
            System.out.println(s);
        }

        Iterator<String> iterator1 = list.iterator();
        Iterator<String> iterator2 = list.iterator();
        iterator1.next();
        iterator2.next();
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }
        };
    }
    //    @Override
//    public Iterator<String> iterator() {
//        return new Iterator<>() {
//
//            int count = 0;
//            @Override
//            public boolean hasNext() {
//                return count < data.length;
//            }
//
//            @Override
//            public String next() {
//                if (!hasNext()) throw new RuntimeException("No elements present");
//                return data[count++];
//            }
//        };
//    }
}
