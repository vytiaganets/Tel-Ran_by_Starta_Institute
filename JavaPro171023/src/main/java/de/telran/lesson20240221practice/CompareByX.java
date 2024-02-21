////3. Создать для класса Rectangle компаратор по ширине x. Создать список прямоугольников и отсортировать его по ширине.
package de.telran.lesson20240221practice;

import java.util.Comparator;

public class CompareByX implements Comparator<Rectangle> {

    //1
//    @Override
//    public int  compare(Rectangle  o1, Rectangle o2){
//        double result = o1.getX() - o2.getY();
//        if(result == 0){
//            return 0;
//        }
//        return result < 0 ? -1 : 1;
//    }

//    2 super
    @Override
    public int compare(Rectangle  o1, Rectangle o2){
        return Double.compare(o1.getX(), o2.getX());
    }

    //3 corect
//    @Override
//    public int compare(Rectangle  o1, Rectangle o2){
//        return ((Double) o1.getX()).compareTo(o2.getX());
//    }
}
