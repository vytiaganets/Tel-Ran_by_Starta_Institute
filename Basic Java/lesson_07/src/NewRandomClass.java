import java.util.Random;

public class NewRandomClass {
    public static void main(String[] args) {
        Random rand1 = new Random();
        int bound = 99;
        int random = rand1.nextInt();
        int random1 = rand1.nextInt(bound);
//        System.out.println(random);//1130697981
//        System.out.println(random1);//70
        double num1 = Math.random();//0.7203512769359097
        //System.out.println(num1);
        int minNum = 200;
        int maxNum = 999;
        int ourNum = (int)(num1 * (maxNum - minNum + 1) + minNum);
        System.out.println(ourNum);//495
    }
}
