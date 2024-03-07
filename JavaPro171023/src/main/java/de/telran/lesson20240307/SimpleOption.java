package de.telran.lesson20240307;

import java.util.Arrays;
import java.util.Optional;

public class SimpleOption {
    public static void main(String[] args) {

        String str = null;
        if (str != null && !str.isEmpty()) {//for method getData() necessary of check
            str.length();
        }
        str = getData();
        //str.length();
        //str = getDataOptional().get(); // null
        str = getDataOptional().orElse("");//method getDataOptional()
        String[] arrStr = new String[10];
        arrStr[1] = "String";
        System.out.println(Arrays.toString(arrStr));
        for (String el : arrStr) {
            //el.length(); //error
            Optional<String> strOpt = Optional.ofNullable(el);
            strOpt.orElse("").length();
        }
    }
    private static String getData() {
        String str = null;
        return str;
    }
    private static Optional<String> getDataOptional() {
        String str = null;
        return Optional.ofNullable(null);
    }
}