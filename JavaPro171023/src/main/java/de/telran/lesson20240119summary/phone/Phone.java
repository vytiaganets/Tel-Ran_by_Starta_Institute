package de.telran.lesson20240119summary.phone;

public abstract class Phone {
    String model;
    String color;
    int memory;
    int megaPx;
    int simCount;

    public Phone(String model, String color, int memory, int megaPx, int simCount) {
        this.model = model;
        this.color = color;
        this.memory = memory;
        this.megaPx = megaPx;
        this.simCount = simCount;
    }
}
//public class Phone {
//    String model;
//    String color;
//    int memory;
//    int megaPx;
//    int simCount;
//
//    public Phone() {
//    }
//    public Phone(String model, String color, int memory, int megaPx, int simCount) {
//        this.model = model;
//        this.color = color;
//        this.memory = memory;
//        this.megaPx = megaPx;
//        this.simCount = simCount;
//    }
//}
