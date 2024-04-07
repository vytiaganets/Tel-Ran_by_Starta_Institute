package de.telran.algorithms20240325;

public class UnlimitedStack {
    private int[] arr;
    private int top;
    private int capacity;
    private int PERCENT_CHANGE = 100;

    public UnlimitedStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    //Переместить элементы на вершину стека.
    public void push(int x) {
        if (isFull()) {
            int[] arr1 = new int[capacity + (capacity * PERCENT_CHANGE / 100)];
            for (int i = 0; i < capacity; i++) {
                arr1[i] = arr[i];
            }
            arr = arr1;
            capacity = arr.length;
            System.out.println("Вставка: " + x);
            arr[++top] = x;
        } else {

            System.out.println("Вставка: " + x);
            arr[++top] = x;
        }
    }

    //Проверьте, заполнен ли стек.
    public boolean isFull() {
        return top == capacity - 1;
    }

    //Отображение элементов стека.
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
