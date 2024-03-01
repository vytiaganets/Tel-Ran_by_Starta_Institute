//1. Вы автоматизируете бизнес риелторов. у вас есть класс:
//public class House {
//    int area; //площадь дома
//    int price; // цена
//    String city; // город
//    boolean hasFurniture; //продается с мебелью
//}
//
//
//По умолчанию в вашем информационном хранилище дома сортируются по цене.
//
//Но иногда клиент хочет видеть информацию о домах в конкретном городе и осортированную по цене.
//Реализуйте компаратор, который вы можете применить для показа клиенту в требуемом им формате.
//
//А если клиенту неожиданно захочет увидеть информацию, отсортированную в формате:
//"город - площадь дома", что вы будете делать?
//English
//1. You automate the business of realtors. you have a class:
//public class House {
// int area; //house area
// int price; // price
// String city; // city
// boolean hasFurniture; //sold furnished
//}
//
//
//By default, your information store sorts houses by price.
//
//But sometimes the client wants to see information about houses in a specific city and sorted by price.
//Implement a comparator that you can use to display to the client in the format they require.
//
//And if the client suddenly wants to see information sorted in the format:
//"city - house area", what will you do?

package de.telran.home20240220.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleHouse {
    public static void main(String[] args) {
        House house1 = new House(98, 500000,"Stuttgart", false);
        House house2 = new House(75, 550000,"Berlin", true);
        House house3 = new House(69, 420000,"Rostock", true);
        House house4 = new House(110, 650000,"München", false);
        House house5 = new House(87, 480000,"Stuttgart", true);
        House house6 = new House(120, 700000,"Dresden", false);
        House house7 = new House(90, 520000,"Stuttgart", true);
        House house8 = new House(130, 800000,"Stuttgart", false);

        List<House> housesList = new ArrayList<>();
        housesList.add(house1);
        housesList.add(house2);
        housesList.add(house3);
        housesList.add(house4);
        housesList.add(house5);
        housesList.add(house6);
        housesList.add(house7);
        housesList.add(house8);
        System.out.println("Not sorted:");
        System.out.println(housesList);
        System.out.println();

        System.out.println("Sorted by price:");
        Collections.sort(housesList); //сортируются по цене
        System.out.println(housesList);
        System.out.println();

        System.out.println("Sorted by city and price:");
        Collections.sort(housesList, new CityPriceComparator());//сортируются по городам и по цене
        System.out.println(housesList);
        System.out.println();

        System.out.println("Sorted by city and area:");
        Collections.sort(housesList, new CityAreaComparator());//сортируются по городам и по площади
        System.out.println(housesList);
        System.out.println();
    }
}
