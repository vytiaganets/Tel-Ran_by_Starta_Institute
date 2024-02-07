package de.telran.lesson20240201.generics;

public interface Accountable <T> {
    T getId();
    void setId(T id);
    int getSum();
    void setSum(int sum);

}
