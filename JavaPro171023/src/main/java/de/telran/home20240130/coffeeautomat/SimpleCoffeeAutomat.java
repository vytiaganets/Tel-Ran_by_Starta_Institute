//У вас на работе есть один кофейный автомат. Он умеет готовить различные виды кофе. Но он только один.
//Реализуйте класс кофейного автомата, с помощью которого любой человек может приготовить себе различные варианты кофе.
//Но что важно, сколько ко бы раз не обращался человек за изготовлением кофе, или какие бы люди не пытались приготовить кофе, они всегда получали бы ссылку на один и тот же объект кофейного автомата.
//(Поищите информацию в интернете о паттерне Singleton и попытайтесь его реализовать при решении данной задачи.
//Можно использовать вариант реализации со статическим методом и приватным конструктором, или вариант реализации через Enum.)
package de.telran.home20240130.coffeeautomat;

public class SimpleCoffeeAutomat {
    public static void main(String[] args) {
        CoffeeAutomat coffeeAutomat = CoffeeAutomat.getExample();
        CoffeeAutomat.getExample().getCoffee();
        //Please, make choice:
        //0 - latte, 1 - espresso, 2 - americano
        //0
        //Ready LATTE

        //System.out.println(test(1));
    }
//    public static int test (int v)
//    {
//        int[] a = {0, 2, 3, 4};
//        for (int i = 0; 1 < a.length; i++) {
//            if (a[i] == 1)
//                return 1;
//        }
//            return -1;
//        }
}
