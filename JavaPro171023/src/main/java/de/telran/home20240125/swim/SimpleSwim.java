//У вас есть интерфейс Swim в котором объявлен метод void swim().
//Имплементируйте данный интерфейс в классы:
//Human у которого есть свои характеристики имя , возраст.
//Fish, характеристики - наименование и вес.
//Boat, характеристики - скорость.
//Научите данные классы плавать. )
package de.telran.home20240125.swim;

public class SimpleSwim {
    public static void main(String[] args) {
        Swim swim = new Human("Bob", 57);
        swim.swim();
        System.out.println();
        swim = new Fish("Losos", 5);
        swim.swim();
        System.out.println();
        swim = new Boat(60);
        swim.swim();
//Human{name='Bob', age=57}
//Fish{name='Losos', weight=5}
//Boat{speed=60}
    }
}
