package de.telran.home20240215.restaurant;

public enum NameOfJuice {
    GRAPE_JUICE ("Виноградный сок"),
    BIRCH_JUICE ("Березовый сок"),
    CHERRY_JUICE ("Вишневый сок"),
    APPLE_JUICE ("Яблочный сок"),
    PEACH_JUICE ("Персиковый сок"),
    ORANGE_JUICE ("Апельсиновый сок"),
    TANGERINE_JUICE ("Мандариновый сок"),
    POMEGRANATE_JUICE ("Гранатовый сок"),
    APRICOT_JUICE ("Абрикосовый сок"),
    TOMATO_JUICE ("Томатный сок");


    NameOfJuice() {
    }
    private String name;

    NameOfJuice(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return  name;
    }
}
