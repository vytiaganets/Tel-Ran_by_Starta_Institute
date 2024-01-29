package de.telran.lesson01022024.generics;

public class AccountGenericInt<T> implements Accountable<T> {

    private T id;
    private int sum;

    public AccountGenericInt(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    @Override
    public T getId() {
        return id;
    }

    @Override
    public void setId(T id) {
        this.id = id;
    }

    @Override
    public int getSum() {
        return sum;
    }

    @Override
    public void setSum(int sum) {
        this.sum = sum;
    }
}
