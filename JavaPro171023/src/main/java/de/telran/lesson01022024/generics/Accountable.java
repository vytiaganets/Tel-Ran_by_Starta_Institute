package de.telran.lesson01022024.generics;

public interface Accountable <T> {
    T getId();
    void setId(T id);
    int getSum();
    void setSum(int sum);

}
