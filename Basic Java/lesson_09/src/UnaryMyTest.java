public class UnaryMyTest {
    public static void main(String[] args) {
        int num = 5;
        int numInc = num++;
        System.out.println("Prev value: " + num++);//Prev value: 6
        System.out.println("Post increment: " + num);//Post increment: 7
        increment(num);
        System.out.println("Updated value: " + num);//Updated value: 7
        System.out.println("Post decrement: " + num);//Post decrement: 7
        decrement(num);
        System.out.println("Updated value: " + num);//Updated value: 7
    }
    public static void increment(int num){
        System.out.println("Pre value from method: " + num++);//Pre value from method: 7
        System.out.println("Post increment: " + num);//Post increment: 6
    }
    public static void decrement(int num){
        System.out.println("Pre value from method: " + num--);//Pre value from method: 7
        System.out.println("Post dec from method: " + num);//Post dec from method: 8
    }
}
