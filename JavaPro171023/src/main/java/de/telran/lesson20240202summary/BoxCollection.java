package de.telran.lesson20240202summary;

import java.util.Arrays;

public class BoxCollection {
    private int currentSize;
    private double fullPrice;
    private final Box[] boxes;
    private final SizeBox sizeBoxType;
    public BoxCollection(int maxSize, SizeBox sizeBoxType) {
        boxes = new Box[maxSize];
        this.sizeBoxType = sizeBoxType;
    }
    public void append(Box box) {
        if(sizeBoxType != box.getSize()){
            return;
        }
        boxes[currentSize++] = box;
        fullPrice += box.getPrice();
    }
    public double getAveragePrice() {
        return fullPrice / currentSize;
    }
    public Box[] getBoxes() {
        return Arrays.copyOf(boxes, currentSize);
    }
}
