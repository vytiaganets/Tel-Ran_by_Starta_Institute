package de.telran.lesson20240118;

public class SimpleExtends {
    public static void main(String[] args) {
        System.out.println("============Horse=========");
        Horse horse1 = new Horse("Вася", 4, 50, "черная");
        horse1.run();
        horse1.transpots(5);
        System.out.println("============Pegasus=========");

        Pegasus pegasus1 = new Pegasus("Толя", 60, "белый", 2);
        pegasus1.run();
        pegasus1.fly();
        pegasus1.transpots(10.5);

        Pegasus pegasus2 = new Pegasus("Коля", 4, 60, "белый", 2);
        pegasus2.transpots(10);

        System.out.println("============Unicorn=========");
        Unicorn unicorn1 = new Unicorn("Витя", 60, "гнедой", 1);
        unicorn1.run();
        unicorn1.transpots(10);
        unicorn1.butt();

        System.out.println("============UnicornRace=========");
        UnicornRace unicornRace1 = new UnicornRace("Боря", 60, "гнедой", 2, 3);
        unicornRace1.run();
        unicornRace1.butt();
        unicornRace1.transpotsPassenger();
    }
}
