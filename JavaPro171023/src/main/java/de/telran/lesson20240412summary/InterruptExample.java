package de.telran.lesson20240412summary;

public class InterruptExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            //while (!Thread.currentThread().isInterrupted()) {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (
                        InterruptedException e) {
                    Thread .currentThread () . interrupt ();
                    //System.out.println("Thread was interrupted");
                    System.out.println("Thread was interrupted, is interrupted = " + Thread.currentThread().isInterrupted ());
                    return;
                }
                System.out.println("Iteration");
                }
            });
            thread.start();
            thread.sleep( 4000);
            //thread.interrupt();
            System.out.println("My Thread was interrupted");

        }
    }
    //private volatile static boolean flag = false;
//public static void main(String[] args) throws InterruptedException
//Thread thread = new Thread(O) -> {
//while (!flag) {
//}
//});
//thread.start();
//Thread. sleep( millis: 10000);
//flag = true;
//System.out.printin ("My Thread was interrupted");
//thread.interrupt;
//}
//}