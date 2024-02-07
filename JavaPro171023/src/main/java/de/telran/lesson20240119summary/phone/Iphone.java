package de.telran.lesson20240119summary.phone;
public class Iphone extends Phone {

    String iosVersion;

    public Iphone(String model,
                  String color,
                  int memory,
                  int megaPx,
                  int simCount,
                  String iosVersion) {
        super(model, color, memory, megaPx, simCount);
        this.iosVersion = iosVersion;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "iosVersion='" + iosVersion + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", memory=" + memory +
                ", megaPx=" + megaPx +
                ", simCount=" + simCount +
                '}';
    }
}

//public class Iphone extends Phone {
//    String iosVersion;
//
//    public Iphone() {
//
//    }
//
//    public Iphone(String model, String color, int memory, int megaPx, int simCount, String iosVersion) {
//        super(model, color, memory, megaPx, simCount);
//        this.iosVersion = iosVersion;
//    }
//
//    public Iphone(String model, String color, int memory, int megaPx, int simCount, String iosVersion) {
//        this.iosVersion = iosVersion;
//    }
//
//    public Iphone(String number, String black, int i, int i1, int i2, String number1) {
//    }
//
//    public Iphone(String number, String black, int i, int i1, int i2, String number1) {
//    }
//}
//
