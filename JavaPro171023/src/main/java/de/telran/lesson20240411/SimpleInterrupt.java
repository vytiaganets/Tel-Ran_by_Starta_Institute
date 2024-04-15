package de.telran.lesson20240411;

public class SimpleInterrupt {
    public static void main(String[] args)  throws InterruptedException {
        System.out.println("Main is started");
        // Создаем анонимный класс потока
        Thread t = new Thread(() ->
        {
            for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + " работает " + i + " раз");
            try {
                System.out.println(Thread.currentThread().getName() + " засыпает " + i + " раз");
                Thread.sleep(2000);//засыпает на 2 сек
                System.out.println(Thread.currentThread().getName() + " просыпается " + i + " раз");
                //
                if(Thread.interrupted()){//проверяет изнутри - проверка isInterrupted
                    // своя логика
                    System.out.println("Закрываем сами поток по просьбе, выполнялся"+i+" раз.");
                    return; // завершаем работу потока, если необходимо!
                }
            } catch (
                    InterruptedException e) {
                System.out.println("InteruptedException просыпается принудительно" + i + " раз");
                //своя логика обработки
                return;// завершаем работу потока, если необходимо!
                //throw new RuntimeException(e);
            }
        }
        });
        t.start();
        System.out.println("before isInterrupted - "+t.isInterrupted ());
        Thread.sleep(6000);
        t.interrupt();//будит поток, срывая команды sleep, wait, join
        Thread.sleep(3000);
        t.interrupt();
        // t.stop(); // запрещенная операция остановки работы потока

        System.out.println("after isInterrupted - "+t.isInterrupted ());
        System.out.println("Main закончил работу");
        //Thread-0 работает 0 раз
        //Thread-0 засыпает 0 раз
        //before isInterrupted - false
        //Thread-0 просыпается 0 раз
        //Thread-0 работает 1 раз
        //Thread-0 засыпает 1 раз
        //Thread-0 просыпается 1 раз
        //Thread-0 работает 2 раз
        //Thread-0 засыпает 2 раз
        //Thread-0 просыпается 2 раз
        //Thread-0 работает 3 раз
        //Thread-0 засыпает 3 раз
        //InteruptedException просыпается принудительно3 раз
        //Main закончил работу
        //after isInterrupted - true

//        t.wait();
//        t.join();
    }
}