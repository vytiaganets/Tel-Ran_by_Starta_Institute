//Реализуйте задачу 1 из прошлого ДЗ, используя интерфейс Comparable.
//Напомню задание:
//Вы пришли в отделение банка, в котором обслуживание ведется строго по талончикам, который Вы получаете в автомате при входе.
//При регистрации, Вы обязательно указываете ФИО, год рождения, тип операции который Вам необходимо выполнить в отделении (например
//Консультация, Получение денежных средств, Вложение средств, Открытие депозита, Коммунальные платежи).
//После регистрации - вы получаете номер талончика.
//Обслуживание в банке ведется строго по номеру талончика в порядке их возрастания.
//Создать множество, которое будет обслуживать класс Ticket.
//Сымитируйте работу отделения банка.
//English
//Implement task 1 from the past remote control using the Comparable interface.
//Let me remind you of the task:
//You have come to a bank branch, where service is strictly based on coupons, which you receive from a machine at the entrance.
//When registering, you must indicate your full name, year of birth, and the type of operation you need to perform in the department (for example
//Consultation, Receiving funds, Investing funds, Opening a deposit, Utility payments).
//After registration, you receive a coupon number.
//Service at the bank is carried out strictly according to the coupon number in ascending order.
//Create a set that will serve the Ticket class.
//Simulate the operation of a bank branch.
package de.telran.home20240220.task2;

public class RunOneDirectionIntLinkedList {
    public static void main(String[] args) {

        OneDirectionIntLinkedList oneDirectionIntLinkedList = new OneDirectionIntLinkedList();

        oneDirectionIntLinkedList.add(5);
        oneDirectionIntLinkedList.add(4);
        oneDirectionIntLinkedList.add(7);
        oneDirectionIntLinkedList.add(2);
        oneDirectionIntLinkedList.add(6);
        System.out.println("add(item)");
        System.out.println(oneDirectionIntLinkedList);
        System.out.println();

        oneDirectionIntLinkedList.add(1,8);
        System.out.println("add(index, item)");
        System.out.println(oneDirectionIntLinkedList);
        System.out.println();

        oneDirectionIntLinkedList.addFirst(10);
        System.out.println("addFirst(item)");
        System.out.println(oneDirectionIntLinkedList);
        System.out.println();

        oneDirectionIntLinkedList.addLast(3);
        System.out.println("addLast(item)");
        System.out.println(oneDirectionIntLinkedList);
        System.out.println();

        System.out.println("get(index)");
        System.out.println(oneDirectionIntLinkedList.get(2));
        System.out.println();

        oneDirectionIntLinkedList.set(3, 9);
        System.out.println("set(index, item)");
        System.out.println(oneDirectionIntLinkedList);
        System.out.println();

        System.out.println("remove(index)");
        System.out.println(oneDirectionIntLinkedList.remove(0));
        System.out.println(oneDirectionIntLinkedList);
        System.out.println();

        System.out.println("removeFirst()");
        oneDirectionIntLinkedList.removeFirst();
        System.out.println(oneDirectionIntLinkedList);
        System.out.println();

        System.out.println("removeLast()");
        oneDirectionIntLinkedList.removeLast();
        System.out.println(oneDirectionIntLinkedList);
        System.out.println();

        System.out.println("int indexOf(int item)");
        System.out.println(oneDirectionIntLinkedList.indexOf(7));
        System.out.println(oneDirectionIntLinkedList.indexOf(5));
        System.out.println();

        System.out.println("boolean contains(int item)");
        System.out.println(oneDirectionIntLinkedList.contains(5));
        System.out.println(oneDirectionIntLinkedList.contains(7));
        System.out.println();

        System.out.println("clear()");
        oneDirectionIntLinkedList.clear();
        System.out.println(oneDirectionIntLinkedList);
        System.out.println();

        System.out.println("boolean isEmpty()");
        System.out.println(oneDirectionIntLinkedList.isEmpty());


    }
}
