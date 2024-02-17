//У вас есть класс DynamicIntArray. Внутри него есть 3 характеристики:
//int lenght(реальный размер хранимых данных),
//int capacity(размер массива),
//массив int размером capacity (arr[capacity]),
//константы:
//начальный размер массива по умолчанию (DEFAULT_CAPACITY),
//% изменения размера массива при автоматическом увеличениию (PROCENT_CHANGE).
//Реализуйте 2 конструктора:
//по умолчанию (создается массив arr размером DEFAULT_CAPACITY)
//с параметром capacity (создается массив arr размер которого передается параметром  capacity).
//Реализуйте методы:
//add(int element) - добавление элемента в конец (не забывайте про ограничения размера массива).
//add(int[] elements) - добавление массива элементов в конец нашего массива(не забывайте про ограничения размера массива).
//insert (int index, int element) - вставка элемента в место с нужным индексом (не забывайте про ограничения размера массива и смещение элементов вправо)
//delete (int index) - удаление элемента (не забывайте про смещение элементов влево при операции).
//get(int index) - вернуть значение элемента по index
package de.telran.home20240206.dynamicintarray;

public class SimpleDynamicIntArray {
    public static void main(String[] args) {
        DynamicIntArray dynamicIntArray = new DynamicIntArray();
        dynamicIntArray.add(1);
        dynamicIntArray.add(2);
        dynamicIntArray.add(3);
        System.out.println("dynamicIntArray.get: " + dynamicIntArray.get(1));//0
        System.out.println("dynamicIntArray: " + dynamicIntArray);
        DynamicIntArray dynamicIntArray2 = new DynamicIntArray(3);
        int[] elements = {1,2,3};
        dynamicIntArray2.add(elements);
        System.out.println("dynamicIntArray2: " + dynamicIntArray2);
        dynamicIntArray2.insert(1,2);
        System.out.println("dynamicIntArray2.insert: " + dynamicIntArray2);
        dynamicIntArray2.delete(2);
        System.out.println("dynamicIntArray2.delete: " + dynamicIntArray2);
//dynamicIntArray.get: 0
//dynamicIntArray: DynamicIntArray{DEFAULT_CAPACITY=3, PROCENT_CHANGE=30, length=0, capacity=3, arr=[0, 0, 0, 1, 2, 3]}
//dynamicIntArray2: DynamicIntArray{DEFAULT_CAPACITY=3, PROCENT_CHANGE=30, length=0, capacity=3, arr=[0, 0, 0, 1, 2, 3]}
//dynamicIntArray2.insert: DynamicIntArray{DEFAULT_CAPACITY=3, PROCENT_CHANGE=30, length=0, capacity=3, arr=[0, 2, 0, 0, 1, 2, 3]}
//dynamicIntArray2.delete: DynamicIntArray{DEFAULT_CAPACITY=3, PROCENT_CHANGE=30, length=0, capacity=3, arr=[0, 2, 0, 1, 2, 3]}
    }
}
