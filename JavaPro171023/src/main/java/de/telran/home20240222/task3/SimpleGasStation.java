//Автозаправка. По умолчанию автомобили заправляются согласно стандартной очереди FIFO. Но автомобили скорой помощи
//всегда заправляются вне очереди.
//В час пик, общественные автобусы получают максимальный приоритет по заправке, но скорая помощь все равно более приоритетна.
//Во время стихийных бедствий (снегопад, наводнение) технологический транспорт городских служб заправляется вне очереди.
//Какую бы коллекцию Вы использовали для реализацию данного алгоритма?
//
//Напишите программу, которая бы имитировала работу.
package de.telran.home20240222.task3;

import java.util.PriorityQueue;

public class SimpleGasStation {
    public static void main(String[] args) {
//      1. queue by default: cars - standard, ambulance - out of queue.
        System.out.println("===========DEFAULT QUEUE===========");
        PriorityQueue<Transport> transportPriorityQueue1 = new PriorityQueue<>();

        transportPriorityQueue1.add(new Transport(TypeOfTransport.AUTO));
        transportPriorityQueue1.add(new Transport(TypeOfTransport.AMBULANCE));
        transportPriorityQueue1.add(new Transport(TypeOfTransport.PUBLIC_BUS));
        transportPriorityQueue1.add(new Transport(TypeOfTransport.TECHNOLOGICAL_TRANSPORT_OF_THE_CITY_SERVICE));
        System.out.println();
        System.out.println("Default: ambulance - out of turn, all others - first come first served.");
        System.out.println();
        System.out.println(transportPriorityQueue1);
        System.out.println();

        System.out.print("TheFirstToBeServedIs ");
        System.out.println();
        System.out.print(transportPriorityQueue1.peek());
        System.out.println();
        System.out.print("AlreadyServed ");
        System.out.println();
        System.out.print(transportPriorityQueue1.poll());
        System.out.println();


        System.out.println("RemainingVehiclesInQueue");
        System.out.println();
        System.out.println(transportPriorityQueue1);
        System.out.println();
        //Default: ambulance - out of turn, all others - first come first served.
        //
        //[Transport{TypeOfTransport=ambulance, priorityLevel=1}, Transport{TypeOfTransport=auto, priorityLevel=4}, Transport{TypeOfTransport=public bus, priorityLevel=4}, Transport{TypeOfTransport=technological transport of the city service, priorityLevel=4}]
        //
        //TheFirstToBeServedIs
        //Transport{TypeOfTransport=ambulance, priorityLevel=1}
        //AlreadyServed
        //Transport{TypeOfTransport=ambulance, priorityLevel=1}
        //RemainingVehiclesInQueue
        //
        //[Transport{TypeOfTransport=technological transport of the city service, priorityLevel=4}, Transport{TypeOfTransport=auto, priorityLevel=4}, Transport{TypeOfTransport=public bus, priorityLevel=4}]
//      2. queue during rush hour: cars - standard, buses - priority, ambulance - out of line.
        System.out.println("===========QUEUE AT RUSH HOUR===========");
        PriorityQueue<Transport> transportPriorityQueue2 = new PriorityQueue<>();
        transportPriorityQueue2.add(new Transport(TypeOfTransport.AUTO));
        transportPriorityQueue2.add(new Transport(TypeOfTransport.AMBULANCE));
        transportPriorityQueue2.add(new Transport(TypeOfTransport.PUBLIC_BUS));
        transportPriorityQueue2.add(new Transport(TypeOfTransport.TECHNOLOGICAL_TRANSPORT_OF_THE_CITY_SERVICE));

        System.out.println("During rush hour: ambulances - out of turn, buses - priority, all others - first come first served.");
        System.out.println(transportPriorityQueue2);


        System.out.print("TheFirstToBeServedIs");
        System.out.print(transportPriorityQueue2.peek());

        System.out.print("AlreadyServed");
        System.out.print(transportPriorityQueue2.poll());
        System.out.println();

        System.out.print("TheSecondOneWillBeServed");
        System.out.print(transportPriorityQueue2.peek());

        System.out.print("AlreadyServed");
        System.out.print(transportPriorityQueue2.poll());
        System.out.println();

        System.out.println("RemainingVehiclesInQueue");
        System.out.println(transportPriorityQueue2);
        //During rush hour: ambulances - out of turn, buses - priority, all others - first come first served.
        //[Transport{TypeOfTransport=ambulance, priorityLevel=1}, Transport{TypeOfTransport=auto, priorityLevel=4}, Transport{TypeOfTransport=public bus, priorityLevel=4}, Transport{TypeOfTransport=technological transport of the city service, priorityLevel=4}]
        //TheFirstToBeServedIsTransport{TypeOfTransport=ambulance, priorityLevel=1}AlreadyServedTransport{TypeOfTransport=ambulance, priorityLevel=1}
        //TheSecondOneWillBeServedTransport{TypeOfTransport=technological transport of the city service, priorityLevel=4}AlreadyServedTransport{TypeOfTransport=technological transport of the city service, priorityLevel=4}
        //RemainingVehiclesInQueue
        //[Transport{TypeOfTransport=public bus, priorityLevel=4}, Transport{TypeOfTransport=auto, priorityLevel=4}]

//      3. queue during natural disasters: cars - standard, technological transport - priority, ambulance - out of turn.
        System.out.println("===========QUEUE DURING NATURAL DISASTERS===========");
        PriorityQueue<Transport> transportPriorityQueue3 = new PriorityQueue<>();
        transportPriorityQueue3.add(new Transport(TypeOfTransport.AUTO));
        transportPriorityQueue3.add(new Transport(TypeOfTransport.AMBULANCE));
        transportPriorityQueue3.add(new Transport(TypeOfTransport.PUBLIC_BUS));
        transportPriorityQueue3.add(new Transport(TypeOfTransport.TECHNOLOGICAL_TRANSPORT_OF_THE_CITY_SERVICE));

        System.out.println("During natural disasters: ambulance - out of turn, technological transport - priority, all others - first come first served.");
        System.out.println();
        System.out.println(transportPriorityQueue3);
        System.out.println();


        System.out.print("TheFirstToBeServedIs");
        System.out.println();
        System.out.print(transportPriorityQueue3.peek());
        System.out.println();

        System.out.print("AlreadyServed");
        System.out.println();
        System.out.print(transportPriorityQueue3.poll());
        System.out.println();

        System.out.print("TheSecondOneWillBeServed");
        System.out.println();
        System.out.print(transportPriorityQueue3.peek());
        System.out.println();

        System.out.print("AlreadyServed");
        System.out.println();
        System.out.print(transportPriorityQueue3.poll());
        System.out.println();

        System.out.println("RemainingVehiclesInQueue");
        System.out.println();
        System.out.println(transportPriorityQueue3);
        System.out.println();

        System.out.print("TheThirdWillBeServed");
        System.out.println();
        System.out.print(transportPriorityQueue3.peek());
        System.out.println();

        System.out.print("AlreadyServed");
        System.out.println();
        System.out.print(transportPriorityQueue3.poll());
        System.out.println();
        //During natural disasters: ambulance - out of turn, technological transport - priority, all others - first come first served.
        //
        //[Transport{TypeOfTransport=ambulance, priorityLevel=1}, Transport{TypeOfTransport=auto, priorityLevel=4}, Transport{TypeOfTransport=public bus, priorityLevel=4}, Transport{TypeOfTransport=technological transport of the city service, priorityLevel=4}]
        //
        //TheFirstToBeServedIs
        //Transport{TypeOfTransport=ambulance, priorityLevel=1}
        //AlreadyServed
        //Transport{TypeOfTransport=ambulance, priorityLevel=1}
        //TheSecondOneWillBeServed
        //Transport{TypeOfTransport=technological transport of the city service, priorityLevel=4}
        //AlreadyServed
        //Transport{TypeOfTransport=technological transport of the city service, priorityLevel=4}
        //RemainingVehiclesInQueue
        //
        //[Transport{TypeOfTransport=public bus, priorityLevel=4}, Transport{TypeOfTransport=auto, priorityLevel=4}]
        //
        //TheThirdWillBeServed
        //Transport{TypeOfTransport=public bus, priorityLevel=4}
        //AlreadyServed
        //Transport{TypeOfTransport=public bus, priorityLevel=4}
    }
}


