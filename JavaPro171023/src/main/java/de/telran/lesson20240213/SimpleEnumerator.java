package de.telran.lesson20240213;

import java.util.Enumeration;
import java.util.Vector;

public class SimpleEnumerator {
    public static void main(String[] args) {
        //считается устаревшим, не рекомендуется к использованию
        Vector<Integer> vector = new Vector<>();
        for(int i=0; i<10;i++){
            vector.addElement(i);
        }
        System.out.println(vector);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            int el = enumeration.nextElement();
            System.out.print(el+",");//0,1,2,3,4,5,6,7,8,9,
        }
        System.out.println(test(1));
    }
    public static int test (int v)
    {
        int[] a = {0, 2, 3, 4};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1)
                return 1;
        }
            return -1;
        }
}
