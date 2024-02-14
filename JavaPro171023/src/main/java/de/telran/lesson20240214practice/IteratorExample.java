package de.telran.lesson20240214practice;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        for (int i = 0; i < list.size(); i++) {//O(n^2) when LinkedList, O(n) when ArrayList
            System.out.print(list.get(i));

            for (String s : list) {
                System.out.print(s);
            }
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next());
            }
        }
    }
}
