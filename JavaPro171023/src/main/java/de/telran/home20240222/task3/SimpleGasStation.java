//Автозаправка. По умолчанию автомобили заправляются согласно стандартной очереди FIFO. Но автомобили скорой помощи
//всегда заправляются вне очереди.
//В час пик, общественные автобусы получают максимальный приоритет по заправке, но скорая помощь все равно более приоритетна.
//Во время стихийных бедствий (снегопад, наводнение) технологический транспорт городских служб заправляется вне очереди.
//Какую бы коллекцию Вы использовали для реализацию данного алгоритма?
//
//Напишите программу, которая бы имитировала работу.
package de.telran.home20240222.task3;

import java.util.LinkedList;

public class SimpleGasStation {
    public static void main(String[] args) {
//      1. queue by default: cars - standard, ambulance - out of queue.

        LinkedList<Transport> transportLinkedList1 = new LinkedList<>();

        transportLinkedList1.add(new Transport(TypeOfTransport.AUTO));
        transportLinkedList1.add(new Transport(TypeOfTransport.AMBULANCE));
        transportLinkedList1.add(new Transport(TypeOfTransport.PUBLIC_BUS));
        transportLinkedList1.add(new Transport(TypeOfTransport.TECHNOLOGICAL_TRANSPORT_OF_THE_CITY_SERVICE));
        System.out.println();
        System.out.println("Default: ambulance - out of turn, all others - first come first served.");
        System.out.println();
        System.out.println(transportLinkedList1);
        System.out.println();

        System.out.print("TheFirstToBeServedIs ");
        System.out.println();
        System.out.print(transportLinkedList1.peek());
        System.out.println();
        System.out.print("AlreadyServed ");
        System.out.println();
        System.out.print(transportLinkedList1.poll());
        System.out.println();


        System.out.println("RemainingVehiclesInQueue");
        System.out.println();
        System.out.println(transportLinkedList1);
        System.out.println();
//      2. queue during rush hour: cars - standard, buses - priority, ambulance - out of line.

        LinkedList<Transport> transportLinkedList2 = new LinkedList<>();
        transportLinkedList2.add(new Transport(TypeOfTransport.AUTO));
        transportLinkedList2.add(new Transport(TypeOfTransport.AMBULANCE));
        transportLinkedList2.add(new Transport(TypeOfTransport.PUBLIC_BUS));
        transportLinkedList2.add(new Transport(TypeOfTransport.TECHNOLOGICAL_TRANSPORT_OF_THE_CITY_SERVICE));

        System.out.println("During rush hour: ambulances - out of turn, buses - priority, all others - first come first served.");
        System.out.println(transportLinkedList2);


        System.out.print("TheFirstToBeServedIs");
        System.out.print(transportLinkedList2.peek());

        System.out.print("AlreadyServed");
        System.out.print(transportLinkedList2.poll());
        System.out.println();

        System.out.print("TheSecondOneWillBeServed");
        System.out.print(transportLinkedList2.peek());

        System.out.print("AlreadyServed");
        System.out.print(transportLinkedList2.poll());
        System.out.println();

        System.out.println("RemainingVehiclesInQueue");
        System.out.println(transportLinkedList2);

//      3. queue during natural disasters: cars - standard, technological transport - priority, ambulance - out of turn.

        LinkedList transportLinkedList3 = new LinkedList<>(new NaturalDisasters());
        transportLinkedList3.add(new Transport(TypeOfTransport.AUTO));
        transportLinkedList3.add(new Transport(TypeOfTransport.AMBULANCE));
        transportLinkedList3.add(new Transport(TypeOfTransport.PUBLIC_BUS));
        transportLinkedList3.add(new Transport(TypeOfTransport.TECHNOLOGICAL_TRANSPORT_OF_THE_CITY_SERVICE));

        System.out.println("During natural disasters: ambulance - out of turn, technological transport - priority, all others - first come first served.");
        System.out.println();
        System.out.println(transportLinkedList3);
        System.out.println();


        System.out.print("TheFirstToBeServedIs");
        System.out.println();
        System.out.print(transportLinkedList3.peek());
        System.out.println();

        System.out.print("AlreadyServed");
        System.out.println();
        System.out.print(transportLinkedList3.poll());
        System.out.println();

        System.out.print("TheSecondOneWillBeServed");
        System.out.println();
        System.out.print(transportLinkedList3.peek());
        System.out.println();

        System.out.print("AlreadyServed");
        System.out.println();
        System.out.print(transportLinkedList3.poll());
        System.out.println();

        System.out.println("RemainingVehiclesInQueue");
        System.out.println();
        System.out.println(transportLinkedList3);
        System.out.println();

        System.out.print("TheThirdWillBeServed");
        System.out.println();
        System.out.print(transportLinkedList3.peek());
        System.out.println();

        System.out.print("AlreadyServed");
        System.out.println();
        System.out.print(transportLinkedList3.poll());
        System.out.println();

    }
}


