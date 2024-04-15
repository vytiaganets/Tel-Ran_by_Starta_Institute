package de.telran.algorithms20240415;

    import java.util.ArrayList;

    public class ActivitySelectionTest {
        public static void main(String[] args) {
            ArrayList<Activity> list = new ArrayList<>();
            list.add(new Activity("a", 16,17));
            list.add(new Activity("b", 15,16));
            list.add(new Activity("c", 10,15));
            list.add(new Activity("d", 12,13));
            list.add(new Activity("e", 14,17));
            list.add(new Activity("f", 10,11));
            list.add(new Activity("g", 14,15));
            list.add(new Activity("i", 11,13));


            ActivitySelection activities = new ActivitySelection();
            activities.selectActivity(list); //с помощью жадного алгоритма ищем оптимальное заполнение зала
            //f  10->11
            //d  12->13
            //i  11->13
            //c  10->15
            //g  14->15
            //b  15->16
            //a  16->17
            //e  14->17
            //------
            //f  10->11
            //d  12->13
            //g  14->15
            //b  15->16
            //a  16->17
        }
    }
