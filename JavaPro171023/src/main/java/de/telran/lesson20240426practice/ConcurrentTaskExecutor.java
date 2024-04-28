package de.telran.lesson20240426practice;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ConcurrentTaskExecutor implements TaskExecutor {

    private final BlockingQueue<Runnable> blockingQueue;
    private final int countThread;
    private volatile boolean isShutdown;

    public ConcurrentTaskExecutor(BlockingQueue<Runnable> blockingQueue, int countThread) {
        this.blockingQueue = blockingQueue;
        this.countThread = countThread;
        for (int i = 0; i < countThread; i++) {
            new Thread(() -> {
                while (true) {
                    try {
                        Runnable task = blockingQueue.poll(1, TimeUnit.SECONDS);
                        if (task != null) {
                            task.run();
                        } else {
                            if(isShutdown){
                                return;
                            }
                        }
                    } catch (
                            InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();
        }
    }

    public ConcurrentTaskExecutor() {
        this(new LinkedBlockingQueue<>(), 16);
    }

    @Override
    public void submit(Runnable runnable) {
        try {
            while (true) {
                boolean inserted = blockingQueue.offer(runnable);
                if (!inserted) {
                    System.out.println("Limit exceeded");
                    Thread.sleep(1_000);
                } else {
                    return;
                }
            }
            //blockingQueue.put(runnable);
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void shutdown() {
        isShutdown = true;
    }
}
