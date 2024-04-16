//Посмотрите на задачу, которую реализовывали в классе и измените критерии работы жадного алгоритма на "максимальная выгода от активностей, второстепенно заполняемость по времени"
//зал для конференций работает с 9:00 до 17:00
//заявки с 9:00 до 13:00 стоят 1 единицу
//заявки с 13:00 до 17:00 стоят 2 единицы
//заявки на пересечении в большую сторону до 13:00 стоят 1 ед
//например с 11 до 14 стоит 1 ед
//заявки на пересечении в большую сторону после 13:00 стоят 2 ед
//например с 12 до 16 стоит 2 ед
//Look at the problem that was implemented in the class and change the criteria for the greedy algorithm to “maximum benefit from activities, secondary occupancy in time”
//the conference room is open from 9:00 to 17:00
//applications from 9:00 to 13:00 cost 1 unit
//applications from 13:00 to 17:00 cost 2 units
//applications at the intersection up until 13:00 cost 1 unit
//for example, from 11 to 14 it costs 1 unit
//applications at the intersection upward after 13:00 cost 2 units
//for example, from 12 to 16 it costs 2 units
package de.telran.algorithms20240415;

import java.util.ArrayList;

public class SimpleHome {
    public static void main(String[] args) {
        ArrayList<ActivityHome> list = new ArrayList<>();
        list.add(new ActivityHome("a", 16, 17, 2));
        list.add(new ActivityHome("b", 15, 16, 2));
        list.add(new ActivityHome("c", 10, 15, 1));
        list.add(new ActivityHome("d", 12, 13, 1));
        list.add(new ActivityHome("e", 14, 17, 2));
        list.add(new ActivityHome("f", 10, 11, 1));
        list.add(new ActivityHome("g", 14, 15, 2));
        list.add(new ActivityHome("i", 11, 13, 1));


        ActivitySelectionHome activities = new ActivitySelectionHome();
        activities.selectActivityHome(list);
        //f  10 -> 11 -> price is: 1
        //i  11 -> 13 -> price is: 1
        //d  12 -> 13 -> price is: 1
        //c  10 -> 15 -> price is: 1
        //g  14 -> 15 -> price is: 2
        //b  15 -> 16 -> price is: 2
        //e  14 -> 17 -> price is: 2
        //a  16 -> 17 -> price is: 2
        //--------------------
        //f  10 -> 11 -> price is: 1
        //d  12 -> 13 -> price is: 1
        //g  14 -> 15 -> price is: 2
        //b  15 -> 16 -> price is: 2
        //a  16 -> 17 -> price is: 2
    }
}
