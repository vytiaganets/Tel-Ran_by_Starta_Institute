//1) Вы пришли в отделение банка, в котором обслуживание ведется строго по талончикам, который Вы получаете в автомате при входе.
//При регистрации, Вы обязательно указываете ФИО, год рождения, тип операции который Вам необходимо выполнить в отделении (например
//Консультация, Получение денежных средств, Вложение средств, Открытие депозита, Коммунальные платежи).
//После регистрации - вы получаете номер талончика.
//Обслуживание в банке ведется строго по номеру талончика в порядке их возрастания.
//Создать множество, которое будет обслуживать класс Ticket.
//Подумайте какой тип Set - а вы могли бы использовать для этой задачи.
//Сымитируйте работу отделения банка.
package de.telran.home20240215.bank;
import java.util.*;
public class SimpleBank {
    public static void main(String[] args) {

        Ticket ticket1 = new Ticket(1, "Лиля", "Португальская", 2012, OperationType.DEPOSIT);
        Ticket ticket2 = new Ticket(2, "Наташа", "Итальянская", 2011, OperationType.CONSULTATION);
        Ticket ticket3 = new Ticket(3, "Марина", "Нидерландская", 2000, OperationType.WITHDRAWAL);
        Ticket ticket4 = new Ticket(4, "Мария", "Германская", 2015, OperationType.ACCOUNT_OPENING);
        Ticket ticket5 = new Ticket(5, "Оля", "Английская", 2019, OperationType.COMMUNAL_FEES);
        Ticket ticket6 = new Ticket(6, "Елена", "Итальянская", 2007, OperationType.DEPOSIT);
        Ticket ticket7 = new Ticket(7, "Зина", "Польская", 2004, OperationType.CONSULTATION);
        Ticket ticket8 = new Ticket(8, "Алена", "Американская", 2016, OperationType.WITHDRAWAL);
        Ticket ticket9 = new Ticket(9, "Лина", "Греческая", 2002, OperationType.ACCOUNT_OPENING);
        Ticket ticket10 = new Ticket(10, "Шура", "Французская", 2009, OperationType.COMMUNAL_FEES);

        TreeSet<Ticket> treeSet = new TreeSet<>();
        treeSet.add(ticket1);
        treeSet.add(ticket10);
        treeSet.add(ticket9);
        treeSet.add(ticket2);
        treeSet.add(ticket3);
        treeSet.add(ticket8);
        treeSet.add(ticket7);
        treeSet.add(ticket4);
        treeSet.add(ticket6);
        treeSet.add(ticket5);
        System.out.println(treeSet);
        System.out.println();

        operateLine(treeSet);
        System.out.println(treeSet);
    }

    public static void operateLine(TreeSet<Ticket> treeSet) {
        TreeSet<Ticket> treeSet1 = new TreeSet<>();
        for (Ticket ticket : treeSet) {
            provideBankingServices(ticket);
            treeSet1.add(ticket);
        }
        treeSet.removeAll(treeSet1);
        treeSet1.clear();
    }


    public static void provideBankingServices(Ticket ticket) {
        switch (ticket.getOperationType()) {
            case CONSULTATION:
                System.out.println("Уважаемый клиент: " + ticket.getFirstName() + " " + ticket.getLastName());
                System.out.println("Для " + ticket.getOperationType() + " идите в отдел 1");
                System.out.println();
                break;
            case DEPOSIT:
                System.out.println("Уважаемый клиент: " + ticket.getFirstName() + " " + ticket.getLastName());
                System.out.println("Для " + ticket.getOperationType() + " идите в отдел 2");
                System.out.println();
                break;
            case WITHDRAWAL:
                System.out.println("Уважаемый клиент: " + ticket.getFirstName() + " " + ticket.getLastName());
                System.out.println("Для " + ticket.getOperationType() + " идите в отдел 3");
                System.out.println();
                break;
            case ACCOUNT_OPENING:
                System.out.println("Уважаемый клиент: " + ticket.getFirstName() + " " + ticket.getLastName());
                System.out.println("Для " + ticket.getOperationType() + " идите в отдел 4");
                System.out.println();
                break;
            case COMMUNAL_FEES:
                System.out.println("Уважаемый клиент: " + ticket.getFirstName() + " " + ticket.getLastName());
                System.out.println("Для " + ticket.getOperationType() + " идите в отдел 5");
                System.out.println();
                break;
        }

    }
}
