package de.telran.lesson20240315summary;

import java.util.function.Function;

public class Box<T> {
    private final T element;

    public Box(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }
    public <K> Box<K> map(Function<T, K> function){
        K elementK = function.apply(element);
        return new Box<K>(elementK);
    }

    public<K> Box<K> flatMap(Function<T, Box<K>> boxFunction){
        Box<K> boxK = boxFunction.apply(element);
        return boxK;
        //return boxFunction.apply(element);
    }

    @Override
    public String toString() {
        return "Box{" +
                "element=" + element +
                '}';
    }
}
