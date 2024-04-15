package de.telran.lesson20240412summary;

public class InterruptThread extends Thread {
    private int count;
    private int countStop;
    private Runnable runnable;

    public InterruptThread(int countStop, Runnable runnable) {
        this.count = 0;
        this.countStop = countStop;
        this.runnable = runnable;
    }

    @Override
    public void run() {
        runnable.run();
    }

    @Override
    public void interrupt() {
        count++;
        if (count >= countStop) {
            super.interrupt();
        }
    }
}