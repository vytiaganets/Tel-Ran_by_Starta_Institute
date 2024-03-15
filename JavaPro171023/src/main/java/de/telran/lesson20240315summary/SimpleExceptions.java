package de.telran.lesson20240315summary;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SimpleExceptions {
    public static void main(String[] args){

        //throw new RuntimeException ("Something went wrong");
//        FileInputStream fileInputStream = null;
//        try {
//        FileInputStream fileInputStream = openFile ("input.txt");
//        } catch (Exception e) {
//            throw new Exception("Something went wrong");
//        }
//        System.out.println(fileInputStream);
//        try {
//            new FileInputStream("input.txt").read();
//        } catch (Exception e) {
//            throw new Exception("Something went wrong");
//        }

    }
    private FileInputStream openFile(String fileName) {
        try {
            return new FileInputStream(fileName);
        } catch (
                FileNotFoundException e) {
            return null;
        }
    }
}
