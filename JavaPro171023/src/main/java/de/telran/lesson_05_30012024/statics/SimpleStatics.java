package de.telran.lesson_05_30012024.statics;

public class SimpleStatics {
    static Cat cat6;
    static  Cat cat7;
    static Cat cat8 = new Cat("Vasia", 7);
    static {
        cat6 = new Cat("Bob", 10);
        cat7 = new Cat("Vov", 1);
        System.out.println("Запустился статический блок инициализации");
    }
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasia", 10);
        System.out.println(cat1);
        Cat.setCountEars(10);
        System.out.println(cat1);
        Cat cat2 = new Cat("Tom", 5);
        System.out.println(cat2);
        System.out.println(cat1);
        Math.abs(-225);//пример утилитного класса
        System.out.println(Cat.COUNT_LEGS);
        final Cat cat3 = new Cat("Petia", 10);//final тут работает только для ссылки на обьект
        //cat3 = cat2; //нельзя переприсваивать ссылку, обьект final
        cat3.setAge(5);
        System.out.println(cat3);
        System.out.println(cat6);
        System.out.println(cat7);
        System.out.println(cat8);
    }
}
