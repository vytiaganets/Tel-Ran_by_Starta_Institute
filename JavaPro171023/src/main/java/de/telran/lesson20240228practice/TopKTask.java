////4. Дан список из п товаров. У каждого товара есть название и цена.
////Написать метод для получения списка топ-к самых дешевых товаров, где к - входной параметр.
//sort ---> 0(n log (n) + k) ---> 0(n * log k)
package de.telran.lesson20240228practice;

import java.util.List;
import java.util.Arrays;
import java.util.PriorityQueue;
public class TopKTask {
    public static void main(String[] args) {
        List<Item> itemList = Arrays.asList(new Item("A", 3),
                new Item("B", 1),
                new Item("C", 5),
                new Item("D", 2),
                new Item("E", 2),
                new Item("F", 0));
        List<Item> topItems = getTopK(itemList, 2);
        System.out.println(topItems);
    }
        private static List<Item> getTopK(List<Item> itemList, int k){//O(n * log k)
            ItemMaxPriceComparator comparator = new ItemMaxPriceComparator();
            PriorityQueue<Item> priorityQueue = new PriorityQueue<>(k, comparator); // O(k) ax heap

            //PriorityQueue<Item> priorityQueue = new PriorityQueue<>(k, new ItemComparator());//O(k)
            int i = 0;
            while (i++ < k) {//O(k log k)
                priorityQueue.add(itemList.get(i));
            };
            //System.out.println(priorityQueue);

            while (i++ < itemList.size() - 1) {//O((n-k) * log(k)
                Item top = priorityQueue.peek();
                Item current = itemList.get(i);
                if (
                        comparator.compare(top, current) < 0)
                        //top.compareTo(current > 0)

                {
                    priorityQueue.remove();
                    priorityQueue.add(current);

                }
            }
            return priorityQueue.stream().toList();//O(k)

        }
    }