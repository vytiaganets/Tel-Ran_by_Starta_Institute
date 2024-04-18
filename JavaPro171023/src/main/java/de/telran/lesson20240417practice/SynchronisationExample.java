package de.telran.lesson20240417practice;

import de.telran.lesson20240304practice.Cat;

public class SynchronisationExample {

    static Cat mutex = new Cat("Tom", 3, 2.0, "White");

    public static void main(String[] args) {


        synchronized (mutex) { //  staticMethod()
            System.out.println("Action in main");
        }

        SynchronisationExample example = new SynchronisationExample();
        synchronized (example) { // nonStatciSynchMethod(), nonStatciSynchMethod2()
            System.out.println("Action in main");
        }

        synchronized (SynchronisationExample.class) { // staticSynchMethod()
            System.out.println("Action in main");
        }

    }

    public static void  staticMethod() {
        synchronized (mutex) {
            System.out.println("Action in static method");
        }
    }

    public synchronized void nonStatciSynchMethod() {
        System.out.println("Action in non-static method");
    }

    public void nonStatciSynchMethod2() {
        synchronized (this) {
            System.out.println("Action in non-static method");
        }
    }

    public synchronized static void  staticSynchMethod() {
        System.out.println("Action in static method");
    }

    public static void  staticSynchMethod2() {
        synchronized (SynchronisationExample.class) {
            System.out.println("Action in static method");
        }
    }


}
//Action in main
//Action in main
//Action in main