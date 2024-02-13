package de.telran.lesson20240213;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class SimpleListIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "K", "L"));
        System.out.println(list);//[A, B, C, D, E, K, L]

        ListIterator<String> li = list.listIterator();//двигаесмя вперед
        while (li.hasNext()){
            String str = li.next();
            System.out.print(str+",");//A,B,C,D,E,K,L,
        }
        System.out.println();
        //li = list.listIterator();
        while(li.hasPrevious()){//двигаемся назад
            String str = li.previous();
            System.out.print(str+",");//L,K,E,D,C,B,A,
        }
        System.out.println();
        li = list.listIterator(3);
        while(li.hasNext()){
            String str = li.next();
            System.out.print(str+",");//D,E,K,L,
        }
        System.out.println();
        li = list.listIterator(3);
        while(li.hasPrevious()){
            String str = li.previous();
            System.out.print(str+"("+li.previousIndex()+"),");//C(1),B(0),A(-1),
        }
        System.out.println();
        li = list.listIterator(list.size());
        while(li.hasPrevious()){
            String str = li.previous();
            System.out.print(str+"("+li.previousIndex()+"),");//L(5),K(4),E(3),D(2),C(1),B(0),A(-1),
        }
        System.out.println();
        li = list.listIterator(list.size());//в конец списка
        while(li.hasPrevious()){
            String str = li.previous();
            System.out.print(str+"("+li.previousIndex()+")("+li.nextIndex()+"),");//L(5)(6),K(4)(5),E(3)(4),D(2)(3),C(1)(2),B(0)(1),A(-1)(0),
        }
        System.out.println();
        li = list.listIterator(3);
        while(li.hasNext()){
            String str = li.next();
            if(str.contains("K"))//added element
                li.add("New");
            System.out.print(str+",");//D,E,K,L,
            if(str.contains("L"))//removed element
                li.remove();
            System.out.print(str+",");//
        }
        System.out.println();
        System.out.println(list);//[A, B, C, D, E, K, New, L]
    }
}
