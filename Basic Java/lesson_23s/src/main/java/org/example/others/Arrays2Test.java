package main.java.org.example.others;
import java.util.Arrays;
public class Arrays2Test {
    public static void main(String[] args) {
        double[] petrol95prices = {2.1, 2.05, 1.98, 2.01};
        System.out.println(Arrays.toString(petrol95prices));

        double minPrice = Double.MAX_VALUE;
        int minPriceIndex = -1;
        for (int i = 0; i < petrol95prices.length; i++) {
            double price = petrol95prices[i];
            if (price < minPrice) {
                minPrice = price;
                minPriceIndex = i;
            }
        }
        if(minPriceIndex < 0) {
            System.out.println("Нет значений");
        } else {
            System.out.println("Самый дешевый бензин на заправке номер " + (minPriceIndex + 1));
            //[2.1, 2.05, 1.98, 2.01]
            //Самый дешевый бензин на заправке номер 3
        }
}
}
