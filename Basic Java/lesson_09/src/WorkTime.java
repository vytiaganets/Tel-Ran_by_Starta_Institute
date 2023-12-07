import java.util.Scanner;

public class WorkTime {
    public static void main(String[] args) {
        int start = 9;
        int offTime = 14;
        int stop = 18;
        int workHours = 8;
        //Scanner sc = new Scanner(System.in);
        //int currentTime = sc.nextInt();
        int currentTime = (int)Math.random();
        if (currentTime == start){
            System.out.println("Working time: " + workHours);
        } else if (currentTime == offTime) {
            System.out.println("It's time to rest! Working time: " + (stop - offTime - 1));
        } else if (currentTime == stop) {
            System.out.println("It's time to go home. Working time: " + (stop -currentTime));
        } else{
            System.out.println("Working time: " + (stop - currentTime));//Working time: 8
        }
    }
}
