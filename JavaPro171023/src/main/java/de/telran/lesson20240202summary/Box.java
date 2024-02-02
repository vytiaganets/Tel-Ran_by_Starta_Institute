package de.telran.lesson20240202summary;

public class Box {
    private int price;
    private SizeBox size;
    public Box(int price, SizeBox size){
        this.price = price;
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public SizeBox getSize() {
        return size;
    }

    public void setSize(SizeBox size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Box{" +
                "price=" + price +
                ", size=" + size +
                '}';
    }
}
