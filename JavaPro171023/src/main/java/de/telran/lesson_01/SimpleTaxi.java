package de.telran.lesson_01;

public class SimpleTaxi {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "BMW";
        car1.weight = 10;
        car1.color = "красный";
        //car1.countPassenger = 3;
        car1.run();
        car1.transport();
        System.out.println(Car.isEngine);//принадлежит всему классу

        Car car2 = new Car("Audio", 8, "зеленый");
        car2.setCountPassenger(-2);
        car2.run();
        car2.transport();

    }
}
