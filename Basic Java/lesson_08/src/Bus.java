public class Bus {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 7;
        findEvenOdd(num1);
        findEvenOdd(num2);
    }

    public static void findEvenOdd(int num) {
        if (num / 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + "is odd");
        }
    }
}