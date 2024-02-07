package de.telran.lesson20240126summary.shape;

public class Point {

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Point){
            return true;
        }
        return super.equals(obj);
    }
}
