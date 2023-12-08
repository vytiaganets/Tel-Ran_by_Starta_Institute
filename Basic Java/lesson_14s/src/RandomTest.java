import java.util.Random;



public class RandomTest {



    private int case1;

    private int case2;



    public RandomTest(int case1, int case2) {

        this.case1 = case1;

        this.case2 = case2;

    }



    public void print() {



        Random rand1 = new Random();

        int i = rand1.nextInt(100);

        if (i < case1) {

            System.out.println("You are going on a date");

        } else if (i < case2) {

            System.out.println("You are going shopping");

        } else {

            System.out.println("You are staying home");

        }

    }



    public static void main(String[] args) {

        RandomTest randomTest = new RandomTest(80, 85);

        randomTest.print();



    }

} 