package de.telran.lesson20240222;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {
    public static void main(String[] args) {
        //add info
        Queue<String> queue1 = new LinkedList<>();
        //System.out.println(queue1.peek());//null
        //System.out.println(queue1);
        //System.out.println(queue1.element());//error
        //System.out.println(queue1);
        //add info
        queue1.add("Вася");
        queue1.add("Петя");
        queue1.add("Валя");
        queue1.add("Миша");
        queue1.add("Алена");
        //System.out.println(queue1);

        //System.out.println(queue1.remove());
        //System.out.println(queue1);
        //методы Queue

        //[Вася, Петя, Валя, Миша, Алена]
        //Вася
        //[Петя, Валя, Миша, Алена]
        queue1.offer("Гриша");//добавляем
        System.out.println(queue1);//[Вася, Петя, Валя, Миша, Алена, Гриша]

        System.out.println(queue1.poll());//Вася извлекаем
        System.out.println(queue1);//[Петя, Валя, Миша, Алена, Гриша]

        System.out.println(queue1.peek());//Петя подсмотреть анализ ошибок через возвращаемое значение
        System.out.println(queue1);//[Петя, Валя, Миша, Алена, Гриша]

        System.out.println(queue1.element());//Петя подсмотреть Exception
        System.out.println(queue1);//[Петя, Валя, Миша, Алена, Гриша]
        //вывод
        //add, remove, element - Exception
        //offer, poll, peek - анализ  ошибок по возвращаемому значению из метода

    }

}
