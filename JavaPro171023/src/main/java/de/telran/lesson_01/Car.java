package de.telran.lesson_01;

public class Car {
    static boolean isEngine = true;
    String name;
    String color;
    int weight;
    private int countPassenger;

    public void setCountPassenger(int countPassenger) {
        if (countPassenger >= 0) {
            this.countPassenger = countPassenger;
        } else {
            System.out.println("Ошибочное значение параметра");
        }
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public void run() {
        System.out.println(" Едет авто" + name + " весом" + weight + "  цветом" + color);
    }

    void transport() {
        System.out.println("Авто перевозит пассажиров");
    }

    public Car() {
    }

    public Car(String name, String color, int weight, int countPassenger) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.setCountPassenger(countPassenger);
    }

    public Car(String name, int countPassenger, String color) {
        this.name = name;
        //this.weight = weight;
        this.color = color;
        this.countPassenger = countPassenger;
//        run(5);
    }
//    int run(int count){
//        System.out.println(" Едет авто"+name+ " весом"+weight+"  цветом"+color);
//    }
}
