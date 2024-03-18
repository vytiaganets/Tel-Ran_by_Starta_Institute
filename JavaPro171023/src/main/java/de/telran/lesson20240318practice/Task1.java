package de.telran.lesson20240318practice;

public class Task1{
    public static void main(String[] args){
        try{
            System.out.println(method(2));
            System.out.println(method(3));
        }catch (Exception e){
            //System.out.println("Data is not valid. Please enter valid data...");
            try {
                char c = e.getMessage().charAt(0);
                System.out.println(c);
                //System.out.println(method(Character.codePointOf())c)-1);
                //System.out.println(method(e.getMessage().charAt(0) -1));
            } catch (
                    Exception ignore) {
            }
        }
//2
//Data is not valid. Please enter valid data...
    }

    public static int method(int data) throws Exception {
        if (data % 2 == 1) {
            //throw new Exception("number is odd");
            throw new Exception(String.valueOf(data));
        }
        return data;
    }
}
