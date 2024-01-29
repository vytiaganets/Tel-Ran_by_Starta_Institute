package de.telran.lesson01022024.generics;

public class AccountString implements Accountable<String>{
    private String id;
    private int sum;

    public AccountString(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {

    }


    @Override
    public int getSum() {
        return sum;
    }

    @Override
    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "AccountInt{" +
                "id=" + id +
                ", sum=" + sum +
                '}';
    }
}
