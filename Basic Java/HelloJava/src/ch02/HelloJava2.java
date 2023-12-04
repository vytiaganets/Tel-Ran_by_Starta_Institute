package ch02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class HelloJava2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloJava2");

        //frame.add(new HelloComponent2("Hello, Java!"));
//        HelloComponent2 newObject = new HelloComponent2("Hello, Java!");
        HelloComponent2 newobj = new HelloComponent2(args[0]);
        frame.add(newobj);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

