package de.telran.home20240418;

import java.util.concurrent.BlockingQueue;

//Класс Разгрузчик - генерирует сообщения в очередь
public class Unloader implements Runnable {

    private final BlockingQueue<Message> queue;

    public Unloader(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            Message msg;
            Thread.sleep(1_000);
            // потребление сообщений до тех пор, пока не будет получено сообщение о выходе
            while (!(msg = queue.take()).getMsg().equals("exit")) {
                System.out.println("Перемещено разгрузчиком ");
            }
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }
    }
}
