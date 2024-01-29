package de.telran.home20240116;
import de.telran.home20240116.module1.lecture1.module1.lecture1.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Bob", 19);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();


        Phone phone1 = new Phone("+498934719873","iPhone 5 ", 50);
        Phone phone2 = new Phone("+494635863501","Samsung 12 ", 75);
        Phone phone3 = new Phone("+496586067063","iPhone 12 ", 60);

        phone1.printVariable("phone1");
        phone2.printVariable("phone2");
        phone3.printVariable("phone3");

        System.out.println();

        phone1.receiveCall("Bob");
        phone2.receiveCall("Rob");
        phone3.receiveCall("Tob");

        System.out.println();

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
    }
}
