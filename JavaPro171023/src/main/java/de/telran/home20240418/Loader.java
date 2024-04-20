package de.telran.home20240418;

import java.util.concurrent.BlockingQueue;

//    Класс Погрузчик - забирает сообщения из очереди - самостоятельно на 1 минуту
//
//        класс Погрузчик, который будет монитором сообщений в очереди,
//        при входящем сообщении "exit" заканчивает работу.
public class Loader implements Runnable {// Loader Погрузчик

    private final BlockingQueue<Message> queue;

    public Loader(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            Message msg = new Message(" " + i);
            try {
                Thread.sleep(i * 100);
                queue.put(msg);

                System.out.println("Перемещено погрузчиком " + Thread.currentThread().getName());
            } catch (
                    InterruptedException e) {
                e.printStackTrace();
            }

        }
        //добавляем сообщение о выходе
        Message msg = new Message("exit");
        try {
            queue.put(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}