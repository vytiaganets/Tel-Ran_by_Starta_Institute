package de.telran.lesson20240513practice.dependencyinversion;

public class Lamp implements Switchable {
    public void on(boolean b) {
        System.out.println("Lamp is: " + (b ? "on" : "off"));
    }
}