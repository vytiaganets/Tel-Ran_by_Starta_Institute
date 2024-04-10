package de.telran.lesson20240410practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class PECSExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList (1, 2, 3));
        List<Double> doubles = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0));
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0));
        List<Object> objects;
        List<?> list;
        //objects = integers; //error
        list = integers;
        list = doubles;

        //PECS Producer extends - Consumer super
        //Producer extends
        List<? extends Number> numberList;
        numberList = integers;//possible
        //numberList = doubles;//possible
        //numberList = numbers;//possible

       Number numbeer = numberList.get(0);//possible
        //numberList.add(1);//impossible
        printNumbers (integers);
        printNumbers (doubles);
        List<? super Double> listSuper;
        //listSuper = integers; //impossible
        listSuper = doubles;
        listSuper = numbers;

        Object object  = listSuper.get(0);
        listSuper.add(10.0);
        //listSuper.add(10);
        //listSuper.add (new Object));
        addNumbers(doubles);
        doubles.forEach (System.out::println);
        //1
        //2
        //3
        //1.0
        //2.0
        //3.0
        //1.0
        //2.0
        //3.0
        //10.0
    }
    public static void printNumbers(List<? extends Number> numberList) {
        for (Number n : numberList) {
            System.out.println(n);
        }
    }
    public static void addNumbers (List<? super Double> numberList) {
        numberList.add(10.0);
    }
}
