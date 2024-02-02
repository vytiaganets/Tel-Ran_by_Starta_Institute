package de.telran.lesson20240202summary;

import java.util.Arrays;

public class BoxesBySizeResult {
    private final double averagePriceS;
    private final double averagePriceM;
    private final double averagePriceL;
    private final Box[] sizeS;
    private final Box[] sizeM;
    private final Box[] sizeL;

    public BoxesBySizeResult(double averagePriceS, double averagePriceM, double averagePiceL, Box[] sizeS, Box[] sizeM, Box[] sizeL) {
        this.averagePriceS = averagePriceS;
        this.averagePriceM = averagePriceM;
        this.averagePriceL = averagePiceL;
        this.sizeS = sizeS;
        this.sizeM = sizeM;
        this.sizeL = sizeL;
    }

    public double getAveragePriceS() {
        return averagePriceS;
    }

    public double getAveragePriceM() {
        return averagePriceM;
    }

    public double getAveragePiceL() {
        return averagePriceL;
    }

    public Box[] getSizeS() {
        return sizeS;
    }

    public Box[] getSizeM() {
        return sizeM;
    }

    public Box[] getSizeL() {
        return sizeL;
    }

    @Override
    public String toString() {
        return "BoxesBySizeResult{" +
                "averagePriceS=" + averagePriceS +
                ", averagePriceM=" + averagePriceM +
                ", averagePriceL=" + averagePriceL +
                ", sizeS=" + Arrays.toString(sizeS) +
                ", sizeM=" + Arrays.toString(sizeM) +
                ", sizeL=" + Arrays.toString(sizeL) +
                '}';
    }
}
