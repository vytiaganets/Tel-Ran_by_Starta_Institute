package de.telran.algorithms20240415;

public class ActivityHome {
    private String name;
    private int start;
    private int finish;
    private int price;

    public ActivityHome(String name, int start, int finish, int price) {
        this.name = name;
        this.start = start;
        this.finish = finish;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getFinish() {
        return finish;
    }

    public void setFinish(int finish) {
        this.finish = finish;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}