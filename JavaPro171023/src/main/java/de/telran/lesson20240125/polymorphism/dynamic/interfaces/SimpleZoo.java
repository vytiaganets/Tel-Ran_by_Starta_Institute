//package de.telran.lesson_04_25012024.polymorphism.dynamic.interfaces;
//
//public class SimpleZoo {
//    public static void main(String[] args) {
//        DancerInterface.loveApplause();
//        //DancerInterface.salary = 5; // изменять нельзя
//        System.out.println("Содержание актера = " + DancerInterface.salary);
//
//        DancerInterface actor = new Dog();
//        actor.dance();
//        actor.eat();
//        actor.drink();
//        //actor.loveApplause();//не получаю доступ к static
//        System.out.println();
//
//        actor = new Bird();
//        actor.dance();
//        actor.eat();
//        actor.drink();
//        Bird.loveApplause();
//        System.out.println();
//
//
//        actor = new Fish();
//        actor.dance();
//        actor.eat();
//        actor.drink();
//        System.out.println();
//        //Fish.
//
//        //DancerInterface actor1 = new DancerInterface(); //обьект интерфейса не можем создать
//
//        System.out.println("----Аплодисменты-----");
//    }
//}
