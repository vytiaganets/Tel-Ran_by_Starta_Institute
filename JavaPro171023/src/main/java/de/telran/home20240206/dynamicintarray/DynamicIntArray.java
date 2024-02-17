package de.telran.home20240206.dynamicintarray;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;

public class DynamicIntArray {
    private final int DEFAULT_CAPACITY = 3;
    private final int PROCENT_CHANGE = 30;
    private int length = 0;
    private int capacity = DEFAULT_CAPACITY;
    private int[] arr;


    public DynamicIntArray() {
        this.capacity = DEFAULT_CAPACITY;
        arr = new int[this.capacity];
    }

    public DynamicIntArray(int capacity) {
        if (capacity >= 0) {
            this.capacity = capacity;
            arr = new int[this.capacity];
        } else {
            System.out.println("capacity error");
        }
    }

    //add(int element) - добавление элемента в конец (не забывайте про ограничения размера массива).
    public void add(int element) {
        newArr();
        int[] newArray = Arrays.copyOf(arr, arr.length + 1);
        arr = Arrays.copyOf(newArray, newArray.length);
        arr[arr.length - 1] = element;
    }

    //add(int[] elements) - добавление массива элементов в конец нашего массива(не забывайте про ограничения размера массива).
    public void add(int[] elements) {
        int[] newArray = new int[arr.length + elements.length];
        System.arraycopy(arr, 0, newArray, 0, arr.length);
        System.arraycopy(elements, 0, newArray, arr.length, elements.length);
        arr = Arrays.copyOf(newArray, newArray.length);
    }

    //insert (int index, int element) - вставка элемента в место с нужным индексом (не забывайте про ограничения размера массива и смещение элементов вправо)
    public void insert(int index, int element) {
        if (index < 0 || index > length) {
            System.out.println("insert error");
        }
        newArr();
        int[] newArray = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArray, 0, index);
        System.arraycopy(arr, index, newArray, index + 1, arr.length - index);
        newArray[index] = element;
        arr = newArray;
    }

    //delete (int index) - удаление элемента (не забывайте про смещение элементов влево при операции).
    public void delete(int index) {
        if (index < 0 || index > length) {
            System.out.println("delete error");
        }
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr = Arrays.copyOfRange(arr, 0, arr.length - 1);
    }

    //get(int index) - вернуть значение элемента по index
    public int get(int index) {
        if (index < 0 || index > length) {
            System.out.println("get error");
        }
        return arr[index];
    }
    public void newArr() {
        if (length == capacity) {
            int newCapacity = capacity + capacity * PROCENT_CHANGE / 100;
            int[] arrNew = new int[newCapacity];
            System.arraycopy(arr, 0, arrNew, 0, length);
            arr = arrNew;
            capacity = newCapacity;
        }
    }
    @Override
    public String toString() {
        return "DynamicIntArray{" +
                "DEFAULT_CAPACITY=" + DEFAULT_CAPACITY +
                ", PROCENT_CHANGE=" + PROCENT_CHANGE +
                ", length=" + length +
                ", capacity=" + capacity +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
