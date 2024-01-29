package de.telran.lesson20240131sum;

public class Main {
    static final String DATABASE_URL = "http://mysql:localhost:8080";
    static int counter;
    static final double PI = 3.14159;
    public static void main(String[] args) {
        A.doSomethingStatic();//раннее связывание
//        A a = new A();// раннее связывание
//        a.doSomething();
        A a;
        // some code
        boolean condition = true;
        if(condition) {
            a = new A();
        }
        else {
            a = new B("1");//позднее связывание
        }
        a.doSomething();//

//        Character character = new Mag("Mag", 1,1,1);
//        character.introduce();
    }
    static class A
    {
        public A(){
            this("Default value");
        }
//        public A() {
//        }
        public A(String a) {
            this.a = a;
        }
        private String a;
        public void doSomething(){
            System.out.println("doSomething A");
        }
        public void doSomething(String s){
            System.out.println("doSomething A");
        }
        public void doSomething(String... s){
            System.out.println("doSomething A");
        }
        public void doSomething(Double... s){
            System.out.println("doSomething A");
        }
//        public void doSomething(String[] s){
//            System.out.println("doSomething A");
//        }
        public static void doSomethingStatic(){
        }
    }
    static class B extends A{
        public B(String a) {
            super(a);//вызов конструктора наследника обязательно
        }

        @Override
        public void doSomething(){
            System.out.println("doSomething B");
        }
    }
}
