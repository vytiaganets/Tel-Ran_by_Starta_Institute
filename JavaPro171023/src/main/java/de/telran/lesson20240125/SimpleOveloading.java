package de.telran.lesson20240125;

public class SimpleOveloading {
    public static void main(String[] args) {
        System.out.println(add(2,5));
        float resultFloat = add(5,7);
    }
    public static int add(int arg1, int arg2){
        int result = arg1 + arg2;
        return result;
    }
    public static float add(float arg1, float arg2){
        float result = arg1 + arg2;
        return result;
    }
}
