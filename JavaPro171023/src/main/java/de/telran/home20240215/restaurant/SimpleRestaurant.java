//2)* В ресторане официанты подают заказы Check на кухню. Очень важно чтобы заказы брались в работу поварами строго в том порядке,
//в котором они были переданы на кухню. Создайте множество (Set) заказов, которые будут передаваться на кухню официантом и реализуйте
//механизм взятия в работу этих заказом поваром.
//Используйте LinkedHashSet для решения этой задачи.
//Характеристики Check определите самостоятельно.
//2)* In a restaurant, waiters serve Check orders to the kitchen. It is very important that orders are taken into work by the cooks strictly in the order in which they were transferred to the kitchen. Create a Set of orders that will be sent to the kitchen by the waiter and implement a mechanism for the cook to take these orders into operation. Use LinkedHashSet to solve this problem. Determine the characteristics of Check yourself.
package de.telran.home20240215.restaurant;

import java.util.LinkedHashSet;

public class SimpleRestaurant {
    public static void main(String[] args) {

        Check Check1 = new Check(1, NameOfJuice.GRAPE_JUICE);
        Check Check2 = new Check(2, NameOfJuice.BIRCH_JUICE);
        Check Check3 = new Check(3, NameOfJuice.CHERRY_JUICE);
        Check Check4 = new Check(4, NameOfJuice.APPLE_JUICE);
        Check Check5 = new Check(5, NameOfJuice.PEACH_JUICE);
        Check Check6 = new Check(6, NameOfJuice.ORANGE_JUICE);
        Check Check7 = new Check(7, NameOfJuice.TANGERINE_JUICE);
        Check Check8 = new Check(8, NameOfJuice.POMEGRANATE_JUICE);
        Check Check9 = new Check(9, NameOfJuice.APRICOT_JUICE);
        Check Check10 = new Check(10, NameOfJuice.TOMATO_JUICE);

        LinkedHashSet<Check> CheckList = new LinkedHashSet<>();

        CheckList.add(Check10);
        CheckList.add(Check9);
        CheckList.add(Check8);
        CheckList.add(Check7);
        CheckList.add(Check6);
        CheckList.add(Check5);
        CheckList.add(Check4);
        CheckList.add(Check3);
        CheckList.add(Check2);
        CheckList.add(Check1);
        System.out.println(CheckList);
        System.out.println();

        operateChecks(CheckList);
        System.out.println(CheckList);

    }

    public static void operateChecks(LinkedHashSet<Check> CheckList) {
        LinkedHashSet<Check> CheckList1 = new LinkedHashSet<>();
        for (Check Check : CheckList) {
            cookPizza(Check);
            CheckList1.add(Check);
        }
        CheckList.removeAll(CheckList1);
        CheckList1.clear();
    }

    public static void cookPizza(Check Check) {
        switch (Check.getNameOfJuice()) {
            case BIRCH_JUICE ->
                    System.out.println("Чек # " + Check.getCheckNumber() + ". Официант принесет Вам " + Check.getNameOfJuice());
            case TANGERINE_JUICE ->
                    System.out.println("Чек # " + Check.getCheckNumber() + ". Официант принесет Вам " + Check.getNameOfJuice());
            case APPLE_JUICE ->
                    System.out.println("Чек # " + Check.getCheckNumber() + ". Официант принесет Вам " + Check.getNameOfJuice());
            case APRICOT_JUICE ->
                    System.out.println("Чек # " + Check.getCheckNumber() + ". Официант принесет Вам " + Check.getNameOfJuice());
            case GRAPE_JUICE ->
                    System.out.println("Чек # " + Check.getCheckNumber() + ". Официант принесет Вам " + Check.getNameOfJuice());
            case ORANGE_JUICE ->
                    System.out.println("Чек # " + Check.getCheckNumber() + ". Официант принесет Вам " + Check.getNameOfJuice());
            case PEACH_JUICE ->
                    System.out.println("Чек # " + Check.getCheckNumber() + ". Официант принесет Вам " + Check.getNameOfJuice());
            case POMEGRANATE_JUICE ->
                    System.out.println("Чек # " + Check.getCheckNumber() + ". Официант принесет Вам " + Check.getNameOfJuice());
            case CHERRY_JUICE ->
                    System.out.println("Чек # " + Check.getCheckNumber() + ". Официант принесет Вам " + Check.getNameOfJuice());
            case TOMATO_JUICE ->
                    System.out.println("Чек # " + Check.getCheckNumber() + ". Официант принесет Вам " + Check.getNameOfJuice());
            //[
            //Check{CheckNumber=10, NameOfJuice=Томатный сок},
            //Check{CheckNumber=9, NameOfJuice=Абрикосовый сок},
            //Check{CheckNumber=8, NameOfJuice=Гранатовый сок},
            //Check{CheckNumber=7, NameOfJuice=Мандариновый сок},
            //Check{CheckNumber=6, NameOfJuice=Апельсиновый сок},
            //Check{CheckNumber=5, NameOfJuice=Персиковый сок},
            //Check{CheckNumber=4, NameOfJuice=Яблочный сок},
            //Check{CheckNumber=3, NameOfJuice=Вишневый сок},
            //Check{CheckNumber=2, NameOfJuice=Березовый сок},
            //Check{CheckNumber=1, NameOfJuice=Виноградный сок}]
            //
            //Чек # 10. Официант принесет Вам Томатный сок
            //Чек # 9. Официант принесет Вам Абрикосовый сок
            //Чек # 8. Официант принесет Вам Гранатовый сок
            //Чек # 7. Официант принесет Вам Мандариновый сок
            //Чек # 6. Официант принесет Вам Апельсиновый сок
            //Чек # 5. Официант принесет Вам Персиковый сок
            //Чек # 4. Официант принесет Вам Яблочный сок
            //Чек # 3. Официант принесет Вам Вишневый сок
            //Чек # 2. Официант принесет Вам Березовый сок
            //Чек # 1. Официант принесет Вам Виноградный сок
            //[]
        }
    }
}
