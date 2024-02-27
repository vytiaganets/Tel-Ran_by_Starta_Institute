package de.telran.lesson20240226practice;

import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        findNumbersLessThan7(set);
    }
    private static void findNumbersLessThan7(Set<Integer> integers){
        for(Integer i : integers){
            if(i < 7){
                System.out.println(i);
            }else {
                break;
            }
        }
    }
}
