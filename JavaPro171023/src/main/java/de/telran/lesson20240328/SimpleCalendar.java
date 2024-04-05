package de.telran.lesson20240328;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class SimpleCalendar {
    public static void main(String[] args) {
        Calendar calendar1 = new GregorianCalendar(); //текущая дата
        System.out.println(calendar1);
        System.out.println("calendar1 = " + calendar1.getTime());//возврат в Date

        Calendar calendar2 = Calendar.getInstance();
        System.out.println(calendar2);
        System.out.println("calendar2 = " + calendar1.getTime());//возврат в Date

        Calendar calendar3 = new GregorianCalendar(2022, Calendar.JULY, 25);
        System.out.println(calendar3.get(Calendar.MONTH));//возврат в Date
        //установка конкретного элемента
        calendar3.set(Calendar.HOUR, 11);
        calendar3.set(Calendar.MINUTE, 50);
        //получение конкретного элемента
        System.out.println(calendar3.get(Calendar.HOUR));//получение конкретного элемента HOUR
        System.out.println(calendar3.getTime());//возврат в Date
        //добавление конкретного элемента
        calendar3.add(Calendar.MONTH, 2);
        System.out.println(calendar3.get(Calendar.MONTH));

        calendar3.add(Calendar.MONTH, -4);
        System.out.println(calendar3.get(Calendar.MONTH));
        System.out.println(calendar3.getTime());//возврат в Date

        //не меняет связанные значения (не используйте)
        calendar3.roll(Calendar.MONTH, -3);
        System.out.println("calendar3 -3  MONTH " + calendar3.getTime());//Fri Feb 25 11:50:00 CET 2022
        calendar3.roll(Calendar.DAY_OF_MONTH, 10);
        System.out.println("calendar3 + 10 DAY" + calendar3.getTime());//Mon Feb 07 11:50:00 CET 2022


        // форматирование строки при выводе даты Date
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss.SSS");
        String dateStr = simpleDateFormat.format(new Date());
        System.out.println(dateStr);

        //Использовать Calendar
        simpleDateFormat = new SimpleDateFormat("dd MMMyyyy");
        dateStr = simpleDateFormat.format(calendar1.getTime());
        System.out.println(dateStr);

        Locale locale = new Locale("ru");
        simpleDateFormat = new SimpleDateFormat("dd-MMM-yy, d, D, K:m", locale);
        dateStr = simpleDateFormat.format(calendar1.getTime());
        System.out.println(dateStr);
    }
}
