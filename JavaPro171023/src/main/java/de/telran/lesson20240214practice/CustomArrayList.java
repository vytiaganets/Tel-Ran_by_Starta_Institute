//2. Имеется класс CustomArrayList, в котором данные хранятся во внутреннем массиве.
//Доработать класс так, чтобы можно было перебирать внутренние данные в цикле вида
//for (String s : list) {
//   System.out.println(s);
//}
package de.telran.lesson20240214practice;

import java.util.Iterator;

public class CustomArrayList implements Iterable<String> {
    private String[] data;

    public CustomArrayList(String[] data) {
        this.data = data;
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList(new String[] {"A", "B", "C", "D"});

        for (String s : list) { // TODO
            System.out.println(s);
        }
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
}
