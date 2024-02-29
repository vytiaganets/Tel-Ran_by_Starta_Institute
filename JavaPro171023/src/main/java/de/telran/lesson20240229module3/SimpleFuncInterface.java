package de.telran.lesson20240229module3;

import java.util.Map;
import java.util.TreeMap;

public class SimpleFuncInterface {

    public static void main(String[] args) {
        MyOperation op = new Calc();
        System.out.println(op.operation(10, 12));
        //op.meethod1 недоступен
        op.print();//переопределенный метод, но не defaul
        Calc calc = new Calc();
        System.out.println(calc.operation(1, 3));
        calc.method1();
        calc.print();//переопределенный метод

        System.out.println(sum(10, op, 5, 6));//x1+x2  21

        MyOperation op1 = new MyOperation() {
            @Override
            public int operation(int x, int y) {
                return x - y;
            }
        };
        System.out.println(sum(10, op1, 5, 6));//x1 - x2 9

        //System.out.println(sum(10, new Multi(), 5, 6));//x1 * x2 40

        MyOperation op2 = (x1, x2) -> {return x2/x1;};


        System.out.println("sum(10, op2, 5, 6)" + sum(10, op2, 5, 6));//лямбда выражение

        System.out.println("sum(10, (x1, x2) -> {return x1%x2;}, 5, 6)" + sum(10, (x1, x2) -> {return x1%x2;}, 5, 6));//лямбда выражение 15

        MyOperation op3 = (x1, x2) ->{
            int sum = x1 + x2;
            return sum;
        };//лямбда выражение многострочного кода

        System.out.println(sum(10, op3, 5, 6));
        //Работа c Map
        Map<Integer, MyOperation> map1 = new TreeMap<>();
        map1.put(1, (x1, x2) -> {return x1 % x2;});
        map1.put(2, (x1, x2) -> {return x1 + x2;});

        MyOperation opMap = map1.get(1);
        System.out.println("opMap.operation(7, 3): " + opMap.operation(7, 3));//1
        System.out.println("map1.get(2).operation(10,33): " + map1.get(2).operation(10,33));//43
        //Другой интрфейс Void
        MyVoid myVoid = () -> System.out.println("Я вывожусь на принтер");
        myVoid.print();

        myVoid = () ->{
            System.out.println("Я вывожусь на принтер");
            System.out.println("Я вывожусь на consol");
        };
        myVoid.print();
    }
    static int  sum(int k, MyOperation op, int x1, int x2){
        int sumL = k + op.operation(x1, x2);
        return sumL;
    }
}
@FunctionalInterface
interface MyOperation {
    int operation(int x, int y);
//void met1();//только один абстрактный метод
    default void print() {//реализация по умолчанию
        System.out.println("Default print");
    }
}

class Calc implements MyOperation {
    @Override
    public int operation(int x, int y) {
        return x + y;
    }

    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void print() {
        //MyOperation.super.print();
        System.out.println("Calc pint");
    }
}
@FunctionalInterface
interface MyVoid {
    void print();
}