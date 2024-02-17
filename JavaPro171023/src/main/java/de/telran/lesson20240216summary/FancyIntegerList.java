package de.telran.lesson20240216summary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class FancyIntegerList implements Iterable<Integer> {
    private int[] massiv = new int[1];
    private int count = 0;
    public void add(int number){
        if(count == massiv.length){
            int[] massiv2 = new int[count*2];
            System.arraycopy(massiv, 0, massiv2,  0, count);
            massiv = massiv2;
        }
        massiv[count]=number;
        count++;
    }
    public int get(int index){
        if(index>=count){//index ot 0, count ot 1
          throw new IllegalStateException("index is out of bound");
        }
        return massiv[index];
    }
    public Iterator<Integer> iterator(){

        Iterator<Integer> iterator = new Iterator<>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public Integer next() {
                //return massiv[index++];//сокращенный вариант:
                int result =  massiv[index];
                index = index + 1;
                return result;//element
            }

//            @Override
//            public String toString() {
//                return "$classname{" +
//                        "index = " + index + ", " +
//                        "massiv[] = " + massiv[index] +
//                        '}';
//            }
        };
        return iterator;
    }
}
