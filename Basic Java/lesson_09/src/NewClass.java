import java.util.Scanner;

public class NewClass {
    //    Создайте переменные int a, b, c, d;
//    Используя блок if (выражение) {}, составьте логические выражения
//    истина , если “а” > “b” И “b” > “c” d -> sum;
//    истина , если “b” больше “a” И “b” > “c” d -> minus ;
//    Иначе d -> mult;
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите а: ");//1
        int a = sc.nextInt();
        System.out.println("Введите b: ");//3
        int b = sc.nextInt();
        System.out.println("Введите c: ");//2
        int c = sc.nextInt();
        int d;
        if ((a > b) && (a > c)) {
            d = a + b + c;
        } else if ((b > a) && (b > c))
        {
            d = a - b - c;
        }
        else{
            d = a * b * c;
        }
        System.out.println("d = " + d);//-4
    }
}