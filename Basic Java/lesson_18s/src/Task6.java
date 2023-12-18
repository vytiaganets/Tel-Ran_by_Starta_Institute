public class Task6 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
//            *
//            **
//            ***
//            ****
//            *****
//            ******
        }
    }
}
