public class Tsk1 {

    public static void main(String[] args) {

        int day = 15;

        switch (day) {

            case 1:

            case 2:

            case 3:

            case 4:

            case 5:

                System.out.println("Working day ");

                break;

            case 6:

            case 7:

                System.out.println("Weekend ");

                break;

            default:

                System.out.println("Unknown day ");

        }


        if (day >= 1 && day <= 5) {

            System.out.println("Working day ");


        } else if (day > 5 && day < 8) {

            System.out.println("Weekend ");

        } else {

            System.out.println("Unknown day ");

        }

        String dayOfWeek = day >= 1 && day <= 5 ? "Working day" : day > 5 && day < 8 ? "Weekend" : "Unknown day";

        System.out.println(dayOfWeek);

    }

}









