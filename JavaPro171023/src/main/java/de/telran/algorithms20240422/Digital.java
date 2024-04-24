package de.telran.algorithms20240422;

import java.util.ArrayList;
import java.util.List;

public class Digital {
    int start;
    int end;

    public Digital(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getMin(){
        int rotation = Math.min(Math.abs(end-start),10-Math.abs(end-start));
        return rotation;
    }

    public static void main(String[] args) {


        List<Digital> digital  = new ArrayList<Digital>();
        digital.add(new Digital(2,5));
        digital.add(new Digital(3,4));
        digital.add(new Digital(4,3));
        digital.add(new Digital(5,2));

        int count = 0;
        for (Digital item : digital){
            count += item.getMin();
        }
        System.out.println("Количество ротаций = "+ count);
    }

}