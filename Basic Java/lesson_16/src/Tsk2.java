public class Tsk2 {
    public static void main(String[] args) {
        int day = 2;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Working day ");//Working day
                break;
            case 6:
            case 7:
                System.out.println("Weekend ");
                break;
            default:
                System.out.println("Unsupported or unknown day");
        }
        if (day >= 1 && day <= 5) {
            System.out.println("Working day ");//Working day
        } else if (day == 6 || day == 7) {
            System.out.println("Weekend ");
        } else {
            System.out.println("Unsupported or unknown day");
        }
        String dayOfWeek = day >= 1 && day <= 5 ? "Working day " : day == 6 || day == 7 ? "Weekend ": "Unsupported or unknown day";//Working day
        System.out.println(dayOfWeek);
    }
}

