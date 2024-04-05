package de.telran.lesson20240328;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Locale;

public class SimpleData {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println("Текущая дата = " + date1);
        System.out.println("Текущая дата (Long) = " + date1.getTime());//milisecond

        Date date2 = new Date(525346746557L);
        System.out.println("Наша дата = " + date2);

        Date date3 = new Date(124, 1, 19);
        System.out.println("Введенная дата = "+date3);
        //Сравнение
        boolean fl = date1.after(date2); // date1 после date2
        System.out.println(fl);

        fl = date1.before(date2); // date1 перед date2
        System.out.println(fl);

        System.out.println("Сравнение миллисекунд = " + (date1.getTime()<=date2.getTime()));//false

//        Data date3 = new Data(); //!!!
//        date3.setTime(date1.compareTo(date2)); //присвоение

        date2.setTime(date1.getTime());

        int compare = date1.compareTo(date2);
        System.out.println("date1.compareTo(date2) = "+compare);

        System.out.println("date1.equals(date2) = "+date1.equals(date2));

        System.out.println("Время в милисекундах = "+date1.getTime());
        System.out.println();

        Locale locale = new Locale("de"); //украинская локализация uk // de, ru, en
        Locale.setDefault(locale);
        Date now = new Date();
        String date = String.format(locale, "%tc\n", now) + // длинная строка
                String.format(locale, "%tD\n", now) + //(MM/DD/YY)
                String.format(locale, "%tF\n", now) + //(YYYY-MM-DD)
                String.format(locale, "%tr\n", now) + //Full 12-hour time
                String.format(locale, "%tz\n", now) + //Time zone GMT offset
                String.format(locale, "%tZ\n", now);//Localized time zone abbreviation

        System.out.println(date);
        //Max Date
        Date dateMax = new Date(Long.MAX_VALUE);
        System.out.println("Наша дата = " + dateMax);
    }
}
