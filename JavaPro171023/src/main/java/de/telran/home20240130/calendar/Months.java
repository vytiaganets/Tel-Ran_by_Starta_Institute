package de.telran.home20240130.calendar;

public enum Months {
    JANUARY("Январь"),
    FEBRUARY("Февраль"),
    MARCH("Март"),
    APRIL("Апрель"),
    MAY("Май"),
    JUNE("Июнь"),
    JULY("Июль"),
    AUGUST("Август"),
    SEPTEMBER("Сентябрь"),
    OCTOBER("Октябрь"),
    NOVEMBER("Ноябрь"),
    DECEMBER("Декабрь");
    private String month;

    Months() {
    }

    Months(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Months{" +
                "month='" + month + '\'' +
                '}';
    }

    public void eating() {
        switch (this) {
            case JANUARY ->
                    System.out.println(month + ": Куриная грудка");
            case FEBRUARY ->
                    System.out.println(month + ": Запеченная рыба");
            case MARCH ->
                    System.out.println(month + ": Отварная говядина");
            case APRIL ->
                    System.out.println(month + ": Отварной бурый рис");
            case MAY ->
                    System.out.println(month + ": Запеченная индейка");
            case JUNE ->
                    System.out.println(month + ": Tушенные овощи");
            case JULY ->
                    System.out.println(month + ": Рыбные котлеты");
            case AUGUST ->
                    System.out.println(month + ": Запеченная рыба");
            case SEPTEMBER ->
                    System.out.println(month + ": Салат из овощей");
            case OCTOBER ->
                    System.out.println(month + ": Kуриная грудка");
            case NOVEMBER ->
                    System.out.println(month + ": Tушеная брокколи");
            case DECEMBER ->
                    System.out.println(month + ": Tушеная брокколи");
            default ->
                    System.out.println(month + ": Запеченная рыба");
        }
    }
}
