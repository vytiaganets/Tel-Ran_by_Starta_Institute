//1. Один поток записывает значение переменной, другой считывает
//syncronization - ReentrantLock
// atomic
//volatile быстрое обновление данных
//do nothing --- fast --> задержка
//2. Два потока меняют значение одной переменной на новое
//volatile быстрое обновление данных
//3. Два потока меняют значение одной переменной на основе ее исходного значения
//syncronization - ReentrantLock
// atomic
//BlockingQueve:
//Класс Продьюсер - генерирует сообщения в очередь
//Класс Консьюмер - забирает сообщения из очереди
//Задача - реализовать класс Consumer, который будет анализировать сообщения в очереди и при входящем сообщении "exit" заканчивать работу.
//При реализации можно использовать класс CustomBlockingQueUe в репозитории или одну из стандартных реализаций BlockingQueue из библиотеки.
package de.telran.lesson20240424practice;

public class Task {
    public static void main(String[] args) {

    }
}
