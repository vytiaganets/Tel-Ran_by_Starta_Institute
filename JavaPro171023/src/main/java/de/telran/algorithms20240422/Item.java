package de.telran.algorithms20240422;

public class Item {
    public static final int capacity = 50;
    private int weight;
    private int price;
    private int partition;

    public Item(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPartition() {
        return partition;
    }

    public void setPartition(int partition) {
        this.partition = partition;
    }

    public static void cut(int num) {
    }

    @Override
    public String toString() {
        return "Item{" + "weight=" + weight + ", price=" + price + ", partition=" + partition + '}';
    }
}