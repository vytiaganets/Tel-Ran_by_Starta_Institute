package de.telran.algorithms20240422;

import java.util.ArrayList;
import java.util.List;

public class TaskOfGreed {
    public static void main(String[] args) {
        Item item1 = new Item(10, 60);
        Item item2 = new Item(20, 100);
        Item item3 = new Item(30, 120);
        List<Item> list = new ArrayList<>();
        list.add(item1);
        if (item1.getWeight() < Item.capacity)
            list.add(item2);
        list.add(item3);
        System.out.println(list);
        System.out.println("Total price " + putIntoPack(list));
    }

    public static double putIntoPack(List<Item> list) {
        int currentCapacity = Item.capacity;
        int totalPrice = 0;
        list.sort((o1, o2) -> o2.getPrice() / o2.getWeight() - o1.getPrice() / o1.getWeight());
        System.out.println("Результат сортировки " + list);
        for (Item item : list) {
            if (item.getWeight() <= currentCapacity) {
                totalPrice = totalPrice + item.getPrice();
                currentCapacity = currentCapacity - item.getWeight();
            } else {
                System.out.println("Current capacity " + currentCapacity);
                item.setPartition(currentCapacity);
                currentCapacity = currentCapacity - item.getPartition();
                System.out.println(" Cutting " + item.getPartition());
                totalPrice = totalPrice;
            }
        }
        return totalPrice;
    }
}
