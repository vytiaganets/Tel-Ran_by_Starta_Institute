package de.telran.lesson20240410practice;

    public interface MyBaseStream<T, S extends MyBaseStream<T, S>> {
        S parallel();
        S sequantial();
//        MyBaseStream<T> parallel();
//        MyBaseStream<T> sequantial();
}
