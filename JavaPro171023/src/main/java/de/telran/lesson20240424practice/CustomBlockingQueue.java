//3. Реализовать с помощью wait(), notify() блокирующую очередь на основе связного списка:
//- метод put (T item) добавляет предмет в очередь,
//- метод T take () извлекает предмет из очереди. Если очередь пустая, переводит поток потребителя в режим ожидания.

package de.telran.lesson20240424practice;

import java.util.LinkedList;

public class CustomBlockingQueue<T> {
    private LinkedList<T> list = new LinkedList<>();

    public synchronized void put(T t) {
        list.addLast(t);
        this.notify();
    }

    public synchronized T take() {
        while (list.isEmpty()) {
            try {
                this.wait();
            } catch (
                    InterruptedException e) {
                e.printStackTrace();
            }
        }
        return list.removeFirst();
    }

    static class Producer<String> implements Runnable {
        private CustomBlockingQueue<String> queue;

        public Producer(CustomBlockingQueue<String> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                queue.put((String) ("input " + i));
            }

        }
    }

    static class Consumer<String> implements Runnable {
        private CustomBlockingQueue<String> queue;

        public Consumer(CustomBlockingQueue<String> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                String data = queue.take();
                System.out.println(Thread.currentThread().getName() + "Consumer at work with: " + data);
                try {
                    Thread.sleep(2_000);
                } catch (
                        InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        CustomBlockingQueue<String> queue = new CustomBlockingQueue<>();
        Producer producer = new Producer<>(queue);
        Producer producer2 = new Producer<>(queue);
        Consumer consumer = new Consumer(queue);
        Consumer consumer2 = new Consumer(queue);
        new Thread(producer).start();
        new Thread(producer2).start();
        new Thread(consumer).start();
        new Thread(consumer2).start();
    }
}
