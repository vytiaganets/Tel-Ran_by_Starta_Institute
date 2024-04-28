package de.telran.lesson20240426practice;

public interface TaskExecutor {
    void submit(Runnable runnable);
    void shutdown();

}
