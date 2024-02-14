package de.telran.algorithms20240214;

public class O {
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {//O(n)
            for (int j = 0; j < 1; j++) {//O(n)
            }
        }//O(n*n)=O(n**2)=O(n^2);
        for (int i = 0; i < 1; i++) {
        }//O(n)
        for (int j = 0; j < 1; j++) {
        }//O(n)
        //O(n+n)=O(2n)=O(n)
    }

    public static int sum(int one, int two) {//сложить два числа: О(1)
        int result = one + two; // cost = 1 + 1
        return result; // cost = 1
    }
}
//Приведите время выполнения «О-большое» для каждого из следующих сценариев.
//1.3 Известна фамилия, нужно найти номер в телефонной книге. O(log n)
//1.4 Известен номер, нужно найти фамилию в телефонной книге. O(n)
//1.5 Нужно прочитать телефоны всех людей в телефонной книге. O(n)
//1.6 Нужно прочитать телефоны всех людей, фамилии которых начинаются с буквы «А».O(n)