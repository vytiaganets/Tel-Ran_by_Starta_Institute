import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day number");
        int day = 2;
        String dayString;
        switch (day){
            case 1:
                dayString = "Monday";
                        break;
            case 2:
                dayString = "Tuesday";
                System.out.println(dayString);
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                System.out.println("Unsupported value");
        }

        String myDayString = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Not defined";
        };
        System.out.println(myDayString);
    }
}
