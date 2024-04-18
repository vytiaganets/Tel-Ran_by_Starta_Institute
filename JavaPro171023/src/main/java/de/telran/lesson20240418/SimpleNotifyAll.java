package de.telran.lesson20240418;

public class SimpleNotifyAll {
    public static void main(String[] args) {
        System.out.println("== Главный поток стартовал");
        Message msg = new Message("обработать");

        WaiterMsg waiter1 = new WaiterMsg(msg);
        new Thread(waiter1, "waiter1").start();
        WaiterMsg waiter2 = new WaiterMsg(msg);
        new Thread(waiter2, "waiter2").start();

        Notifier notifier = new Notifier(msg);
        new Thread(notifier, "notifier").start();

        System.out.println("Все потоки стартовали!");

        System.out.println("== Главный поток закончил работы");
        //== Главный поток стартовал
        //Все потоки стартовали!
        //== Главный поток закончил работы
        //notifier стартовал.
        //waiter1 ждет сообщения (notify): 1713454915160
        //waiter2 ждет сообщения (notify): 1713454915203
        //notifier начал создавать сообщение.
        //waiter1 начинаем обрабатывать сообщение (notify): 1713454916176
        //waiter1 обработал =====> notifier  -> создал сообщение N1!
        //waiter1 закончил обрабатывать сообщение (notify): 1713454916196
        //waiter2 начинаем обрабатывать сообщение (notify): 1713454916196
        //waiter2 обработал =====> notifier  -> создал сообщение N1!
        //waiter2 закончил обрабатывать сообщение (notify): 1713454916196
    }
}
class Message {
    private String msg;

    public Message(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

class WaiterMsg implements Runnable {
    private Message msg;

    public WaiterMsg(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (msg) {
            try {
                System.out.println(name + " ждет сообщения (notify): "+System.currentTimeMillis());
                msg.wait();
                // msg.wait(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name + " начинаем обрабатывать сообщение (notify): "+System.currentTimeMillis());
            // обрабатывам сообщение
            System.out.println(name+" обработал =====> "+msg.getMsg());
            System.out.println(name + " закончил обрабатывать сообщение (notify): "+System.currentTimeMillis());
        }
    }
}

class Notifier implements Runnable {
    private Message msg;

    public Notifier(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " стартовал.");
        try {
            Thread.sleep(1000);
            synchronized (msg) {
                System.out.println(name + " начал создавать сообщение.");
                msg.setMsg(name+"  -> создал сообщение N1!");
//                msg.notify(); // один поток получит сигнал
                msg.notifyAll(); // все потоки, который в wait получат сигнал
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}