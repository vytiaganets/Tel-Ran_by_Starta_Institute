package org.example;

public class TaxCalculatorService {

    public double getTax(double sellery, int taxClass, int childCount) {
        if (taxClass == 1){
            return sellery * 0.2 - childCount * 250;
        }
        else if (taxClass == 2){
            return sellery * 0.3 - childCount * 300;
        }
        else {
            return sellery * 0.25 - childCount * 275;
        }


    }
}
