import java.io.PrintStream;

public class Money {
    //
//            *Дополнительная практика(не обязательное)
//    Создайте метод, который будет считать сколько денег получает работник в неделю. Метод должен принимать на входе два аргумента (зарплата в час, кол-во проработанных часов).
//
//    Каждый час после 40 считается за полтора.
//    Работник не может работать больше, чем 60 часов в неделю.
//    Работник не может получать меньше 8 долларов в час.
    public static void main(String[] args) {
        salary(12, 10);//зарплата в час: 12,	 кол-во проработанных часов: 10,	 получает работник в неделю: 120.0	 долларов
        salary(4, 24);//зарплата в час: 8,	 кол-во проработанных часов: 24,	 получает работник в неделю: 192.0	 долларов
        salary(42, 75);//зарплата в час: 42,	 кол-во проработанных часов: 70,	 получает работник в неделю: 2940.0	 долларов
    }

    private static void salary(double salaryHours, double hours) {
        if (hours > 60) {
            hours = 60;
        }
        if (hours > 40) {
            hours = 40 + (hours - 40) * 1.5;
        }

        if (salaryHours < 8) {
            salaryHours = 8;
        }
        PrintStream ps = null;
        try {
            System.out.println("зарплата в час: " + (int)salaryHours + "," + "\t кол-во проработанных часов: " + (int)hours + "," + "\t получает работник в неделю: " + (salaryHours * hours) + "\t долларов ");
            // file salary.txt
            ps = new PrintStream("salary.txt", "UTF-8");
            ps.print(String.format("salary: %.2f hours: % .0f  result: %.2f", salaryHours, hours, (salaryHours * hours)));
        } catch (
                Exception e) {
            throw new RuntimeException("File Error");
        } finally {
            ps.close();
        }
    }
}
