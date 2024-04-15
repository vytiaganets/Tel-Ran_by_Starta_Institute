package de.telran.lesson20240411;

public class SimpleDaemons {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main - начал работу");
        for (int i = 0; i < 3; i++) {
            Thread t = new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    System.out.println(Thread.currentThread().getName() + " работает " + j + " раз");
                    try {
                        Thread.sleep(500);
                    } catch (
                            InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            //if(i%2==0){

            t.setDaemon(true);
            //}
            t.start();
            //
//        for (int i = 0; i < 3; i++) {
//           MyThread t1 = new MyThread();
////           t1.setDaemon(false);
//           t1.start();
        }
        Thread.sleep(3000);
        System.out.println("Main - закончил работу");
        //Main - начал работу
        //Main - начал работу
        //Main - начал работу
        //Main - начал работу
        //Thread-2 работает 0 раз
        //Thread-3 работает 0 раз
        //Thread-1 работает 0 раз
        //Thread-0 работает 0 раз
        //Main - начал работу
        //Thread-4 работает 0 раз
        //Thread-2 работает 1 раз
        //Thread-3 работает 1 раз
        //Thread-0 работает 1 раз
        //Thread-1 работает 1 раз
        //Thread-4 работает 1 раз
        //Thread-0 работает 2 раз
        //Thread-2 работает 2 раз
        //Thread-3 работает 2 раз
        //Thread-1 работает 2 раз
        //Thread-4 работает 2 раз
        //Thread-0 работает 3 раз
        //Thread-1 работает 3 раз
        //Thread-3 работает 3 раз
        //Thread-2 работает 3 раз
        //Thread-4 работает 3 раз
        //Thread-0 работает 4 раз
        //Thread-3 работает 4 раз
        //Thread-2 работает 4 раз
        //Thread-1 работает 4 раз
        //Thread-4 работает 4 раз
        //Thread-0 работает 5 раз
        //Thread-3 работает 5 раз
        //Thread-2 работает 5 раз
        //Thread-1 работает 5 раз
        //Thread-4 работает 5 раз
        //Main - закончил работу
    }

    class MyThread extends Thread {
        public void run() {

            for (int j = 0; j < 10; j++) {
                System.out.println(Thread.currentThread().getName() + " работает " + j + " раз");
                try {
                    Thread.sleep(500);
                } catch (
                        InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println("End Task -> " + Thread.currentThread().getName());
        }

    }
}