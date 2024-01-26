package de.telran.lesson20240126sum.shape;

public class Point {

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Point){
            return true;
        }
        return super.equals(obj);
    }
}
