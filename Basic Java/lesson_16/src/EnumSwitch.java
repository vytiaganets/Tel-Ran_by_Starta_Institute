public class EnumSwitch {
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
        DayOfWeek day = DayOfWeek.FRIDAY;//Working day
        String s = "new String()";
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Working day");
                break;
            case FRIDAY:
                System.out.println("Working day");//Working day
                break;
            case SATURDAY:
                System.out.println("Weekend");
                break;
            case SUNDAY:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Unsupported value");
        }
    }
}

