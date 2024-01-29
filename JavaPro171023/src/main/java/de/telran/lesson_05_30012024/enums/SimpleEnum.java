package de.telran.lesson_05_30012024.enums;

import javax.xml.transform.sax.SAXTransformerFactory;

public class SimpleEnum {
    public static void main(String[] args) {
        //DayOfWeekOld d1 = DayOfWeekOld.SUNDAY;
        //System.out.println(d1);
        //DayOfWeekOld d1 = new DayOfWeekOld("kjbkj");
        DayOfWeek d2 = DayOfWeek.MONDAY;
        System.out.println(d2);
        DayOfWeek d3 = DayOfWeek.SUNDAY;
        System.out.println(d3);
        d2 = DayOfWeek.SATURDAY;
        System.out.println(d2);
        //d3 = new DayOfWeek();
        switch (d3){
            case SATURDAY:
            case SUNDAY:
                System.out.println("Ура выходной!");
                break;
            default:
                System.out.println("Надо топать на работу!");

        }
        //Новый подход при работе со SWITCH
//        switch (d3) {
//            case SATURDAY, SUNDAY ->
//                    System.out.println("Ура выходной!");
//            default ->
//                    System.out.println("Надо топать на работу!");
//        }

        //values()
        for(DayOfWeek d: DayOfWeek.values()){
            System.out.println(d);
        }
        //ordinal2
        System.out.println("ordinal = " + d2.ordinal() + " " + d2.name());
        System.out.println("ordinal = " + d3.ordinal() + " " + d3.name()); //ordinal = 6 SATURDAY
                                                                            //ordinal = 0 SUNDAY
        //valueOf
        d2 = DayOfWeek.valueOf("MONDAY");//DayOfWeek.MONDAY аналог
        System.out.println(d2);//DayOfWeek{title='null'}MONDAY
        //d2 = DayOfWeek.valueOf("monday");//IllegalArgumentException нельзя MONDAY строго писать большими буквами
        //System.out.println(d2);
    }
}
