package de.telran.lesson20240229module3;

import java.util.function.*;

public class SimpleStandartFuncInterface {
    public static void main(String[] args) {
        //void accept(T t);
        Consumer<Integer> cons = (x) -> System.out.println("Our value - " + x * x);
        cons.accept(12);//144
        cons = (x) -> System.out.println("Our new value - " + x);
        cons.accept(12);//12
        //void accept(T t, U u);
        BiConsumer<Integer, Double> biConsumer = (x1, x2) -> System.out.println("Sum: " + (x1 + x2));//32.0
        BiConsumer<Integer, Byte> biConsumer2 = (x1, x2) -> System.out.println("Sum: " + (x1 + x2));//32.0
        biConsumer2.accept(10, (byte) 1010);

        IntConsumer intConsumer = (x) -> System.out.println("Our ConsumerInt value: " + x);
        intConsumer.accept(22);

        //boolean test(T t);
        Predicate<Integer> predicate = (x) -> x % 2 == 0;
        System.out.println(predicate.test(22));
        predicate = (x) -> {
            boolean res = x % 3 == 0;
            return res;
        };
        System.out.println(predicate.test(22));//false

        //boolean test(T t, U u)
        BiPredicate<Integer, Integer> biPredicate = (x1, x2) -> x1 > x2;
        System.out.println(biPredicate.test(8, 12));// false

        //R apply(T t);
        Function<Integer, Double> function = (x) -> x * 2.0;
        System.out.println(function.apply(5));//10.0

        BiFunction<Integer, Double, Double> biFunction = (x1,x2) -> x1/x2;
        System.out.println(biFunction.apply(5,2.0));//2.5

        //T get();
        Supplier<Double> supplier = () -> Math.sqrt(9);
        System.out.println(supplier.get());//3.0

    }
}
