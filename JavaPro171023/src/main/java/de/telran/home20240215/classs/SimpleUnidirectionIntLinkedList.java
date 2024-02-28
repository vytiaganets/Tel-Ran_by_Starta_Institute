//Реализуйте класс UnidirectionIntLinkedList, в есть следующие характериcтики:
//int size; (текущий размер списка)
//Node (структура для хранения первого элемента списка)
//В классе Node инкапсулированы характеристики:
//int item; (для хранения данных)
//
//В классе UnidirectionIntLinkedList реализовать следующие методы:
//add(int): этот метод используется для добавления элемента в конец !!! списка.
//add(index, int): этот метод используется для добавления элемента по определенному индексу !!! в список.
//addFirst(int значение): добавляет элемент в начало списка.
//addLast(int значение): добавляет элемент в конец списка.
//int get(int index): получить элемент по index.
//int set(int index, int значение): установить значение элемента по index.
//int remove(int index): удалить элемент со списка, возвратить значение удаленного элемента
//removeFirst(): удалить элемент с начала списка.
//removeLast(): удалить элемент с конца списка.
//int indexOf(int значение): вернуть индекс первого вхождение элемента со значением
//bool contains(int значение): вернуть true, если значение есть в списке
//void clear(): очистить список
package de.telran.home20240215.classs;

public class SimpleUnidirectionIntLinkedList {
    public static void main(String[] args) {

        UnidirectionIntLinkedList UnidirectionIntLinkedList = new UnidirectionIntLinkedList();

        UnidirectionIntLinkedList.add(5);
        UnidirectionIntLinkedList.add(4);
        UnidirectionIntLinkedList.add(7);
        UnidirectionIntLinkedList.add(2);
        UnidirectionIntLinkedList.add(6);
        System.out.println("add(item)");
        System.out.println(UnidirectionIntLinkedList);
        System.out.println();

        UnidirectionIntLinkedList.add(1,8);
        System.out.println("add(index, item)");
        System.out.println(UnidirectionIntLinkedList);
        System.out.println();

        UnidirectionIntLinkedList.addFirst(10);
        System.out.println("addFirst(item)");
        System.out.println(UnidirectionIntLinkedList);
        System.out.println();

        UnidirectionIntLinkedList.addLast(3);
        System.out.println("addLast(item)");
        System.out.println(UnidirectionIntLinkedList);
        System.out.println();

        System.out.println("get(index)");
        System.out.println(UnidirectionIntLinkedList.get(2));
        System.out.println();

        UnidirectionIntLinkedList.set(3, 9);
        System.out.println("set(index, item)");
        System.out.println(UnidirectionIntLinkedList);
        System.out.println();

        System.out.println("remove(index)");
        System.out.println(UnidirectionIntLinkedList.remove(0));
        System.out.println(UnidirectionIntLinkedList);
        System.out.println();

        System.out.println("removeFirst()");
        UnidirectionIntLinkedList.removeFirst();
        System.out.println(UnidirectionIntLinkedList);
        System.out.println();

        System.out.println("removeLast()");
        UnidirectionIntLinkedList.removeLast();
        System.out.println(UnidirectionIntLinkedList);
        System.out.println();

        System.out.println("int indexOf(int item)");
        System.out.println(UnidirectionIntLinkedList.indexOf(7));
        System.out.println(UnidirectionIntLinkedList.indexOf(5));
        System.out.println();

        System.out.println("boolean contains(int item)");
        System.out.println(UnidirectionIntLinkedList.contains(5));
        System.out.println(UnidirectionIntLinkedList.contains(7));
        System.out.println();

        System.out.println("clear()");
        UnidirectionIntLinkedList.clear();
        System.out.println(UnidirectionIntLinkedList);
        System.out.println();

        System.out.println("boolean isEmpty()");
        System.out.println(UnidirectionIntLinkedList.isEmpty());

//add(item)
//UnidirectionIntLinkedList: { size: 5, nodes: [ 5, 4, 7, 2, 6, ] }
//
//add(index, item)
//UnidirectionIntLinkedList: { size: 6, nodes: [ 5, 8, 4, 7, 2, 6, ] }
//
//addFirst(item)
//UnidirectionIntLinkedList: { size: 7, nodes: [ 10, 5, 8, 4, 7, 2, 6, ] }
//
//addLast(item)
//UnidirectionIntLinkedList: { size: 8, nodes: [ 10, 5, 8, 4, 7, 2, 6, 3, ] }
//
//get(index)
//8
//
//set(index, item)
//UnidirectionIntLinkedList: { size: 8, nodes: [ 10, 5, 8, 9, 7, 2, 6, 3, ] }
//
//remove(index)
//10
//UnidirectionIntLinkedList: { size: 7, nodes: [ 5, 8, 9, 7, 2, 6, 3, ] }
//
//removeFirst()
//UnidirectionIntLinkedList: { size: 6, nodes: [ 8, 9, 7, 2, 6, 3, ] }
//
//removeLast()
//UnidirectionIntLinkedList: { size: 5, nodes: [ 8, 9, 7, 2, 6, ] }
//
//int indexOf(int item)
//2
//The element is not present in the list.
//-1
//
//boolean contains(int item)
//false
//true
//
//clear()
//UnidirectionIntLinkedList: { size: 0, nodes: [ ] }
//
//boolean isEmpty()
//true


    }
}
