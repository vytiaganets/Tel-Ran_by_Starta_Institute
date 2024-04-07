package de.telran.algorithms20240325;

public class SpecialQueue {
    private int[] arr;      //массив для сохранения элементов в очередь
    private int head;       //head — это точка на первый элемент очереди
    private int tail;       //хвост — это точка конца элемента очереди
    private int capacity;   //максимальная емкость очередей
    private int count;      //текущий размер очереди

    public SpecialQueue(int size) {
        arr = new int[size];
        capacity = size;
        head = 0;
        tail = -1;
        count = 0;
    }


    //Нажмите элемент в конец очереди. Данные параметра — это элемент для вставки.
    public void pushToEnd(int data) {
        if (size() == capacity) {
            System.out.println("Переполнение очереди, удаление ненужных элементов: ");
            return;
        }

        tail++;
        // tail = (tail + 1) % capacity;
        arr[tail] = data;
        count++;
        System.out.println("Успех: " + data + " добавлен в очередь");
    }

    //Удалить элемент из начала очереди и вернуть его. Уменьшение размера очереди на единицу.
    public int removeFromHead() {
        if (isEmpty()) {
            System.out.println("Нет элементов в очереди");
            return -1;
        }

        int element = arr[head];
        moveQueue();
        count--;
        return element;
    }

    private void moveQueue() {
        for (int i = 1; i <= count; i++) {
            arr[i - 1] = arr[i];
        }
    }


    //Вернуть элемент в начало очереди, не удаляя его. Возвращает элемент из очереди.
    public int peekFromHead() {
        if (isEmpty()) {
            System.out.println("Нет элементов в очереди");
            return -1;
        }

        return arr[head];
    }

    public int getMax() {
        if (isEmpty()) {
            System.out.println("Нет элементов в очереди");
            return -1;
        }
        int max = arr[0];
        for (int i = 1; i <= count; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }


    //Проверяет, пуста ли очередь или нет. Возвращает логическое значение.
    public boolean isEmpty() {
        return size() == 0;
    }

    //Возвращает общее количество элементов, присутствующих в очереди. Возвращает текущий размер очереди.
    public int size() {
        return count;
    }

    public void printQueue() {
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println();
    }
}
