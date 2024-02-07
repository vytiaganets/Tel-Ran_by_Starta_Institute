package de.telran.lesson20240118;

public class Pegasus extends Horse {
    int countWings;
    public Pegasus() {
    }
    public Pegasus(String name, int weight, String color, int countWings) {
        //super(name, weight, color);
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.countWings = countWings;
    }
    public Pegasus(String name, int countHorseShoe, int weight, String color, int countWings) {
        super(name, countHorseShoe, weight, color);//как инициализировать переменную
//        this.name = name;
//        this.countHorseShoe = countHorseShoe;// нету доступа к приватным полям
//        this.weight = weight;
//        this.color = color;
        this.countWings = countWings;
    }

    public void fly(){
        System.out.println(name + " с весом "+weight+" летит на "+ countWings + " крыльях");//super.name
    }
    @Override
    void transpots(int weight) {
        System.out.println("Пегас по имени " + name + " везет груз " + weight + " на подвесе");
    }
    void transpots(double weight) {
        System.out.println("Пегас по имени " + name + " везет груз " + weight + " на подвесе");
    }
    //переопределенный метод:
    void transpots() {
        System.out.println("Пегас по имени " + name + " везет груз не известного веса");
    }
    //перегруженный метод:
    @Override
    public void run() {
        super.run();
        System.out.println("Новая функция");
    }
}
