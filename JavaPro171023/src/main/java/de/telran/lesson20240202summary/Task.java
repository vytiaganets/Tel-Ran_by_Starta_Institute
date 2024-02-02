/**
 * 1. Лента в магазине
 * У нас есть набор коробок разных типов, в которых может быть:
 * 1. Одежда
 * 2. Электроника
 * 3. Остальное
 * У каждой коробки есть объявленная ценность и размер (S, M, L).
 * Нам нужно написать метод, который:
 * 1) разложит коробки на три части в зависимости от размера
 * 2) посчитает среднюю объявленную ценность для каждого размера коробки.
 */

package de.telran.lesson20240202summary;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        BoxesBySizeResult boxesBySizeResult = splitBoxBySize(new Box[]{
                new Box(10, SizeBox.S),
                new Box(15, SizeBox.S),
                new Box(20, SizeBox.M),
                new Box(25, SizeBox.M),
                new Box(30, SizeBox.L),
                new Box(40, SizeBox.L)
        });
        System.out.println(boxesBySizeResult);
    }

    static BoxesBySizeResult splitBoxBySize(Box[] boxes) {
        BoxCollection smallCollection = new BoxCollection(boxes.length, SizeBox.S);
        BoxCollection mediumCollection = new BoxCollection(boxes.length, SizeBox.M);
        BoxCollection largeCollection = new BoxCollection(boxes.length, SizeBox.L);

        for (Box box : boxes) {
            smallCollection.append(box);
            mediumCollection.append(box);
            largeCollection.append(box);
        }
        return new BoxesBySizeResult(smallCollection.getAveragePrice(), mediumCollection.getAveragePrice(), largeCollection.getAveragePrice(), smallCollection.getBoxes(), mediumCollection.getBoxes(), largeCollection.getBoxes());
    }
}
