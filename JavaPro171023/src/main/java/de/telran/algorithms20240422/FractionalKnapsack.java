//Дробный рюкзак
//Учитывая вес и стоимость n предметов, нам нужно положить эти предметы в рюкзак вместимостью W, чтобы получить максимальную общую стоимость в рюкзаке.
//В Fractional Knapsack мы можем разбивать предметы, чтобы максимизировать общую стоимость рюкзака.
//
//Алгоритм:
//Рассчитайте соотношение (стоимость/вес) для каждого элемента.
//Отсортируйте все элементы в порядке убывания соотношения.
//Для каждого элемента применим:
//IF вместимость позволяет
//THEN добавляем,
//ELSE DO вместимость != 0 && >= весу элемента
//THEN режем елемент до значения вместимости

package de.telran.algorithms20240422;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FractionalKnapsack {

    // Учитывая вес и стоимость n предметов, нам нужно положить эти предметы в рюкзак вместимостью maxCapacity,
// чтобы получить максимальную общую стоимость в рюкзаке.
// В Fractional Knapsack мы можем разбивать предметы, чтобы максимизировать общую стоимость рюкзака
    public static void main(String[] args) {
        Item item1 = new Item(10, 60);
        Item item2 = new Item(20, 100);
        Item item3 = new Item(30, 120);
        List<Item> itemList = Arrays.asList(item1, item2, item3);

        int totalPrice = fillFractionalKnapsack(itemList, 50);
        System.out.println("Max price = " + totalPrice);
    }

    public static int fillFractionalKnapsack(List<Item> items, int maxCapacity) {
        // сортировка товаров по стоимости;
        items.sort((o1, o2) -> o2.price/ o2.weight - o1.price / o1.weight);

        List<Item> bag = new ArrayList<>(items.size());
        int totalPrice = 0;
        int currentCapacity = maxCapacity;

        for (Item item : items) {
            if (currentCapacity >= item.weight) {
                // этот груз можно взять целиком
                totalPrice += item.price;
                currentCapacity = currentCapacity - item.weight;
                item.fraction = item.weight;
                bag.add(item);
            } else {
                // предмет нельзя выбрать целиком
                item.fraction = item.weight - (item.weight - currentCapacity);
                totalPrice += (item.price * item.fraction)/item.weight;
                currentCapacity = 0;
                bag.add(item);
                break;
            }
        }
        System.out.println(bag);
        System.out.println("Оставшаяся емкость = " + currentCapacity);

        return totalPrice;
    }

    static class Item{
        int weight;
        int price;
        int fraction;

        public Item(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Item{" + "weight=" + weight + ", price=" + price + ", fraction=" + fraction + '}';
        }
    }

}