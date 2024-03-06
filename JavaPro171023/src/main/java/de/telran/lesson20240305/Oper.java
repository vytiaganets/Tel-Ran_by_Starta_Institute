package de.telran.lesson20240305;

import java.util.function.Function;

class Oper implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return Integer.parseInt(s);
    }
}
