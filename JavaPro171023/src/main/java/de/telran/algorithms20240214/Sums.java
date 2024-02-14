//START
//READ number input: numl, num2, num3
//declare sum
//sum = num1+num2+num3
//print sum
//END

package de.telran.algorithms20240214;

//import java.util.Arrays;
//import java.util.List;
import java.util.Scanner;

public class Sums {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the first number:");
                int num1 = sc.nextInt();
                System.out.println("Enter the second number:");
                int num2 = sc.nextInt();
                System.out.println("Enter the third number:");
                int num3 = sc.nextInt();

                int sum = num1 + num2 + num3;

                System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sum);
                //Enter the first number:
        //1
        //Enter the second number:
        //1
        //Enter the third number:
        //1
        //1 + 1 + 1 = 3

        //JavaScript:
        //function threeNumbersSum() {
        //  let num1 = 1;
        //  // parseInt(prompt('Enter the first number: '));
        //  console.log(`${num1}`);
        //  let num2 = 2;
        //  // parseInt(prompt('Enter the second number: '));
        //  console.log(`${num2}`);
        //  let num3 = 5;
        //  // parseInt(prompt('Enter the third number: '));
        //  console.log(`${num3}`);
        //  let sum = num1 + num2 +num3;
        //  console.log(`${num1} + ${num2} + ${num3} = ${sum}`)
        //}

//                List<Integer> arr = Arrays.asList(1, 4, 8, 0, -2);
//                int num = -4;
//                AtomicInteger counter = new AtomicInteger(-1);
//                arr.stream()
//                        .filter(i -> {
//                            counter.getAndIncrement();
//                            return i == num;
//                        })
//                        .mapToInt(i -> counter.get())
//                        .findFirst()
//                        .orElse(-1);
//
//                System.out.println(counter);

    }
}
