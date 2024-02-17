package de.telran.lesson20240216summary;

import java.util.Iterator;

public class SimpleMain {
    public static void main(String[] args) {
        FancyIntegerList list = new FancyIntegerList();
        list.add(123);//if(index>=count){ in get() -> 0
        list.add(321);
        int index = 0;
        Integer a = list.get(index);
        //System.out.println(a);//index is out of bound if index = 5
        //System.out.println(a);//123
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (Integer i : list) {//implements Iterable<Integer> in FancyIntegerList
            System.out.println(i);
        }
//        System.out.println(it);//$classname{index = 0, massiv[] = 123}
//        it.next();
//        System.out.println(it);//$classname{index = 1, massiv[] = 0}
//        it.next();
//        System.out.println(it);//$classname{index = 2, massiv[] = 0}
    }
}
