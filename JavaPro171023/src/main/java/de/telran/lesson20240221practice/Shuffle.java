//1. Дан массив некоторых упорядоченных данных. Необходимо "честно" перемешать данные, т.е. распределить их так, чтобы вероятность нахождения любого элемента на любом месте была бы одинакова.
//Например, задача перемешивания колоды карт.
//A B C D
//1/4 1/4 1/4 1/4
package de.telran.lesson20240221practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {

        String[] data = new String[]{"A", "B", "C", "D"};
        shuffle(data);
        System.out.println(Arrays.toString(data));//[C, D, A, B] [A, D, B, C]
        //Collections.shuffle();//O(n)
    }
    public static void shuffle(String[] strings){
        Random random =  new Random();
        for(int i = 1; i < strings.length; i++){
            //swap(strings, i, random.nextInt(i  + 1));
            swap(strings, i, random.nextInt(strings.length));//O(n)
        }
    }
    public static void swap(String[] strings, int i, int j){
        String tmp = strings[i];
        strings[i] = strings[j];
        strings[j] = tmp;
    }
}
