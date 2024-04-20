//1. У вас есть стол, на который один робоманипулятор кладет деталь, а второй забирает эту деталь.
//Когда Робот1 положит деталь на стол, он должен обязательно ждать, пока Робот2 заберет эту деталь и только тогда класть следующую. Постройте программу, которая автоматизирует эту работу.
//Количество деталей, которые должны обработать манипуляторы, пользователь задает с клавиатуры.
//1. You have a table on which one robotic arm places a part, and the second one picks up this part.
//When Robot1 puts a part on the table, it must wait until Robot2 picks up this part and only then put the next one. Build a program that automates this work.
//The user sets the number of parts that the manipulators must process using the keyboard.
package de.telran.home20240418;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of details:");
        int detailQuantity = sc.nextInt();

        List<Detail> table = new ArrayList<>();

        RobotSetter setter = new RobotSetter(table, detailQuantity);
        RobotGetter getter = new RobotGetter(table, detailQuantity);
        Thread tr1 = new Thread(setter);
        Thread tr2 = new Thread(getter);
        tr1.start();
        tr2.start();

        try {
            tr1.join();
            tr2.join();
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("End of the working day!");
        //Robot Setter placed detail no.1
        //Robot Getter took detail no.1
        //Robot Setter placed detail no.2
        //Robot Getter took detail no.2
        //Robot Setter placed detail no.3
        //Robot Getter took detail no.3
        //Robot Setter placed detail no.4
        //Robot Getter took detail no.4
        //Robot Setter placed detail no.5
        //Robot Getter took detail no.5
        //End of the working day!
    }
}


class Detail {
    private static int id;
    private final int num;

    public Detail() {
        this.num = ++id;
    }

    public int getNum() {
        return num;
    }
}


class RobotSetter implements Runnable {

    private final List<Detail> table;
    private int detailQuantity;

    public RobotSetter(List<Detail> table, int detailQuantity) {
        this.table = table;
        this.detailQuantity = detailQuantity;
    }

    @Override
    public void run() {
        while (this.detailQuantity != 0) {
            while (table.isEmpty()) {
                synchronized (table) {
                    Detail currentDetail = new Detail();
                    table.add(currentDetail);
                    System.out.println("Robot Setter placed detail no." + currentDetail.getNum());
                    this.detailQuantity--;
                }
            }
        }
    }
}


class RobotGetter implements Runnable {
    private final List<Detail> table;
    private int detailQuantity;

    public RobotGetter(List<Detail> table, int detailQuantity) {
        this.table = table;
        this.detailQuantity = detailQuantity;
    }

    @Override
    public void run() {
        while (this.detailQuantity != 0) {
            while (table.size() == 1) {
                synchronized (table) {
                    Detail currentDetail = table.get(table.size() - 1);//
                    table.remove(0);
                    System.out.println("Robot Getter took detail no." + currentDetail.getNum());
                    this.detailQuantity--;
                }
            }
        }
    }
}