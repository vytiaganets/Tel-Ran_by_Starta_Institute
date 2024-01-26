package de.telran.lesson20240126sum.shape.equal;

public class EqualInteger {
    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 5;
        System.out.println("5 == 5: ");
        System.out.println(a == b);//true
        Integer c = 500;
        Integer d = 500;
        System.out.println("500 == 500: ");
        System.out.println(a == b);//false
        String aStr = "abc";
        String bStr = "abc";
        System.out.println("aStr == bStr");
        System.out.println(aStr == bStr);//false

    }
}
