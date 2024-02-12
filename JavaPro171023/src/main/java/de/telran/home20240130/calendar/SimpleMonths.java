//1) Создайте класс Enum для хранения перечня месяцев в году.
//Кроме костантных значений, в нем должен также сохраняться русское наименование месяца.
//Напишите метод, который будет рекомендовать вам режим питания, в зависимости от текущего месяца и сезона года.
package de.telran.home20240130.calendar;

public class SimpleMonths {
    public static void main(String[] args) {
        Months month1 = Months.JANUARY;
        Months month2 = Months.FEBRUARY;
        Months month3 = Months.MARCH;
        Months month4 = Months.APRIL;
        Months month5 = Months.MAY;
        Months month6 = Months.JUNE;
        Months month7 = Months.JULY;
        Months month8 = Months.AUGUST;
        Months month9 = Months.SEPTEMBER;
        Months month10 = Months.OCTOBER;
        Months month11 = Months.NOVEMBER;
        Months month12 = Months.DECEMBER;
        System.out.println(month1);
        System.out.println(month2);
        System.out.println(month3);
        System.out.println(month4);
        System.out.println(month5);
        System.out.println(month6);
        System.out.println(month7);
        System.out.println(month8);
        System.out.println(month9);
        System.out.println(month10);
        System.out.println(month11);
        System.out.println(month12);
        month1.eating();
        month2.eating();
        month3.eating();
        month4.eating();
        month5.eating();
        month6.eating();
        month7.eating();
        month8.eating();
        month9.eating();
        month10.eating();
        month11.eating();
        month12.eating();
        //Months{month='Январь'}
        //Months{month='Февраль'}
        //Months{month='Март'}
        //Months{month='Апрель'}
        //Months{month='Май'}
        //Months{month='Июнь'}
        //Months{month='Июль'}
        //Months{month='Август'}
        //Months{month='Сентябрь'}
        //Months{month='Октябрь'}
        //Months{month='Ноябрь'}
        //Months{month='Декабрь'}
        //Январь: Куриная грудка
        //Февраль: Запеченная рыба
        //Март: Отварная говядина
        //Апрель: Отварной бурый рис
        //Май: Запеченная индейка
        //Июнь: Tушенные овощи
        //Июль: Рыбные котлеты
        //Август: Запеченная рыба
        //Сентябрь: Салат из овощей
        //Октябрь: Kуриная грудка
        //Ноябрь: Tушеная брокколи
        //Декабрь: Tушеная брокколи
    }

}
