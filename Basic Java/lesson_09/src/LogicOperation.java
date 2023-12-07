public class LogicOperation {
    public static void main(String[] args) {
//        Создайте переменные int a, b, c, d;
//        Используя блок if (выражение) {}, составьте логические выражения
//        истина , если “а” меньше “b” И “b” равно “c”;
//        истина , если “а” больше “b” ИЛИ “c” равно “d”;
//        истина , если “а” НЕ равно “b”;
        int a = 9;
        int b = 4;
        int c = 1;
        int d = 0;
        boolean isTrue = false;

        if ((a < b ) && (b == c )) {
            isTrue = true;
            System.out.println("if1 " + isTrue);
        }
        else if ((a > b) || (c == d))
        {
            isTrue = true;
            System.out.println("else if1 " + isTrue);//else if1 true

        }
        else if (a != b) {
            isTrue = true;
            System.out.println("else if2 " + isTrue);
        }
        else {
            System.out.println("не одно условие не выполнено" + isTrue);
        }
    }
}