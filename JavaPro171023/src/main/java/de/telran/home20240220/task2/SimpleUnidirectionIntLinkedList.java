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

public class SimpleUnidirectionIntLinkedList {
    public static void main(String[] args) {

        UnidirectionIntLinkedList unidirectionIntLinkedList = new UnidirectionIntLinkedList();

        unidirectionIntLinkedList.add(5);
        unidirectionIntLinkedList.add(4);
        unidirectionIntLinkedList.add(7);
        unidirectionIntLinkedList.add(2);
        unidirectionIntLinkedList.add(6);
        System.out.println("add(item)");
        System.out.println(unidirectionIntLinkedList);
        System.out.println();

        unidirectionIntLinkedList.add(1,8);
        System.out.println("add(index, item)");
        System.out.println(unidirectionIntLinkedList);
        System.out.println();

        unidirectionIntLinkedList.addFirst(3);
        System.out.println("addFirst(item)");
        System.out.println(unidirectionIntLinkedList);
        System.out.println();

        unidirectionIntLinkedList.addLast(3);
        System.out.println("addLast(item)");
        System.out.println(unidirectionIntLinkedList);
        System.out.println();

        System.out.println("get(index)");
        System.out.println(unidirectionIntLinkedList.get(3));
        System.out.println();

        unidirectionIntLinkedList.set(1, 7);
        System.out.println("set(index, item)");
        System.out.println(unidirectionIntLinkedList);
        System.out.println();

        System.out.println("remove(index)");
        System.out.println(unidirectionIntLinkedList.remove(0));
        System.out.println(unidirectionIntLinkedList);
        System.out.println();

        System.out.println("removeFirst()");
        unidirectionIntLinkedList.removeFirst();
        System.out.println(unidirectionIntLinkedList);
        System.out.println();

        System.out.println("removeLast()");
        unidirectionIntLinkedList.removeLast();
        System.out.println(unidirectionIntLinkedList);
        System.out.println();

        System.out.println("int indexOf(int item)");
        System.out.println(unidirectionIntLinkedList.indexOf(5));
        System.out.println(unidirectionIntLinkedList.indexOf(7));
        System.out.println();

        System.out.println("boolean contains(int item)");
        System.out.println(unidirectionIntLinkedList.contains(7));
        System.out.println(unidirectionIntLinkedList.contains(6));
        System.out.println();

        System.out.println("clear()");
        unidirectionIntLinkedList.clear();
        System.out.println(unidirectionIntLinkedList);
        System.out.println();

        System.out.println("boolean isEmpty()");
        System.out.println(unidirectionIntLinkedList.isEmpty());
//add(item)
//UnidirectionIntLinkedList: { listSize: 5, nodes: [ 5, 4, 7, 2, 6, ] }
//
//add(index, item)
//UnidirectionIntLinkedList: { listSize: 6, nodes: [ 5, 8, 4, 7, 2, 6, ] }
//
//addFirst(item)
//UnidirectionIntLinkedList: { listSize: 7, nodes: [ 3, 5, 8, 4, 7, 2, 6, ] }
//
//addLast(item)
//UnidirectionIntLinkedList: { listSize: 8, nodes: [ 3, 5, 8, 4, 7, 2, 6, 3, ] }
//
//get(index)
//4
//
//set(index, item)
//UnidirectionIntLinkedList: { listSize: 8, nodes: [ 3, 7, 8, 4, 7, 2, 6, 3, ] }
//
//remove(index)
//3
//UnidirectionIntLinkedList: { listSize: 7, nodes: [ 7, 8, 4, 7, 2, 6, 3, ] }
//
//removeFirst()
//UnidirectionIntLinkedList: { listSize: 6, nodes: [ 8, 4, 7, 2, 6, 3, ] }
//
//removeLast()
//UnidirectionIntLinkedList: { listSize: 5, nodes: [ 8, 4, 7, 2, 6, ] }
//
//int indexOf(int item)
//The element is not present in the list.
//-1
//2
//
//boolean contains(int item)
//true
//false
//
//clear()
//UnidirectionIntLinkedList: { listSize: 0, nodes: [ ] }
//
//boolean isEmpty()
//true
    }
}
