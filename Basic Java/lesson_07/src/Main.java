public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int num3 = 55;
//        Main main = new Main();
//        System.out.println("Return Object method: " + main.getReturnSum1(2, 2));//Return Object method: 4
//        getSum(num1, num2);
//        int result = getReturnSum(num1, num2);
//        System.out.println("Return method: " + result); //Return method: 15
//        Operation.getSum(num1, num2);
//        Operation operation = new Operation();
//        int resultMin = operation.getMinus(num1, num2);
//        System.out.println("Return method: " + resultMin);//Return method: -5

//        Cat cat = new Cat("Tom", 21);
//        cat.getName();//Cat's name is: Tom
//        int ageCat = cat.getAge();
//        System.out.println("Cat's age is: " + ageCat);//Cat's age is: 21

//        Cat cat = new Cat("Tom", 7);
//        cat.getName();
//        int catAge = cat.getAge();
//        int pension = 15;
//        System.out.println("Cat is " + catAge);
//        System.out.println((pension - catAge) + " years to pension");

        Operation operation = new Operation();
        int resultTwo = operation.getMult(num1, num2);
        int resultThree = operation.getMult(num1, num2, num3);
        System.out.println(num1 + " * " + num2 + "=" + resultTwo);//5 * 10=50
        System.out.println(num1 + " * " + num2 + " * " + num3 + "=" + resultThree);//5 * 10 * 55=2750

    }
//    public static void getSum(int numOne, int numTwo){
//        System.out.println(numOne + numTwo);//15
//    }
//    public static int getReturnSum(int a, int b){
//        return a + b;
//    }
//    public int getReturnSum1(int a, int b){
//        return a + b;
//    }
}

