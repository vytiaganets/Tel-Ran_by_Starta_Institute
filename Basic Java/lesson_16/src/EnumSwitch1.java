//Создайте switch-блок, который мог бы определить, является ли переданный день выходным или рабочим днем.
//
//        Создайте переменные int day; String dayString;
//
//        Используйте объединение для несколько случаев без операторов break
//
//        Реализуйте тот же процесс используя if-else блоки
//
//        Реализуйте тот же процесс используя тернарное выражение
//
//        Сравните решения

public class EnumSwitch1 {

    public enum DayOfWeek {

        MONDAY,

        TUESDAY,

        WEDNESDAY,

        THURSDAY,

        FRIDAY,

        SATURDAY,

        SUNDAY

    }



    public static void main(String[] args) {

        DayOfWeek day = DayOfWeek.THURSDAY;



        switch (day) {

            case MONDAY:

            case TUESDAY:

            case WEDNESDAY:

            case THURSDAY:

            case FRIDAY:

                System.out.println("Working day");

                break;

            case SATURDAY:

            case SUNDAY:

                System.out.println("Weekend");

            default:

                System.out.println("Unsupported value");

        }

    }

}



    Starta Institute 33  to  Everyone 11:45 AM

        EnumSwitch.DayOfWeek d = EnumSwitch.DayOfWeek.SUNDAY;

        switch (d) {

        case MONDAY:

        dayString = "Monday";

        break;

        case TUESDAY:

        dayString = "Tuesday";

        break;

        case WEDNESDAY:

        dayString = "Wednesday";

        break;

        case THURSDAY:

        dayString = "Thursday";

        break;

        case FRIDAY:

        dayString = "Friday";

        break;

        case SATURDAY:

        dayString = "Saturday";

        break;

        case SUNDAY:

        dayString = "Sunday";

        break;

default:

        dayString = "Not defined";

        }

        System.out.println(dayString);