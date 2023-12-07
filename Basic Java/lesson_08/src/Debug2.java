import java.util.Scanner;

public class Debug2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        checkName(name);
    }
    public static void checkName(String name){
        /*
        * Метод проверяет длину введеного имени
        * имя должно быть трех символов
        * */
        if (name.length() > 3){
            System.out.println("Вас зовут: " + name);
        }
        else {
            System.out.println("Слишком короткое имя");
        }
    }
}
