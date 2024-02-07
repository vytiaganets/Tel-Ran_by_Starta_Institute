package de.telran.lesson20240122practice;

public class UseA {
    public static void main(String[] args) {
        //A.staticMethod();
        A a = new A(2000);
        //Static init block
        //Constructor called
        a.method();
        //порядок инициализации
        //static field init
        // static blocks
        //non-static field init
        // non-static blocks
        //constructor
        //пользуемся экземпляром класса

//        Static init block
//        Non-static init block
//        Constructor called
//        Non-static method called
//        2000

    }
}
