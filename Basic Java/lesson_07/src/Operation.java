public class Operation {

    public static void getSum(int num1, int num2){
        System.out.println("getSum from Operation: " + (num1 + num2));//getSum from Operation: 15
    }
    public int getMinus(int num1, int num2){
        return num1 - num2;
    }
    public int getMult(int num1, int num2){
        return num1 * num2;
    }
    public int getMult(int num1, int num2, int num3){
        return num1 * num2 * num3;
    }

}
