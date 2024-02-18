package de.telran.home20240208.exercise3;

import java.util.ArrayList;

public class Cat {
    private String catName;
    private String catColor;
    private int age;

    public Cat(String catName) {
        this.catName = catName;
    }

    public Cat(String catName, String catColor, int age) {
        this.catName = catName;
        this.catColor = catColor;
        this.age = age;
    }

    public String getCatName() {
        return catName;
    }

    public String getCatColor() {
        return catColor;
    }

    public int getAge() {
        return age;
    }
    public static void mergeAllElements(ArrayList<Integer> arrayList) {
        String mergeResult = "";
        for (int i = 0; i < arrayList.size(); i++) {
            mergeResult += arrayList.get(i) + " ";
        }
        System.out.println(mergeResult);
    }
    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                ", catColor='" + catColor + '\'' +
                ", age=" + age +
                '}';
    }
}
