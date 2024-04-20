package de.telran.lesson20240419summary;

public class SyncCountDownJoin implements CountDownJoin {

    private int count;

    public SyncCountDownJoin(int count) {
        this.count = count;
    }

    @Override
    public void countDown() {
        synchronized (this) {
            count--;
            if(count == 0){
                notifyAll();
            }

        }
    }

    @Override
    public void waitWhenZero() {
        synchronized (this) {
            while (count > 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
