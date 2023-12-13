import java.util.Scanner;

public class Practice02 {
    public enum Day { SUNDAY, MONDAY, TUESDAY,
        WEDNESDAY, THURSDAY, FRIDAY, SATURDAY; }

    public static void main(String[] args) {
        Day day = Day.WEDNESDAY;
        int numLetters = switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                System.out.println(6);
                yield 6;
            case TUESDAY:
                System.out.println(7);
                yield 7;
            case THURSDAY:
            case SATURDAY:
                System.out.println(8);
                yield 8;
            case WEDNESDAY:
                //System.out.println(9);
                yield 9;
            default:
                throw new IllegalStateException("Invalid day: " + day);
        };
        System.out.println(numLetters);

        final int a = 10;
        final int b = 33;
        final int c = 99;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input numbe 1 .. 100");
        int num = sc.nextInt();
        switch (num){
            case a:
            case b:
            case c:
                System.out.println("We are winner!");
                break;
            default:
                System.out.println("Next time you are winner!");
        }

        if(num == a || num == b || num == c){
            System.out.println("We are winner!");
    } else if (num < 1 || num > 100) {
            System.out.println("Number is not correct");
        } else {
            System.out.println("Next time you are winner!");
        }
        String res = num == a || num == b || num == c ? "We are winner!": "Next time you are winner!";
        System.out.println(res);
    }
}
