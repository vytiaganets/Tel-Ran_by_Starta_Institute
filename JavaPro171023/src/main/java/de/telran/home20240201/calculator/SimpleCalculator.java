// 1. Создайте обобщенный интерфейс для калькулятора, в котором будут объявлен перечень операций, которые умеет делать ваш калькулятор add, sub, multi и div и реализуйте классы, которые будут включать данный интерфейс для работы с различными типами данных аргументов.
package de.telran.home20240201.calculator;

public class SimpleCalculator {
    public static void main(String[] args) {
        FloatOperations floatCalculator = new FloatOperations();
        System.out.println("Add: " + floatCalculator.add(1.5f, 2.0f));//Add: 3.5
        ByteOperations byteCalculator = new ByteOperations();
        byte data = 0b101;//5
        System.out.println(data);
        System.out.println("Add: " + byteCalculator.add((byte) 0b101, (byte) 0b101));//Add: 10
    }
}
