//1. Пользователь с клавиатуры вводит цифру. Вы создаете динамически нужное количество потоков равное
//введенной цифре, нумеруете их и запускаете на выполнение.
//Каждый поток должен выводить свой номер на экран 100 раз с интервалом 100 миллисекунд перед каждым выводом.
//Сделайте так, чтобы главный поток выполнения программы не завершился до окончания работы всех дочерних потоков.
//1. The user enters a number using the keyboard. You create dynamically the required number of threads equal to
//entered number, number them and run them.
//Each thread should print its number to the screen 100 times with an interval of 100 milliseconds before each output.
//Make sure that the main thread of the program does not terminate before all child threads have completed their work.
package de.telran.home20240409;

import java.util.Scanner;

public class SimpleTask1 {
    public static void main(String[] args) {
        startThreads();
        System.out.println("Main thread is done!");
        //Enter count of threads: 3
        //Main thread is done!
    }

    private static void startThreads() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of threads: ");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            Thread thread = new Thread();
            thread.start();
            try {
                thread.join();
            } catch (
                    InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class myThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread No. " + this.getName());
            try {
                sleep(100);
            } catch (
                    InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
