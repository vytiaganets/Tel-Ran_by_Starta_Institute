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
        House house1 = new House(23, 346254, "Lviv", true);
        House house2 = new House(12, 657575, "Chernivtsi", true);
        House house3 = new House(32, 575753, "Poltava", false);
        House house4 = new House(24, 241234, "Kharkiv", false);
        House house5 = new House(67, 535515, "Sevastopol", true);
        House house6 = new House(68, 462462, "Simpferopol", false);
        House house7 = new House(45, 646266, "Kiev", true);
        House house8 = new House(55, 477657, "Dnipro", false);
        House house9 = new House(89, 743747, "Mykolaiv", true);
        House house10 = new House(21, 45747, "Kherson", false);

        List<House> housesList = new ArrayList<>();
        housesList.add(house1);
        housesList.add(house2);
        housesList.add(house3);
        housesList.add(house4);
        housesList.add(house5);
        housesList.add(house6);
        housesList.add(house7);
        housesList.add(house8);
        housesList.add(house9);
        housesList.add(house10);
        System.out.println("Не отсортировано:");
        System.out.println(housesList);
        System.out.println();

        System.out.println("Сортировано по цене:");
        Collections.sort(housesList);
        System.out.println(housesList);
        System.out.println();

        System.out.println("Сортировано по городу и цене:");
        Collections.sort(housesList, new CityPriceComparator());
        System.out.println(housesList);
        System.out.println();

        System.out.println("Сортировка по городу и району:");
        Collections.sort(housesList, new CityAreaComparator());
        System.out.println(housesList);
        System.out.println();
    }
}
