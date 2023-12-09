import java.io.FileWriter;
import java.io.PrintStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Money {
    //
//            *Дополнительная практика(не обязательное)
//    Создайте метод, который будет считать сколько денег получает работник в неделю. Метод должен принимать на входе два аргумента (зарплата в час, кол-во проработанных часов).
//
//    Каждый час после 40 считается за полтора.
//    Работник не может работать больше, чем 60 часов в неделю.
//    Работник не может получать меньше 8 долларов в час.
    public static void main(String[] args) {
//        salary(12, 10);//зарплата в час: 12,	 кол-во проработанных часов: 10,	 получает работник в неделю: 120.0	 долларов
//        salary(4, 24);//зарплата в час: 8,	 кол-во проработанных часов: 24,	 получает работник в неделю: 192.0	 долларов
//        salary(42, 75);//зарплата в час: 42,	 кол-во проработанных часов: 70,	 получает работник в неделю: 2940.0	 долларов
        String salary = (String) salary(12, 10);
        String salary2 = (String) salary(4, 24);
        String salary3 = (String) salary(42, 75);
        JFrame frame = new JFrame(salary);
        JFrame frame2 = new JFrame(salary);
        JFrame frame3 = new JFrame(salary);
        frame.add(new Component(salary));
        frame.add(new Component(salary2));
        frame.add(new Component(salary3));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    private static String salary(double salaryHours, double hours) {
        if (hours > 60) {
            hours = 60;
        }
        if (hours > 40) {
            hours = 40 + (hours - 40) * 1.5;
        }

        if (salaryHours < 8) {
            salaryHours = 8;
        }
        //PrintStream ps = null;
        try (FileWriter wr = new FileWriter("mysalary.txt", true)) {
            //System.out.println("зарплата в час: " + (int)salaryHours + "," + "\t кол-во проработанных часов: " + (int)hours + "," + "\t получает работник в неделю: " + (salaryHours * hours) + "\t долларов ");
            /*зарплата в час: 12,	 кол-во проработанных часов: 10,	 получает работник в неделю: 120.0	 долларов
            зарплата в час: 8,	 кол-во проработанных часов: 24,	 получает работник в неделю: 192.0	 долларов
            зарплата в час: 42,	 кол-во проработанных часов: 70,	 получает работник в неделю: 2940.0	 долларов*/
            //ps = new PrintStream("salary.txt", "UTF-8");//create file salary.txt
            //ps.print(String.format("salary: %.2f hours: % .0f  result: %.2f", salaryHours, hours, (salaryHours * hours)));//salary: 42,00 hours:  70  result: 2940,00
            wr.write("зарплата в час: " + (int) salaryHours + "," + "\t кол-во проработанных часов: " + (int) hours + "," + "\t получает работник в неделю: " + (salaryHours * hours) + "\t долларов \n\n");
            return ("зарплата в час: " + (int) salaryHours + "," + "\t кол-во проработанных часов: " + (int) hours + "," + "\t получает работник в неделю: " + (salaryHours * hours) + "\t долларов");
        } catch (
                Exception e) {
            throw new RuntimeException("File Error");
        }
    }
}
