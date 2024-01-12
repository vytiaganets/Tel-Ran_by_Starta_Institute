package org.example;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorServiceTest {

    @org.junit.jupiter.api.Test
    void getTaxForClass1() {
        TaxCalculatorService service = new TaxCalculatorService();
        double result = service.getTax(3500, 1, 2);
        assertEquals(200, result);
    }
    @org.junit.jupiter.api.Test
    void getTaxForClass2() {
        TaxCalculatorService service = new TaxCalculatorService();
        double result = service.getTax(5500, 2, 3);
        assertEquals(750, result);
    }
    @org.junit.jupiter.api.Test
    void getTaxForClass3() {
        TaxCalculatorService service = new TaxCalculatorService();
        double result = service.getTax(7500, 3, 5);
        assertEquals(500, result);
    }

}
