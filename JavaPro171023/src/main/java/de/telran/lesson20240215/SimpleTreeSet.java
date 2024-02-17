package de.telran.lesson20240215;

import java.util.*;

public class SimpleTreeSet {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("A");
        set.add("C");
        set.add("B");
        System.out.println(set);//  [A, B, C] sorted!
        Set<String> set1 = Set.of("G", "D", "K", "E");//хранится в неотсортированном виде потому что не TreeSet
        System.out.println(set1);//[G, E, D, K]
        set.addAll(set1);
        //set1.add = ("H");//Set неизменяемый immutiable object
        System.out.println(set);//[A, B, C, D, E, G, K]

        //SortedSet<String> sortedSet = (SortedSet<String>) set1;//Set неизменяемый, ошибкка
        //System.out.println(sortedSet);
        SortedSet<String> sortedSet = (SortedSet<String>) set;
        System.out.println(sortedSet);//[A, B, C, D, E, G, K]
        System.out.println("sortedSet.first(): "+sortedSet.first());//sortedSet.first(): A
        System.out.println("sortedSet.last(): "+sortedSet.last());//sortedSet.last(): K
        sortedSet.comparator();

        NavigableSet<String> navigableSet = (NavigableSet<String>) set;
        Iterator it = navigableSet.descendingIterator();
        while (it.hasNext()){
            System.out.print(it.next()+",");//K,G,E,D,C,B,A,
        }
        System.out.println();

        it = navigableSet.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+",");//A,B,C,D,E,G,K,
        }
        System.out.println();

        //new EnumSet<>();
            //NavigableSet<String>
        System.out.println(set.remove("G"));//true
        System.out.println(set);//[A, B, C, D, E, K]

    }
}
