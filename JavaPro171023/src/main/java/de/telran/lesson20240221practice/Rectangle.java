//2. Создать класс Rectangle для хранения данных о прямоугольнике - ширина x, высота y.
//Реализовать возможность добавления Rectangle в HashSet.
package de.telran.lesson20240221practice;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
public class Rectangle {
    private double x;
    private double y;
    public Rectangle(){

    }
    public Rectangle (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Set<Rectangle> set = new HashSet<>();
        Rectangle rectangle1 = new Rectangle(10.00, 20.0);
        Rectangle rectangle2 = new Rectangle(20.00, 40.0);
        Rectangle rectangle3 = new Rectangle();
        Rectangle rectangle4 = new Rectangle();
        set.add(rectangle1);
        set.add(rectangle2);
        set.add(rectangle3);
        set.add(rectangle4);
        System.out.println(set.size());

//        Comparator<Rectangle> comparator = new Comparator<Rectangle>() {
//            @Override
//            public int compare(Rectangle o1, Rectangle o2) {
//                return 0;
//            }
//        };
//
//        comparator = new CompareByX();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Rectangle rectangle = (Rectangle) o;

 //       return Double.compare(y, rectangle.y) == 0 && Double.compare(x, rectangle.x);
        return this.x == rectangle.x && this.y == rectangle.y;
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(x);
        result= result * 31  + Double.hashCode(y);//31 смещение
        return result;
        //return Objects.hash(x,y);
    }
}
