package de.telran.lesson20240419summary;

import java.util.List;

public class RendezvousTask {

    public static void main(String[] args) throws InterruptedException {
        // Есть два потока, мы хотим обменяться данными между ними. То есть, первый поток будет ждать, когда ему придут
        // данные другого потока (и наоборот).

        Exchanger<List <Integer>> exchanger = new RealExchanger<>();

        new Thread(() -> {
            List<Integer> fromThread2 = exchanger.exchange(List.of(1,2,3,4,5,6));    //("Hello from thread 1");
            System.out.println("Received from thread 2 = " + fromThread2);
        }).start();

        Thread.sleep(1_000);

        new Thread(() -> {
            List<Integer> fromThread1 = exchanger.exchange(List.of(7,8,9,0));
            System.out.println("Received from thread 1 = " + fromThread1);
        }).start();
    }
}

interface Exchanger<T> {

    T exchange(T value);
}

class RealExchanger<T> implements Exchanger<T> {
    private T temp1;
    private T temp2;

    @Override
    public T exchange(T value) {
        synchronized (this){
            if (temp1 == null) {
                temp1 = value;
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return temp2;

            }
            else {
                temp2 = value;
                notify();
                return temp1;
            }
        }
    }
}