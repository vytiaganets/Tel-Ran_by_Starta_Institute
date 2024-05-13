package de.telran.lesson20240513practice.dependencyinversion;

public class DeskLamp implements Switchable {
    public void on(boolean b) {
        System.out.println("Desk lamp is: " + (b ? "on" : "off"));
    }
}