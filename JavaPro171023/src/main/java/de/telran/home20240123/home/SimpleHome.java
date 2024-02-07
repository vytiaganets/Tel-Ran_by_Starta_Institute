//Есть класс Дом и в нем живет много объектов типа Житель.
//У Дома так же есть объекты Крыша, Стены, Окна, Двери.
//Создайте класс для сущности Дом и ассоциированные с ним объекты, входящий в него.
//Подумайте какие из них агрегируются с домом, а какие связаны отношением Композиция.
package de.telran.home20240123.home;

import java.util.ArrayList;

public class SimpleHome {
    public static void main(String[] args) {
        Roof roof1 = new Roof("Square", 10);
        Doors doors1 = new Doors("Square", 5);
        Windows windows1 = new Windows("Square", 2);
        Walls walls1 = new Walls("Square", 4);

        Home home1 = new Home(2);

        home1.buitHome();
        System.out.println();
        ArrayList<Residents> residents1 = new ArrayList<Residents>();
        Residents resident1 = new Residents("Bob", "M", 32);
        residents1.add(resident1);
        Residents resident2 = new Residents("Dil", "M", 23);
        residents1.add(resident2);
        Residents[] residents2 = new Residents[residents1.size()];
        residents1.toArray(residents2);
        home1.setResidents(residents2);
        home1.residentOfHome(residents2);
        //Построенный дом размером 2 квартир, Square 5 дверей, Square 10 крыша Square 4 стен, 2 Square окон.
        //Жильцы:
        //1.Bob, 32, M.
        //2.Dil, 23, M.
    }
}
