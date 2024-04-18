//1. Имеется общий счет. Два пользователя раз в 1 сек. кладут 10 $ на этот счет. Реализовать потокобезопасным способом.
//2. В банке имеется два счета. Реализовать потокобезопасным способом:
//- перевод денег со счета A на счет Б
//- извлечение информации о сумме счета A и счета Б
//- извлечение общей суммы на двух счетах
package de.telran.lesson20240417practice;

public class Tasks {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                //   synchronized (bankAccount) {
                bankAccount.deposit(10);
                //    bankAccount.setSum(bankAccount.getSum() + 10);
                //  }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                //   synchronized (bankAccount) {
                bankAccount.deposit(10);
                //      bankAccount.setSum(bankAccount.getSum() + 10);
                //   }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(bankAccount.getSum());
    }
    static class BankAccount {
        private int sum;

        public synchronized int getSum() {
            return sum;
        }

        public synchronized void setSum(int sum) {
            this.sum = sum;
        }

        public synchronized void deposit(int sumDeposit) {
            sum = sum + sumDeposit;
        }
    }
    //200
}