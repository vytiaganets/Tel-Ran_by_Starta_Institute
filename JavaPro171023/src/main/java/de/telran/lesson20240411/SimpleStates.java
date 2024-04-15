package de.telran.lesson20240411;

public class SimpleStates {
    public static void main(String[] args) {
        //    NEW
        //    RUNNABLE
        //    TERMINATED
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("2."+getState());
            }
        };
        System.out.println("1."+thread.getState());
        thread.start();
        try {
            // Тут маленькая сложность есть только для вывода состояния TERMINATED:
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("3."+thread.getState());
    }
}
