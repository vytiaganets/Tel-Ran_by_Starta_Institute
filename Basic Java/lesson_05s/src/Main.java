

public class Main {
    int salary;
    static double taxForAllIt = 0.01;
    final static String MESSAGE = "Hello world!";// константы

    public static void main(String[] args) {
        System.out.println("Calculate tax");
        int salary = 40000;
        double tax = salary * 0.1;
        System.out.println("Налог: " + tax);

    }

    public static void test() {
        int salary = 40000;
    }
}
